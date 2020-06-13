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

public class LoginFragment extends Fragment {

    public static EditText LoginUser, LoginPass, SignUp;
    public static Button SignIn, DBDisplay;


    //Fragment Interface to communicate with Login main class
    LoginListener activityCommander;

    public interface LoginListener{
        void SignIn();
        boolean CheckLogin(String User, String Pass);
        void SignUp();
        void DisplayDB();
    }

    //Attaches when fragment is attached to main activity
    @Override
    public void onAttach(Context context) {
        try{
            activityCommander = (LoginListener) context;
        }catch(ClassCastException e){
            throw new ClassCastException(context.toString());
        }
        super.onAttach(context);
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        LoginUser = view.findViewById(R.id.LoginUsernameInput);
        LoginPass = view.findViewById(R.id.LoginPasswordInput);
        SignUp = view.findViewById(R.id.SignUp);
        SignIn = view.findViewById(R.id.SignInButton);

        DBDisplay = view.findViewById(R.id.DB_Display_Button);


        //Make the SignUp Text clickable but not editable
        SignUp.setFocusable(false); //XML code: android:editable="false"
        SignUp.setClickable(true); //XML code: android:inputType="none"

        SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SignInButtonPressed();
            }
        });

        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SignUpClicked();
            }
        });
        DBDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayDBClicked();
            }
        });

        return view;
    }

    public void SignInButtonPressed(){
        if(activityCommander.CheckLogin(LoginUser.getText().toString(), LoginPass.getText().toString()))
        {
            activityCommander.SignIn();
        }
    }

    public void SignUpClicked(){
        activityCommander.SignUp();
    }

    public void DisplayDBClicked(){
        activityCommander.DisplayDB();
    }

}
