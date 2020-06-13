package doova.fitgoal;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import maes.tech.intentanim.CustomIntent;

public class UserExercisesFragment extends Fragment{

    private ArrayList<UserExercisesData> Workout_Selected = new ArrayList<>();

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    public void onResume() {
        super.onResume();
        BackendTask_Uexercises backendTask_display = new BackendTask_Uexercises(getContext());
        backendTask_display.execute("display_exercises");
        Workout_Selected = backendTask_display.getData();

        //recyclerView = getActivity().findViewById(R.id.User_Exercise_RecyclerView);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(getActivity());
        adapter = new UserExercisesAdapter(getContext(), Workout_Selected);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.user_exercises_fragment, container, false);

        setHasOptionsMenu(true);

        //getExercises();

        BackendTask_Uexercises backendTask_display = new BackendTask_Uexercises(getContext());
        backendTask_display.execute("display_exercises");
        Workout_Selected = backendTask_display.getData();

        recyclerView = view.findViewById(R.id.User_Exercise_RecyclerView);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(getActivity());
        adapter = new UserExercisesAdapter(getContext(), Workout_Selected);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);

        inflater.inflate(R.menu.exercise_routine_menu, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.action_addRoutine:
                Intent intent = new Intent(getContext(), Exercise_NameList.class);
                startActivity(intent);
                CustomIntent.customType(getContext(), "left-to-right");
        }

        return super.onOptionsItemSelected(item);
    }

    private void getExercises(){
        Bundle bundle = getArguments();

        if(bundle != null) {
            String workout_name = bundle.getString("workout name");
            int workout_image = bundle.getInt("workout image");
            UserExercisesData exercisesData = new UserExercisesData(workout_name, workout_image);
            Workout_Selected.add(exercisesData);
            adapter.notifyItemInserted(Workout_Selected.size());
        }
    }
}
