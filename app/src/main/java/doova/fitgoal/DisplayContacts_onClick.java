package doova.fitgoal;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayContacts_onClick extends AppCompatActivity {

    TextView DisplayName_onClick, DisplayEmail_onClick, DisplayPassword_onClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_contacts_on_click);

        DisplayName_onClick = findViewById(R.id.DisplayName_onClick);
        DisplayEmail_onClick = findViewById(R.id.DisplayEmail_onClick);
        DisplayPassword_onClick = findViewById(R.id.DisplayPassword_onClick);

        ActionBar actionBar = getSupportActionBar();

        //Get data using intent from previous activity, ContactsAdapter, when item on listview is clicked
        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        String email = intent.getStringExtra("email");
        String password = intent.getStringExtra("password");

        //Set ActionBar title
        actionBar.setTitle(username + "'s Account Registration");
        //Set Actionbar Color
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#424242")));

        //Set text in textview
        DisplayName_onClick.setText(username);
        DisplayEmail_onClick.setText(email);
        DisplayPassword_onClick.setText(password);


    }
}
