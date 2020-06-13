package doova.fitgoal;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Muscle_Exercises_Forearms extends AppCompatActivity {

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
        actionBar.setTitle("Forearms Exercises");

        ForearmExercises();
        buildRecycler();
    }

    private void buildRecycler(){
        layoutManager = new LinearLayoutManager(this);
        adapter = new Muscle_Exercises_Adapter(this, muscle_exercises_info);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void ForearmExercises(){
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.barbell_behind_the_back_wrist_curl,
                "Barbell Behind the Back Wrist Curl",
                "Wrist Flexors"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.behind_the_back_smith_machine_wrist_curl,
                "Behind the Back Smith machine Wrist Curl",
                "Wrist Flexors"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.dumbbell_one_arm_reverse_wrist_curl,
                "Dumbbell One Arm Reverse Wrist Curl",
                "Wrist Extensors"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.seated_dumbbell_wrist_curl,
                "Seated Dumbbell Wrist Curl",
                "Wrist Flexors"));
    }
}
