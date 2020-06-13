package doova.fitgoal;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Muscle_Exercises_Biceps extends AppCompatActivity{

    private ArrayList<Muscle_Exercises_Info> muscle_exercises_info = new ArrayList<>();

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.muscle_exercises);

        recyclerView = findViewById(R.id.Muscle_Exercise_RecyclerView);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Biceps Exercises");

        BicepExercises();
        buildRecycler();
    }

    private void buildRecycler(){
        layoutManager = new LinearLayoutManager(this);
        adapter = new Muscle_Exercises_Adapter(this, muscle_exercises_info);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void BicepExercises(){
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.barbell_curl,
                "Barbell Curl",
                "Biceps Brachii (Short Head), Biceps Brachii (Long Head), Brachialis, Brachioradialis"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.barbell_reverse_curl,
                "Barbell Reverse Curl",
                "Biceps Brachii, Brachialis, Brachioradialis"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.cable_curl,
                "Cable Curl",
                "Biceps Brachii, Brachialis, Brachioradialis"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.cable_overhead_biceps_curl,
                "Cable Overhead Biceps Curl",
                "Biceps Brachii, Brachialis"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.cable_preacher_curl,
                "Cable Preacher Curl",
                "Biceps Brachii (Short Head), Biceps Brachii (Long Head), Brachialis, Brachioradialis"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.dumbbell_alternate_biceps_curl,
                "Dumbbell Alternate Biceps Curl",
                "Biceps Brachii (Short Head), Biceps Brachii (Long Head), Brachialis, Brachioradialis"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.dumbbell_concentration_curl,
                "Dumbbell Concentration Curl",
                "Biceps Brachii (Short Head), Biceps Brachii (Long Head), Brachialis, Brachioradialis"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.dumbbell_cross_body_hammer_curl,
                "Dumbbell Cross Body Hammer Curl",
                "Biceps Brachii (Short Head), Biceps Brachii (Long Head), Brachialis, Brachioradialis"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.dumbbell_hammer_curl,
                "Dumbbell Hammer Curl",
                "Biceps Brachii, Brachialis, Brachioradialis"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.dumbbell_hammer_peacher_curl,
                "Dumbbell Hammer Preacher Curl",
                "Biceps Brachii, Brachialis, Brachioradialis"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.dumbbell_preacher_curl,
                "Dumbbell Preacher Curl",
                "Biceps Brachii, Brachialis, Brachioradialis"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.dumbbell_reverse_curl,
                "Dumbbell Reverse Curl",
                "Biceps Brachii, Brachialis, Brachioradialis"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.dumbbell_reverse_grip_concentration_curl,
                "Dumbbell Reverse Grip Concentration Curl",
                "Biceps Brachii (Short Head), Biceps Brachii (Long Head), Brachialis, Brachioradialis"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.dumbbell_reverse_preacher_curl,
                "Dumbbell Reverse Preacher Curl",
                "Biceps Brachii (Short Head), Biceps Brachii (Long Head), Brachialis, Brachioradialis"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.ez_bar_curl,
                "EZ Bar Curl",
                "Biceps Brachii (Short Head), Biceps Brachii (Long Head), Brachialis, Brachioradialis"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.ez_bar_reverse_curl,
                "EZ Bar Reverse Curl",
                "Biceps Brachii, Brachialis, Brachioradialis"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.incline_dumbbell_curl,
                "Incline Dumbbell Curl",
                "Biceps Brachii (Short Head), Biceps Brachii (Long Head), Brachialis, Brachioradialis"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.overhead_cable_curl,
                "Overhead Cable Curl",
                "Biceps Brachii, Brachialis"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.prone_incline_barbell_curl,
                "Prone Incline Barbell Curl",
                "Biceps Brachii (Short Head), Biceps Brachii (Long Head), Brachialis, Brachioradialis"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.standing_dumbbell_preacher_curl,
                "Standing Dumbbell Preacher Curl",
                "Biceps Brachii, Brachialis, Brachioradialis"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.weight_plate_reverse_curl,
                "Weighted Plate Reverse Curl",
                "Biceps Brachii, Brachialis, Brachioradialis"));
    }
}
