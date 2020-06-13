package doova.fitgoal;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Muscle_Exercises_Legs extends AppCompatActivity {

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
        actionBar.setTitle("Legs Exercises");

        LegExercises();
        buildRecycler();
    }


    private void buildRecycler(){
        layoutManager = new LinearLayoutManager(this);
        adapter = new Muscle_Exercises_Adapter(this, muscle_exercises_info);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void LegExercises(){
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.barbell_bulgarian_split_squat,
                "Barbell Bulgarian Split Squat",
                "Rectus Femoris, Vastus Lateralis, Vastus Medialis, Gluteus Maximus, " +
                        "Adductor Magus, Soleus"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.barbell_front_squat,
                "Barbell Front Squat",
                "Rectus Femoris, Vastus Lateralis, Vastus Medialis, Gluteus Maximus, " +
                        "Adductor Magus, Soleus"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.barbell_hip_thrust,
                "Barbell Hip Thrust",
                "Rectus Femoris, Vastus Lateralis, Vastus Medialis, Gluteus Maximus, Hamstrings"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.barbell_lunge,
                "Barbell Lunge",
                "Rectus Femoris, Vastus Lateralis, Vastus Medialis, Gluteus Maximus, " +
                        "Adductor Magus, Soleus"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.barbell_one_leg_hip_thrust,
                "Barbell One Leg Hip Thrust",
                "Rectus Femoris, Vastus Lateralis, Vastus Medialis, Gluteus Maximus, Hamstrings"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.barbell_side_lunge,
                "Barbell Side Lunge",
                "Rectus Femoris, Vastus Lateralis, Vastus Medialis, Gluteus Maximus, " +
                        "Adductor Magus, Adductor Longus, Soleus, Gastrocnemius"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.barbell_straight_leg_deadlift,
                "Barbell Straight Leg Deadlift",
                "Erector Spinae (deep), Gluteus Maximus, Biceps Femoris, Semitendinosus," +
                        "Semimembranosus, Adductor Magus"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.barbellsquat,
                "Barbell Squat",
                "Rectus Femoris, Vastus Lateralis, Vastus Medialis, Gluteus Maximus, " +
                        "Adductor Magus, Soleus"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.bodyweight_sumo_squat,
                "Bodyweight Sumo Squat",
                "Rectus Femoris, Vastus Lateralis, Vastus Medialis, Gluteus Maximus, " +
                        "Adductor Magus, Adductor Longus, Soleus, Gracilis"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.cable_hip_abduction,
                "Cable Hip Abduction",
                "Gluteus Minimus (deep), Gluteus Medius, Tensor Fasciae Latae"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.dumbbell_deadlift,
                "Dumbbell Deadlift",
                "Rectus Femoris, Vastus Lateralis, Vastus Medialis, Gluteus Maximus, " +
                        "Hamstrings, Soleus"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.dumbbell_forward_leaning_lunge_wide,
                "Dumbbell Forward Leaning Wide Lunge",
                "Rectus Femoris, Vastus Lateralis, Vastus Medialis, Gluteus Maximus, " +
                        "Adductor Magus, Soleus"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.dumbbell_lunge,
                "Dumbbell Lunge",
                "Rectus Femoris, Vastus Lateralis, Vastus Medialis, Gluteus Maximus, " +
                        "Adductor Magus, Soleus"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.dumbbell_one_leg_split_squat,
                "Dumbbell One Leg Split Squat",
                "Rectus Femoris, Vastus Lateralis, Gluteus Maximus, Adductor Magus, " +
                        "Hamstrings, Gastrocnemius, Soleus"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.dumbbell_rear_lunge,
                "Dumbbell Rear Lunge",
                "Rectus Femoris, Vastus Lateralis, Vastus Medialis, Gluteus Maximus, " +
                        "Adductor Magus, Soleus"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.dumbbell_step_up,
                "Dumbbell Step Up",
                "Rectus Femoris, Vastus Lateralis, Vastus Medialis, Gluteus Maximus, " +
                        "Adductor Magus, Gastrocnemius, Soleus"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.dumbbell_sumo_squat_with_adductors,
                "Dumbbell Sumo Squat with Adductors",
                "Rectus Femoris, Vastus Lateralis, Vastus Medialis, Gluteus Maximus, " +
                        "Adductor Magus, Adductor Longus, Gracilis, Pectineus, " +
                        "Gastrocnemius, Soleus"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.kneeling_leg_curl,
                "Machine Leg Curl",
                "Semitendinosus, Semimembranosus, Biceps Femoris, " +
                        "Gastrocnemius (Medial and Lateral Head)"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.lever_leg_extension,
                "Machine Leg Extension",
                "Rectus Femoris, Vastus Lateralis, Vastus Medialis"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.lying_leg_curl,
                "Lying Leg Curl",
                "Semitendinosus, Semimembanosus, Biceps Femoris, " +
                        "Popliteus, Gracilis, Gastrocnemius (Medial and Lateral Head)"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.machine_reverse_hyperextension,
                "Machine Reverse Hyperextension",
                "Erector Spinae (deep), Gluteus Maximus, Hamstrings"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.romaniandeadlift,
                "Romanian Deadlift",
                "Erector Spinae (deep), Gluteus Maximus, Hamstrings, " +
                        "Adductor Magnus, Quadriceps, Soleus"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.seated_leg_curl,
                "Seated Leg Curl",
                "Hamstrings, Gastrocnemius, Cracilis, Sartorius"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.sled_45_degree_leg_press,
                "Decline Leg Press",
                "Rectus Femoris, Vastus Lateralis, Vastus Medialis"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.standing_cable_hip_extension,
                "Standing Cable Hip Extension",
                "Gluteus Maximus, Hamstrings"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.weighted_one_leg_hip_thrust,
                "Weighted One Leg Hip Thrust",
                "Rectus Femoris, Vastus Lateralis, Vastus Medialis, " +
                        "Gluteus Maximus, Hamstrings"));
    }
}
