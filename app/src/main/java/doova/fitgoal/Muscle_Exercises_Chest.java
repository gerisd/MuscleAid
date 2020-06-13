package doova.fitgoal;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Muscle_Exercises_Chest extends AppCompatActivity {

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
        actionBar.setTitle("Chest Exercises");

        ChestExercises();
        buildRecycler();
    }


    private void buildRecycler(){
        layoutManager = new LinearLayoutManager(this);
        adapter = new Muscle_Exercises_Adapter(this, muscle_exercises_info);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void ChestExercises(){
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.assisted_triceps_dip,
                "Assisted Tricep Dip",
                "Pectoralis Major, Triceps Brachii, Anterior Deltoid, Latissimus Dorsi, Levator Scapulae"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.barbell_bench_press,
                "Barbell Bench Press",
                "Pectoralis Major (Upper and Lower), Triceps Brachii, Anterior Deltoid"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.cable_bench_press,
                "Cable Bench Press",
                "Pectoralis Major, Triceps Brachii, Anterior Deltoid"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.cable_cross_over,
                "Cable Cross Over",
                "Pectoralis Major (Upper and Lower), Biceps Brachii (Short head), Anterior Deltoid"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.cable_fly,
                "Cable Fly",
                "Pectoralis Major (Upper and Lower), Biceps Brachii (Short head), Anterior Deltoid"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.cable_incline_fly,
                "Cable Incline Fly",
                "Upper Pectoralis Major, Biceps Brachii (Short head), Anterior Deltoid"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.decline_barbell_bench_press,
                "Decline Barbell Bench Press",
                "Pectoralis Major (Upper and Lower), Triceps Brachii, Biceps Brachii (Short head), Anterior Deltoid"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.decline_barbell_pullover,
                "Decline Barbell Pullover",
                "Lower Pectoralis Major, Triceps Brachii (Long head), Posterior Deltoid," +
                        "Latissiums Dorsi, Teres Major, Levator Scapulae"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.decline_cable_fly,
                "Decline Cable Fly",
                "Pectoralis Major (Upper and Lower), Biceps Brachii (Short head), Anterior Deltoid"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.decline_dumbbell_bench_press,
                "Decline Dumbbell Bench Press",
                "Pectoralis Major (Upper and Lower), Triceps Brachii, Biceps Brachii (Short head), Anterior Deltoid"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.decline_dumbbell_fly,
                "Decline Dumbbell Fly",
                "Pectoralis Major (Upper and Lower), Biceps Brachii (Short head), Anterior Deltoid"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.decline_hammer_grip_dumbbell_bench_press,
                "Decline Hammer Grip Dumbbell Bench Press",
                "Pectoralis Major (Upper and Lower), Triceps Brachii, Anterior Deltoid"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.dumbbell_bench_press,
                "Dumbbell Bench Press",
                "Pectoralis Major, Triceps Brachii, Anterior Deltoid"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.dumbbell_chest_fly,
                "Dumbbell Chest Fly",
                "Pectoralis Major (Upper and Lower), Biceps Brachii (Short head), Anterior Deltoid"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.dumbbell_pullover,
                "Dumbbell Pullover",
                "Lower Pectoralis Major, Triceps Brachii (Long head), Posterior Deltoid, Latissimus Dorsi, Teres Major"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.hammer_grip_dumbbell_bench_press,
                "Hammer Grip Dumbbell Bench Press",
                "Pectoralis Major (Upper and Lower), Triceps Brachii, Biceps Brachii (Short head), Anterior Deltoid"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.high_cable_cross_over,
                "High Cable Cross Over",
                "Pectoralis Major (Upper and Lower), Anterior Deltoid, Latissimus Dorsi"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.incline_barbell_bench_press,
                "Incline Barbel Bench Press",
                "Upper Pectoralis Major, Triceps Brachii, Anterior Deltoid"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.incline_cable_bench_press,
                "Incline Cable Bench Press",
                "Upper Pectoralis Major, Triceps Brachii, Biceps Brachii (Short head), Anterior Deltoid"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.incline_dumbbell_bench_press,
                "Incline Dumbbell Bench Press",
                "Upper Pectoralis Major, Triceps Brachii, Anterior Deltoid"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.incline_dumbbell_fly,
                "Incline Dumbbell Fly",
                "Upper Pectoralis Major, Biceps Brachii (Short head), Anterior Deltoid"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.incline_reverse_grip_barbell_bench_press,
                "Incline Reverse Grip Barbell Bench Press",
                "Pectoralis Major (Upper and Lower), Triceps Brachii, Biceps Brachii (Short head), Anterior Deltoid"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.incline_reverse_grip_dumbbell_bench_press,
                "Incline Reverse Grip Dumbbell Bench Press",
                "Pectoralis Major (Upper and Lower), Triceps Brachii, Biceps Brachii (Short head), Anterior Deltoid"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.low_cable_cross_over,
                "Low Cable Cross Over",
                "Upper Pectoralis Major, Biceps Brachii (Short head), Anterior Deltoid"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.machine_chest_press,
                "Machine Chest Press",
                "Pectoralis Major (Upper and Lower), Triceps Brachii, Anterior Deltoid"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.machine_fly,
                "Machine Fly",
                "Pectoralis Major (Upper and Lower), Biceps Brachii (Short head), Serratus Anterior"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.push_up_tall,
                "Push Up",
                "Pectoralis Major (Upper and Lower), Triceps Brachii, Anterior Deltoid"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.standing_cable_chest_press,
                "Standing Cable Chest Press",
                "Pectoralis Major (Upper and Lower), Triceps Brachii, Anterior Deltoid"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.svend_press,
                "Svend Press",
                "Pectoralis Major (Upper and Lower), Triceps Brachii, Anterior Deltoid"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.triceps_dip,
                "Tricep Dip",
                "Pectoralis Major, Triceps Brachii, Anterior Deltoid, Latissimus Dorsi"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.weighted_push_up,
                "Weighted Push Up",
                "Pectoralis Major (Upper and Lower), Triceps Brachii, Biceps Brachii (Short head), Anterior Deltoid"));
    }
}
