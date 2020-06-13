package doova.fitgoal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

import maes.tech.intentanim.CustomIntent;

public class Exercise_NameList extends AppCompatActivity implements Exercise_NameList_Fragment.NameList_Listener  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise_namelist);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Select Muscle Group");

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_right,R.anim.enter_from_right, R.anim.exit_to_right);
        transaction.addToBackStack(null);
    }

    @Override
    public void LegExercises() {
        startActivity(new Intent(Exercise_NameList.this, Muscle_Exercises_Legs.class));
    }

    @Override
    public void ChestExercises() {
        startActivity(new Intent(Exercise_NameList.this, Muscle_Exercises_Chest.class));
    }

    @Override
    public void BackExercises() {
        startActivity(new Intent(Exercise_NameList.this, Muscle_Exercises_Back.class));
    }

    @Override
    public void DeltExercises() {
        startActivity(new Intent(Exercise_NameList.this, Muscle_Exercises_Delts.class));
    }

    @Override
    public void BicepExercises() {
        startActivity(new Intent(Exercise_NameList.this, Muscle_Exercises_Biceps.class));
    }

    @Override
    public void TricepExercises() {
        startActivity(new Intent(Exercise_NameList.this, Muscle_Exercises_Triceps.class));
    }

    @Override
    public void AbsExercises() {
        startActivity(new Intent(Exercise_NameList.this, Muscle_Exercises_Abs.class));
    }

    @Override
    public void TrapExercises() {
        startActivity(new Intent(Exercise_NameList.this, Muscle_Exercises_Traps.class));
    }

    @Override
    public void ForearmsExercises() {
        startActivity(new Intent(Exercise_NameList.this, Muscle_Exercises_Forearms.class));
    }

    @Override
    public void CalvesExercises() {
        startActivity(new Intent(Exercise_NameList.this, Muscle_Exercises_Calves.class));
    }

    //@Override
    //public void finish() {
    //    CustomIntent.customType(this, "right-to-left");
    //}
}
