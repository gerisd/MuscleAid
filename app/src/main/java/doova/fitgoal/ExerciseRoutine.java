/**
 * ExerciseRoutine is the fragment for Exercise, which is the activity for onclick in Homepage
 * Need action bar add, possible delete
 * Need a dialog fragment to attain user information to place into this fragment
 */

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

public class ExerciseRoutine extends Fragment implements ExerciseRoutine_Dialog.RoutineDialogListener{

    private ArrayList<ExerciseRoutine_Information> Routine_information = new ArrayList<>();

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;

    @Override
    public void sendInput(String name, String split) {

        //BackendTask_Eroutine backendTask_add = new BackendTask_Eroutine(getContext());
        //backendTask_add.execute("add_eRoutine", name, split);

        //Routine_information = backendTask_add.getRoutineList();

        Routine_information.add(new ExerciseRoutine_Information(name, split));

        adapter = new ExerciseRoutineAdapter(getContext(), Routine_information);

        BackendTask_Eroutine backendTask_add = new BackendTask_Eroutine(getContext());
        backendTask_add.execute("add_eRoutine", name, split);

        adapter.notifyItemInserted(Routine_information.size());
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onResume() {
        super.onResume();
        BackendTask_Eroutine backendTask_display = new BackendTask_Eroutine(getContext());
        backendTask_display.execute("display_eRoutine");
        //Routine_information = backendTask_display.getRoutineList();

        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getActivity());
        adapter = new ExerciseRoutineAdapter(getContext(), Routine_information);
        //adapter = new ExerciseRoutineRVAdapter(getContext(), Routine_information);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.exercise_routine_fragment, container, false);

        //Report that this fragment would like to participate in populating the options menu by
        //receiving a call to onCreateOptionsMenu(Menu, MenuInflater) and related methods.
        //If true, the fragment has menu items to contribute.
        setHasOptionsMenu(true);

        BackendTask_Eroutine backendTask_display = new BackendTask_Eroutine(getContext());
        Routine_information = backendTask_display.getRoutineList();

        recyclerView = view.findViewById(R.id.ExerciseRoutine_Recycler);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        backendTask_display.execute("display_eRoutine");

        adapter = new ExerciseRoutineAdapter(getContext(), Routine_information);
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

        switch(item.getItemId()){

            case R.id.action_addRoutine:
                showDialog();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void showDialog(){
        ExerciseRoutine_Dialog routineDialog = new ExerciseRoutine_Dialog();
        routineDialog.setTargetFragment(ExerciseRoutine.this, 1);
        routineDialog.show(getFragmentManager(), "Routine Dialog");
    }
}
