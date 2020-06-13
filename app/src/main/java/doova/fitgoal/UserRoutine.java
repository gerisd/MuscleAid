package doova.fitgoal;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class UserRoutine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_routine);

        getIncomingIntent();
    }

    public void getIncomingIntent(){

        //Check to see if the intent extra exists
        if(getIntent().hasExtra("Routine Name") && getIntent().hasExtra("Routine Split")){
            String routine_name = getIntent().getStringExtra("Routine Name");
            String routine_split = getIntent().getStringExtra("Routine Split");

            setActionBar(routine_name, routine_split);
        }
    }

    public void setActionBar(String title, String subtitle){
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(title);
        actionBar.setSubtitle(subtitle);
    }
}
