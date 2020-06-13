package doova.fitgoal;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Muscle_Exercises_Calves extends AppCompatActivity{

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
        actionBar.setTitle("Calves Exercises");

        CalvesExercises();
        buildRecycler();
    }


    private void buildRecycler(){
        layoutManager = new LinearLayoutManager(this);
        adapter = new Muscle_Exercises_Adapter(this, muscle_exercises_info);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void CalvesExercises(){
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.lever_seated_calf_raise_plate_loaded,
                "Lever Seated Calf Raise",
                "Gastrocnemius (medial head), Gastrocnemius (later head), Soleus"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.lever_standing_calf_raise,
                "Lever Standing Calf Raise",
                "Gastrocnemius (medial head), Gastrocnemius (later head), Soleus"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.machine_seated_one_leg_calf_raise,
                "Machine Seated One Leg Calf Raise",
                "Gastrocnemius, Soleus"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.sled_calf_press,
                "Sled Calf Press",
                "Gastrocnemius (medial head), Gastrocnemius (later head), Soleus"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.standing_dumbbell_one_leg_calf_raise,
                "Standing Dumbbell One Leg Calf Raise",
                "Gastrocnemius, Soleus"));
    }
}
