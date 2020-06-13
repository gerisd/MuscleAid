//TODO: Check Email format and make password 6 or more characters

package doova.fitgoal;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpFragment extends Fragment {

    EditText Username, Email, Password, PasswordConfirmation;
    Button SignUpButton;

    SignUpListener activityCommander;

    public interface SignUpListener{
        boolean UserAvailable(String Username);
        boolean EmailAvailable(String Email);
        boolean PasswordsAreEqual(String Password, String ConfirmPassword);
        void AddData(String Username, String Email, String Pass);
        void GoHome();
    }

    @Override
    public void onAttach(Context context) {
        try{
            activityCommander = (SignUpListener) context;
        }catch(ClassCastException e){
            throw new ClassCastException(context.toString());
        }
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.signup_fragment, container, false);

        Username = view.findViewById(R.id.CreateUsernameInput);
        Email = view.findViewById(R.id.CreateEmailInput);
        Password = view.findViewById(R.id.CreatePasswordInput);
        PasswordConfirmation = view.findViewById(R.id.ConfirmPasswordInput);

        SignUpButton = view.findViewById(R.id.SignUpButton);

        SignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SignUpPresesd();
            }
        });

        return view;
    }

    public void SignUpPresesd(){

        //If username, email, and password are valid --> add data to db, and go to home page
        if(activityCommander.UserAvailable(Username.getText().toString()) && activityCommander.EmailAvailable(Email.getText().toString())
                && activityCommander.PasswordsAreEqual(Password.getText().toString(),PasswordConfirmation.getText().toString())){
            //Add to db
            activityCommander.AddData(Username.getText().toString(), Email.getText().toString(), Password.getText().toString());
            //Go to Home Page
            activityCommander.GoHome();
        }else
            if(!activityCommander.UserAvailable(Username.getText().toString())) {
                Toast.makeText(getContext(), "Username already exists", Toast.LENGTH_SHORT).show();
            }
            if(!activityCommander.EmailAvailable(Email.getText().toString())){
                Toast.makeText(getContext(),"Email already exists", Toast.LENGTH_SHORT).show();
            }
            if(!activityCommander.PasswordsAreEqual(Password.getText().toString(), PasswordConfirmation.getText().toString())){
                Toast.makeText(getContext(),"Passwords don't match", Toast.LENGTH_SHORT).show();
            }
    }
}
