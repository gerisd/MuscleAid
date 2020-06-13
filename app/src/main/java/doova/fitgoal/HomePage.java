package doova.fitgoal;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class HomePage extends AppCompatActivity implements HomePageFragment.HomePageListener{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);
    }

    @Override
    public void GoToExercise(View view) {
        startActivity(new Intent(HomePage.this, Exercise.class));
    }

    @Override
    public void GoToNotes(View view) {

    }

    @Override
    public void GoToPlanner(View view) {
        startActivity(new Intent(HomePage.this, Planner.class));
    }

    @Override
    public void GoToProgress(View view) {

    }

    @Override
    public void GoToSettings(View view) {

    }
}
