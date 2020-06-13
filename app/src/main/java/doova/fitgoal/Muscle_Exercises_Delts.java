package doova.fitgoal;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Muscle_Exercises_Delts extends AppCompatActivity {

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
        actionBar.setTitle("Delts Exercises");

        DeltExercises();
        buildRecycler();
    }

    private void buildRecycler(){
        layoutManager = new LinearLayoutManager(this);
        adapter = new Muscle_Exercises_Adapter(this, muscle_exercises_info);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void DeltExercises(){
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.alternating_dumbbell_front_raise,
                "Alternating Dumbbell Front Raise",
                "Anterior Deltoid, Lateral Deltoid, Upper Pectoralis Major, Serratus Anterior"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.arnold_press,
                "Arnold Press",
                "Anterior Deltoid, Lateral Deltoid, Triceps Brachii, Serratus Anterior"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.barbell_military_press,
                "Barbell Military Press",
                "Anterior Deltoid, Lateral Deltoid, Upper Pectoralis Major, " +
                        "Triceps Brachii, Serratus Anterior"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.barbell_wide_grip_upright_row,
                "Barbell Wide Grip Upright Row",
                "Lateral Deltoid, Trapezius (Middle and Lower), Infraspinatus, " +
                        "Teres Minor, Brachialis, Serratus Anterior"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.behind_the_neck_barbell_overhead_press,
                "Behind the Neck Barbell Overhead Press",
                "Anterior Deltoid, Lateral Deltoid, Triceps Brachii, Serratus Anterior"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.cable_one_arm_front_raise,
                "Cable One Arm Front Raise",
                "Anterior Deltoid, Lateral Deltoid, Upper Pectoralis Major, Serratus Anterior"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.cable_one_arm_lateral_raise,
                "Cable One Arm Lateral Raise",
                "Anterior Deltoid, Lateral Deltoid, Serratus Anterior"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.cable_rear_delt_row,
                "Cable Rear Delt Row",
                "Posterior Deltoid, Lateral Deltoid, Trapezius (Middle and Lower), " +
                        "Infraspinatus, Teres Minor"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.cable_standing_shoulder_external_rotation,
                "Cable Standing Shoulder External Rotation",
                "Posterior Deltoid"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.cable_upright_row,
                "Cable Upright Row",
                "Lateral Deltoid, Trapezius (Middle and Lower), Infraspinatus," +
                        "Teres Minor, Serratus Anterior"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.double_cable_front_raise,
                "Double Cable Front Raise",
                "Anterior Deltoid, Lateral Deltoid, Upper Pectoralis Major," +
                        "Serratus Anterior"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.dumbbell_bent_over_lateral_raise_head_supported,
                "Dumbbell Bent Over Lateral Raise - Head Supported",
                "Lateral Deltoid, Posterior Deltoid, Trapezius (Middle and Lower), " +
                        "Teres Minor, Infraspinatus, Rhomboids (deep)"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.dumbbell_lateral_raise,
                "Dumbbell Lateral Raise",
                "Lateral Deltoid, Anterior Deltoid, Serratus Anterior"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.dumbbell_lying_external_shoulder_rotation,
                "Dumbbell Lying External Shoulder Rotation",
                "Posterior Deltoid"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.dumbbell_rear_lateral_raise,
                "Dumbbell Rear Lateral Raise",
                "Posterior Deltoid, Lateral Deltoid, Rhomboids (deep)," +
                        "Trapezius (Middle and Lower), Infraspinatus, Teres Minor"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.dumbbell_shoulder_press,
                "Dumbbell Shoulder Press",
                "Anteroir Deltoid, Lateral Deltoid, Triceps Brachii," +
                        "Trapezius (Middle and Lower), Serratus Anterior"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.face_pull,
                "Face Pull",
                "Posterior Deltoid, Lateral Deltoid, Trapezius (Middle and Lower)," +
                        "Teres Minor, Infraspinatus, Brachialis, Brachioradialis"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.lying_dumbbell_rear_lateral_raise,
                "Lying Dumbbell Rear Lateral Raise",
                "Posterior Deltoid, Lateral Deltoid, Trapezius (Middle and Lower)," +
                        "Rhomboids (deep), Teres Minor, Infraspinatus"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.plate_front_raise,
                "Plate Front Raise",
                "Anterior Deltoid, Lateral Deltoid, Upper Pectoralis Major, " +
                        "Serratus Anterior"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.seated_alternating_dumbbell_front_raise,
                "Seated Alternating Dumbbell Front Raise",
                "Anterior Deltoid, Lateral Deltoid, Upper Pectoralis Major, Serratus Anterior"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.seated_barbell_overhead_press,
                "Seated Barbell Overhead Press",
                "Anterior Deltoid, Lateral Deltoid, Triceps Brachii, Serratus Anterior"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.seated_bent_over_lateral_raise,
                "Seated Bent Over Lateral Raise",
                "Posterior Deltoid, Lateral Deltoid, Trapezius (Middle and Lower), " +
                        "Rhomboids (deep), Infraspinatus, Teres Minor"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.seated_dumbbell_front_raise,
                "Seated Dumbbell Front Raise",
                "Anterior Deltoid, Lateral Deltoid, Upper Pectoralis Major, Serratus Anterior"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.seated_dumbbell_lateral_raise,
                "Seated Dumbbell Lateral Raise",
                "Anterior Deltoid, Lateral Deltoid, Serratus Anterior"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.seated_elbows_in_alternating_dumbbell_overhead_press,
                "Seated Alternating Dumbbell Overhead Press - Elbows In",
                "Anterior Deltoid, Lateral Deltoid, Upper Pectoralis Major, Triceps Brachii," +
                        "External Oblique"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.seated_neutral_grip_dumbbell_overhead_press,
                "Seated Neutral Grip Dumbbell Overhead Press",
                "Anterior Deltoid, Lateral Deltoid, Upper Pectoralis Major, " +
                        "Triceps brachii, Serratus Anterior"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.standing_cable_rear_delt_row_with_rope,
                "Standing Cable Rear Delt Row with Rope",
                "Posterior Deltoid, Lateral Deltoid, Trapezius (Middle and Lower)," +
                        "Rhomboids (deep), Infraspinatus, Teres Minor, Brachioradialis"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.supine_cable_reverse_fly,
                "Cable Reverse Fly",
                "Posterior Deltoid, Anterior Deltoid, Trapezius (Middle and Lower," +
                        "Infraspinatus, Teres Minor"));
    }
}
