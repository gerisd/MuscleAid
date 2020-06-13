package doova.fitgoal;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Muscle_Exercises_Triceps extends AppCompatActivity {

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
        actionBar.setTitle("Triceps Exercises");

        TricepExercises();
        buildRecycler();
    }

    private void buildRecycler(){
        layoutManager = new LinearLayoutManager(this);
        adapter = new Muscle_Exercises_Adapter(this, muscle_exercises_info);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void TricepExercises(){
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.assisted_triceps_dip,
                "Assisted Triceps Dip",
                "Pectoralis Major, Triceps Brachii, Anterior Deltoid," +
                        "Latissimus Dorsi, Levator Scapulae"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.barbell_seated_overhead_triceps_extension,
                "Barbell Seated Overhead Triceps Extension",
                "Triceps Brachii"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.cable_one_arm_reverse_grip_triceps_push_down,
                "Cable One Arm Reverse Grip Triceps Pushdown",
                "Triceps Brachii"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.cable_triceps_kickback,
                "Cable Triceps Kickback",
                "Triceps Brachii"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.cable_rear_drive,
                "Cable Rear Drive",
                "Triceps Brachii, Posterior Deltoid, Lateral Deltoid, Teres Minor, " +
                        "Trapezius (Middle and Lower), Infraspinatus"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.close_grip_barbell_bench_press,
                "Close Grip Barbell Bench Press",
                "Triceps Brachii, Pectoralis Major (Upper and Lower), " +
                        "Anteroir Deltoid"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.close_grip_push_up,
                "Close Grip Push Up",
                "Triceps Brachii, Pectoralis Major, Anterior Deltoid"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.decline_dumbbell_triceps_extension,
                "Decline Dumbbell Triceps Extension",
                "Triceps Brachii"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.decline_ez_bar_skull_crusher,
                "Decline EZ Bar Skull Crusher",
                "Triceps Brachii"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.decline_skull_crusher,
                "Decline Skull Crusher",
                "Triceps Brachii"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.diamond_push_up,
                "Diamond Pushup",
                "Triceps Brachii, Pectoralis Major (Upper and Lower), " +
                        "Anteroir Deltoid, Biceps Brachii (Short head)"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.dumbbell_kickback,
                "Dumbbell Kickback",
                "Triceps Brachii"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.ez_bar_overhead_triceps_extension,
                "EZ Bar Overhead Triceps Extension",
                "Triceps Brachii"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.incline_dumbbell_triceps_extension,
                "Incline Dumbbell Triceps Extension",
                "Triceps Brachii"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.incline_overhead_cable_triceps_extension,
                "Incline Overhead Cable Triceps Extension",
                "Triceps Brachii"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.lying_barbell_triceps_extension,
                "Lying Barbell Triceps Extension",
                "Triceps Brachii"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.lying_one_arm_dumbbell_triceps_extension,
                "Lying One Arm Dumbbell Triceps Extension",
                "Triceps Brachii (Lateral and Long head)"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.seated_bent_over_two_arm_dumbbell_kickback,
                "Seated Bent Over Two Arm Dumbbell Kickback",
                "Triceps Brachii"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.seated_dumbbell_overhead_triceps_extension,
                "Seated Dumbbell Overhead Triceps Extension",
                "Triceps Brachii"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.standing_overhead_one_arm_cable_triceps_extension,
                "Standing Overhead One Arm Cable Triceps Extension",
                "Triceps Brachii"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.triceps_dip,
                "Triceps Dip",
                "Triceps Brachii, Pectoralis Major, Anteroir Deltoid," +
                        "Latissimus Dorsi"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.triceps_rope_push_down,
                "Triceps Rope Pushdown",
                "Triceps Brachii"));
    }
}
