package doova.fitgoal;

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

public class UserRoutineFragment extends Fragment implements UserRoutine_Dialog.UserRoutineDialogListener{

    private ArrayList<String> selected_Exercises = new ArrayList<>();

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;

    @Override
    public void sendInput(ArrayList<String> exercises_clicked) {
        ArrayList<String> exercises = new ArrayList<>();
        //To properly display exercises chosen to user
        for(int i = 0; i < exercises_clicked.size(); i++){

            if(i == exercises_clicked.size()-1  && exercises_clicked.size() != 1){
                exercises.add("and " + exercises_clicked.get(i));
                break;
            }
            exercises.add(exercises_clicked.get(i));
        }

        //Adds comma between every element in arraylist while concatenating them
        String joined_entries = String.join(", ", exercises);

        BackendTask_Uroutine backendTask_add = new BackendTask_Uroutine(getContext());
        backendTask_add.execute("add_routine", joined_entries);
        selected_Exercises = backendTask_add.getTargeted_muscle();

        selected_Exercises.add(joined_entries);

        adapter.notifyItemInserted(selected_Exercises.size());
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.user_routine_fragment, container, false);

        setHasOptionsMenu(true);

        BackendTask_Uroutine backendTask_display = new BackendTask_Uroutine(getContext());
        backendTask_display.execute("display_routine");
        adapter = new UserRoutineAdapter(getContext(), selected_Exercises);

        recyclerView = view.findViewById(R.id.UserRoutine_Recycler);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getActivity());

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
                showDialog();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void showDialog(){
        UserRoutine_Dialog routineDialog = new UserRoutine_Dialog();
        routineDialog.setTargetFragment(UserRoutineFragment.this, 1);
        routineDialog.show(getFragmentManager(), "Routine Dialog");
    }
}
