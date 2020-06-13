package doova.fitgoal;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Muscle_Exercises_Traps extends AppCompatActivity {

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
        actionBar.setTitle("Traps Exercises");

        TrapExercises();
        buildRecycler();
    }


    private void buildRecycler(){
        layoutManager = new LinearLayoutManager(this);
        adapter = new Muscle_Exercises_Adapter(this, muscle_exercises_info);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void TrapExercises(){
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.barbell_shrug,
                "Barbell Shrugs",
                "Trapezius (Upper and Middle)"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.barbell_wide_grip_upright_row,
                "Barbell Wide Grip Upright Row",
                "Trapezius (Middle and Lower), Lateral Deltoid," +
                        "Infraspinatus, Teres Minor, Brachialis, Serratus Anterior"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.cable_upright_row,
                "Cable Upright Row",
                "Lateral Deltoid, Trapezius (Middle and Lower), Infraspinatus, " +
                        "Teres Minor, Serratus Anterior"));
        muscle_exercises_info.add(new Muscle_Exercises_Info(R.drawable.dumbbell_shrug,
                "Dumbbell Shrug",
                "Trapezius (Upper and Lower)"));
    }
}
