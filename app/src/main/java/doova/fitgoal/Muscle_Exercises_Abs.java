package doova.fitgoal;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Muscle_Exercises_Abs extends AppCompatActivity {

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
        actionBar.setTitle("Abs Exercises");

        AbExercises();
        buildRecycler();
    }

    public void buildRecycler(){
        layoutManager = new LinearLayoutManager(this);
        adapter = new Muscle_Exercises_Adapter(this, muscle_exercises_info);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    public void AbExercises(){
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.barbell_rollout,
                "Barbell Rollout",
                "Posterior Deltoid, Latissimum Dorsi, Pectoralis Major, " +
                        "Adductor Longus, Sartorius, Tensor Fasciae Latae"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.bicycle_crunch,
                "Bicycle Crunch",
                "Rectus Abdominis, External Oblique, Adductor Longus, Sartorius, " +
                        "Tensor Fasciae Latae, lliopsoas"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.cable_kneeling_crunch,
                "Cable Kneeling Crunch",
                "Rectus Abdominis, External Oblique"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.cable_twist,
                "Cable Twist",
                "External Oblique, Adductor Longus, Adductor Magnus, Psoas Major, " +
                        "Tensor Fasciae Latae, Gluteus Medius"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.cable_woodchop,
                "Cable Woodchop",
                "External Oblique, Adductor Longus, Adductor Magnus, Psoas Major, " +
                        "Tensor Fasciae Latae, Gluteus Medius"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.captains_chair_leg_and_hip_raise,
                "Captain's Chair Leg Raise",
                "Rectus Abdominis, External Oblique, Adductor Longus, Sartorius, " +
                        "Tensor Fasciae Latae, Rectus Femoris, Pectineus, lliopsoas"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.crunch,
                "Crunch",
                "Rectus Abdominis, External Oblique"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.decline_sit_up,
                "Decline Sit Up",
                "Rectus Abdominis, External Oblique, Adductor Longus, Sartorius, Tensor Fasciae Latae, Rectus Femoris," +
                        "Pectineus, lliopsoas"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.decline_twisting_sit_up,
                "Decline Twisting Sit Up",
                "Rectus Abdominis, Oblique, Sartorius, Tensor Fasciae Latae, Rectus Femoris"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.dumbbell_side_bend,
                "Dumbbell Side Bend",
                "External Oblique"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.front_plank,
                "Front Plank",
                "Rectus Abdominis, External Oblique, Serratus Anterior, Quadriceps," +
                        " Tensor Fasciae Latae, Pectoralis Major"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.hanging_leg_hip_raise,
                "Hanging Leg Hip Raise",
                "Rectus Abdominis, External Oblique, Adductor Longus, Sartorius," +
                        " Tensor Fasciae Latae, lliopsoas, Pectineus"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.hanging_straight_leg_hip_raise,
                "Hanging Straight Leg Hip Raise",
                "Rectus Abdominis, External Oblique, Adductor Longus, Sartorius, Quadriceps, Pectineus"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.hanging_windshield_wiper,
                "Hanging Windshield Wiper",
                "Rectus Abdominis, External Oblique, Tensor Fasciae Latae"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.incline_straight_leg_hip_raise,
                "Incline Straight Leg Hip Raise",
                "Rectus Abdominis, External Oblique, Tensor Fasciae Latae, Adductor Longus, " +
                        "Sartorius, Quadriceps, Pectineus"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.lying_leg_hip_raise,
                "Lying Leg Hip Raise",
                "Rectus Abdominis, External Oblique, Tensor Fasciae Latae, Adductor Longus, " +
                        "Sartorius, Pectineus, lliopsoas"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.machine_leg_raise_crunch,
                "Machine Leg Raise Crunch",
                "Rectus Abdominis, External Oblique"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.reverse_crunch,
                "Reverse Crunch",
                "Rectus Abdominis, External Oblique, lliopsoas"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.side_plank_hip_abduction,
                "Side Plank Hip Abduction",
                "External Oblique, Gluteus Medius, Tensor Fasciae Latae, Psoas Major"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.stability_ball_jack_knife,
                "Stability Ball Jack Knife",
                "Rectus Abdominis, External Oblique, Rectus Femoris, Gluteus Maximus, " +
                        "Tensor Fasciae Latae, Hamstrings"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.stability_ball_leg_extension_crunch,
                "Stability Ball Leg Extension Crunch",
                "Rectus Abdominis, External Oblique, Tensor Fasciae Latae, Adductor Longus," +
                        " Sartorius, Quadriceps"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.standing_ab_wheel_rollout,
                "Standing Ab Wheel Rollout",
                "Rectus Abdominis, External Oblique, Tensor Fasciae Latae, Latissimus Dorsi, " +
                        "Posterior Deltoid, Teres Major, Lower Pectoralis Major, Triceps Brachii (long head), Quadriceps"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.twisting_crunch,
                "Twisting Crunch",
                "Rectus Abdominis, External Oblique"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.v_up,
                "V Up",
                "Rectus Abdominis, External Oblique, Tensor Fasciae Latae, Adductor Longus, " +
                        "Sartorius, Pectineus, lliopsoas, Rectus Femoris"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.vertical_leg_crunch,
                "Vertical Leg Crunch",
                "Rectus Abdominis, External Oblique"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.weighted_captains_chair_leg_and_hip_raise,
                "Weighted Captains Chair Leg Raise",
                "Rectus Abdominis, External Oblique, Tensor Fasciae Latae, Adductor Longus, " +
                        "Sartorius, Pectineus, lliopsoas, Rectus Femoris"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.weighted_russian_twist,
                "Weighted Russian Twist",
                "External Oblique"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.weighted_stability_ball_crunch,
                "Weighted Stability Ball Crunch",
                "Rectus Abdominis, External Oblique"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.wheel_rollout,
                "Wheel Rollout",
                "Tensor Fasciae Latae, Adductor Longus, Sartorius, Pectineus, lliopsoas," +
                        "Latissimus Dorsi, Posterior Deltoid, Teres Major, Lower Pectoralis Major"));
    }
}
