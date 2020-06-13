package doova.fitgoal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;

public class Login extends AppCompatActivity implements LoginFragment.LoginListener {

    ContactsDBHandler Ulogin_DBHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Ulogin_DBHandler = new ContactsDBHandler(getApplicationContext());
    }

    public void SignIn(){
        startActivity(new Intent(Login.this, HomePage.class));
    }

    //Returns false if the Login is incorrect
    @Override
    public boolean CheckLogin(String User, String Pass) {
        if(TextUtils.isEmpty(User) || TextUtils.isEmpty(Pass)){
            Toast.makeText(getApplicationContext(), "Please enter a valid username and password", Toast.LENGTH_LONG).show();
            return false;
        }

        String searched_password = Ulogin_DBHandler.searchPass(User);
        if(Pass.equals(searched_password)){
            return true;
        }
        else{
            Toast.makeText(this, "Username and/or Password is Incorrect!", Toast.LENGTH_LONG).show();
            return false;
        }
    }

    public void SignUp(){
        startActivity(new Intent(Login.this, SignUp.class));
    }

    public void DisplayDB(){
        startActivity(new Intent(Login.this, DisplayContacts.class));
    }
}
