package doova.fitgoal;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Muscle_Exercises_Back extends AppCompatActivity {

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
        actionBar.setTitle("Back Exercises");

        BackExercises();
        buildRecycler();
    }


    private void buildRecycler(){
        layoutManager = new LinearLayoutManager(this);
        adapter = new Muscle_Exercises_Adapter(this, muscle_exercises_info);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void BackExercises(){
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.hyperextension,
                "45 Degree Hyperextension",
                "Erector Spinae (deep), Gluteus Maximus, Hamstrings"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.assisted_pullup,
                "Assisted Pullup",
                "Latissimus Dorsi, Rhomboids (deep), Posterior Deltoid, Infraspinatus," +
                        "Trapezius (Middle and Lower), Teres Minor, Teres Major, Biceps Brachii," +
                        "Brachialis, Brachioradialis, Levator Scapulae"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.barbell_bent_over_row,
                "Barbell Bent Over Row",
                "Latissimus Dorsi, Rhomboids (deep), Trapezius (Middle and Lower), Posterior Deltoid," +
                        "Teres Minor, Teres Major, Infraspinatus, Brachialis"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.barbell_deadlift,
                "Barbell Deadlift",
                "Erector Spinae (deep), Gluteus Maximus, Quadriceps, Hamstrings, Adductor Magnus, Soleus"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.barbell_rack_pull,
                "Barbell Rack Pull",
                "Erector Spinae (deep), Gluteus Maximus, Quadriceps, Hamstrings, Soleus"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.behind_the_neck_lat_pulldown,
                "Behind the Neck Lat Pulldown",
                "Latissimus Dorsi, Lower Trapezius, Pectoralis Major, Teres Major, Biceps Brachii, Brachialis, Brachioradialis"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.bent_over_one_arm_cable_pull,
                "Bent Over One Arm Cable Pull",
                "Latissimus Dorsi, Rhomboids (deep), Posterior Deltoid, Trapezius (Middle and Lower), " +
                        "Teres Major, Biceps Brachii, Brachialis, Brachioradialis, Levator Scapulae, " +
                        "Pectorais Major, Triceps Brachii (Long head), External Oblique"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.bent_over_one_arm_dumbbell_row,
                "Bent Over One Arm Dumbbell Row",
                "Latissimus Dorsi, Posterior Deltoid, Infraspinatus," +
                        "Trapezius (Middle and Lower), Teres Minor, Teres Major, Brachialis, Brachioradialis"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.bent_over_two_arm_dumbbell_row,
                "Bent Over Two Arm Dumbbell Row",
                "Latissimus Dorsi, Rhomboids (deep), Posterior Deltoid, Infraspinatus," +
                        "Trapezius (Middle and Lower), Teres Minor, Teres Major, Brachialis, Pectoralis Major"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.cable_close_grip_pull_down,
                "Cable Close Grip Pulldown",
                "Latissimus Dorsi, Posterior Deltoid, Trapezius (Middle and Lower), " +
                        "Teres Major, Brachialis, Brachioradialis, Pectoralis Major"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.cable_incline_straight_arm_pull_down,
                "Cable Incline Straight Arm Pulldown",
                "Latissimus Dorsi, Posterior Deltoid, Teres Major, Pectoralis Major, Triceps Brachii (Long head)"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.cable_seated_wide_grip_row,
                "Cable Seated Wide Grip Row",
                "Latissimus Dorsi, Posterior Deltoid, Infraspinatus," +
                        "Trapezius (Middle and Lower), Teres Minor, Teres Major, Brachialis, Brachioradialis"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.cable_straight_arm_pull_down,
                "Cable Straight Arm Pulldown",
                "Latissimus Dorsi, Posterior Deltoid, Teres Minor, Triceps Brachii (Long head)," +
                        "Lower Pectoralis Major, Levator Scapulae"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.cablerow,
                "Cable Row",
                "Latissimus Dorsi, Rhomboids (deep), Posterior Deltoid, Infraspinatus," +
                        "Trapezius (Middle and Lower), Teres Minor, Teres Major," +
                        "Erector Spinae (deep), Brachialis, Brachioradialis, Pectoralis Major"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.close_neutral_grip_pull_up,
                "Close Neutral Grip Pullup",
                "Latissimus Dorsi, Rhomboids (deep), Posterior Deltoid," +
                        "Trapezius (Middle and Lower), Teres Major, Brachialis, Brachioradialis, Pectoralis Major"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.decline_barbell_pullover,
                "Decline Barbell Pullover",
                "Latissimus Dorsi, Posterior Deltoid, Teres Major, Lower Pectoralis Major," +
                        "Triceps Brachii (Long head), Levator Scapulae"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.decline_bent_arm_barbell_pullover,
                "Decline Bent Arm Barbell Pullover",
                "Latissimus Dorsi, Posterior Deltoid, Teres Major, Lower Pectoralis Major," +
                        "Triceps Bachii (Long head), Levator Scapulae"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.dumbbell_pullover,
                "Dumbbell Pullover",
                "Latissimus Dorsi, Posterior Deltoid, Teres Major, Lower Pectoralis Major, Triceps Brachii (Long head)"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.landmine_row,
                "Landmine Row",
                "Latissimus Dorsi, Posterior Deltoid, Infraspinatus, Trapezius (Middle and Lower), " +
                        "Teres Minor, Teres Major, Biceps Brachii, Brachialis, Brachioradialis, " +
                        "Lower Pectoralis Major, Triceps Brachii (Long head)"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.lat_pull_down,
                "Lat Pulldown",
                "Latissimus Dorsi, Rhomboids (deep), Posterior Deltoid, Infraspinatus," +
                        "Trapezius (Middle and Lower), Teres Minor, Teres Major, Biceps Brachii," +
                        "Brachialis, Brachioradialis, Levator Scapulae"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.lever_t_bar_row_plate_loaded,
                "T-Bar Row",
                "Latissimus Dorsi, Posterior Deltoid, Infraspinatus, Trapezius (Middle and Lower), " +
                        "Teres Minor, Teres Major, Brachialis, Pectoralis Major"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.machine_assisted_close_neutral_grip_pull_up,
                "Machine Assisted Close Neutral Grip Pullup",
                "Latissimus Dorsi, Rhomboids (deep), Posterior Deltoid, Trapezius (Middle and Lower), " +
                        "Teres Major, Biceps Brachii, Brachialis, Brachioradialis, Levator Scapulae, Lower Pactoralis Major, Triceps Brachii (Long head)"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.machine_back_extension,
                "Machine Back Extension",
                "Exector Spinae (deep)"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.machine_high_row,
                "Machine High Row",
                "Latissimus Dorsi, Rhomboids (deep), Posterior Deltoid, Infraspinatus, Trapezius (Middle and Lower), " +
                        "Teres Minor, Teres Major, Brachialis, Brachioradialis, Pectoralis Major"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.machine_one_arm_row,
                "Machine One Arm Row",
                "Latissimus Dorsi, Posterior Deltoid, Infraspinatus, Trapezius (Middle and Lower)," +
                        "Teres Minor, Teres Major, Brachialis, Brachioradialis, Lower Pectoralis Major"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.one_arm_lat_pulldown,
                "One Arm Lat Pulldown",
                "Latissimus Dorsi, Rhomboids (deep), Posterior Deltoid, Trapezius (Middle and Lower), Teres Major, " +
                        "Brachialis, Brachioradialis, Levator Scapulae, Pectoralis Major, Triceps Brachii (Long head), Obliques"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.prone_incline_upright_row,
                "Prone Incline Upright Row",
                "Posterior Deltoid, Infraspinatus, Trapezius (Middle and Lower), Teres Minor, Biceps Brachii, Brachialis"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.pull_up,
                "Pull up",
                "Latissimus Dorsi, Posterior Deltoid, Infraspinatus, Trapezius (Middle and Lower), " +
                        "Teres Minor, Teres Major, Biceps Brachii, Brachialis, Brachioradialis"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.reverse_grip_lat_pull_down,
                "Reverse Grip Lat Pulldown",
                "Latissimus Dorsi, Rhomboids (deep), Posterior Deltoid, Trapezius (Middle and Lower), Teres Major, Brachialis, Brachioradialis, Pectorais Major"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.seated_one_arm_cable_row,
                "Seated One Arm Cable Row",
                "Latissimus Dorsi, Posterior Deltoid, Infraspinatus, Trapezius (Middle and Lower)," +
                        " Teres Minor, Teres Major, Brachialis, Brachioradialis, Pectoralis Major"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.seated_twisting_cable_row,
                "Seated Twisting Cable Row",
                "Latissimus Dorsi, Posterior Deltoid, Infraspinatus, Trapezius (Middle and Lower), Teres Minor, Teres Major, " +
                        "Biceps Brachii, Brachialis, Brachioradialis, Lower Pectoralis Major, Triceps Brachii (Long head), External Oblique"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.standing_cable_rear_delt_row_with_rope,
                "Standing Cable Rear Delt Row with Rope",
                "Rhomboids (deep), Posterior Deltoid, Lateral Deltoid, Infraspinatus, " +
                        "Trapezius (Middle and Lower), Teres Minor, Brachioradialis"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.standing_twisting_cable_high_row,
                "Standing Twisting Cable High Row",
                "Latissimus Dorsi, Rhomboids (deep), Posterior Deltoid, Infraspinatus, Trapezius (Middle and Lower), Teres Minor, Teres Major, " +
                        "Biceps Brachii, Brachialis, Brachioradialis, Lower Pectoralis Major, Triceps Brachii (Long head), External Oblique," +
                        "Tensor Fasciae Latae, Gluteus Medius"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.standing_twisting_cable_row,
                "Standing Twisting Cable Row",
                "Latissimus Dorsi, Rhomboids (deep), Posterior Deltoid, Infraspinatus, Trapezius (Middle and Lower), Teres Minor, Teres Major, " +
                        "Biceps Brachii, Brachialis, Brachioradialis, Lower Pectoralis Major, Triceps Brachii (Long head), External Oblique, " +
                        "Tensor Fasciae Latae, Gluteus Medius"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.straight_back_seated_cable_row,
                "Straight Back Seated Cable Row",
                "Latissimus Dorsi, Posterior Deltoid, Infraspinatus, Trapezius (Middle and Lower), Teres Minor, Teres Major, Brachialis, Brachioradialis, Pectoralis Major"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.straight_back_underhand_cable_row,
                "Straight Back Underhand Cable Row",
                "Latissimus Dorsi, Rhomboids (deep), Posterior Deltoid, Infraspinatus, Trapezius (Middle and Lower), Teres Minor, Teres Major," +
                        "Biceps Brachii, Brachialis, Brachioradialis, Pectoralis Major, Triceps Brachii (Long head)"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.underhand_yates_row,
                "Underhand Yates Row",
                "Latissimus Dorsi, Rhomboids (deep), Posterior Deltoid, Infraspinatus, Trapezius (Middle and Lower), Teres Minor, Teres Major, " +
                        "Biceps Brachii, Brachialis, Brachioradialis, Pectoralis Major"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.wide_grip_lat_pulldown,
                "Wide Grip Lat Pulldown",
                "Latissimus Dorsi, Posterior Deltoid, Infraspinatus, Trapezius (Middle and Lower), Teres Minor, Teres Major, " +
                        "Brachialis, Brachioradialis"));
    }
}
