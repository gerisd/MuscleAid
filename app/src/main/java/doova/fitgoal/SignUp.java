//TODO: ADD AN ERROR THAT HIGHLIGHTS THAT THE USERNAME IS TAKEN IN RED, OR AVAILABLE IN GREEN
//TODO: Add number of attempts and temporarily disable login button?
package doova.fitgoal;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class SignUp extends AppCompatActivity implements SignUpFragment.SignUpListener{

    ContactsDBHandler USignUp_DBHandler;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Sign Up");
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#757575")));

        USignUp_DBHandler = new ContactsDBHandler(this);
    }

    @Override
    public boolean UserAvailable(String Username){
        return !USignUp_DBHandler.UsernameExists(Username);
    }

    @Override
    public boolean EmailAvailable(String Email) {
        return !USignUp_DBHandler.EmailExists(Email);
    }

    @Override
    public boolean PasswordsAreEqual(String Password, String ConfirmPassword) {
        if(!Password.equals(ConfirmPassword)){
            Toast.makeText(this, "Passwords are unequal!", Toast.LENGTH_SHORT).show();
            return false;
        }else{
            return true;
        }
    }

    @Override
    public void AddData(String Username, String Email, String Password) {
        BackendTask_SignUp backendTask_signUp = new BackendTask_SignUp(this);
        backendTask_signUp.execute("add_contact", Username, Email, Password);
        finish();
    }

    @Override
    public void GoHome() {
        startActivity(new Intent(SignUp.this, HomePage.class));
    }
}
