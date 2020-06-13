package doova.fitgoal;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Exercise extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Select Workout Routine");
    }
}
