package doova.fitgoal;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class ExerciseRoutine_Dialog extends DialogFragment{

    private TextView ActionOK, ActionCANCEL;
    private EditText Routine_name;

    private RadioGroup Split;

    public interface RoutineDialogListener{
        void sendInput(String name, String split);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.exercise_routine_dialog, container, false);

        Routine_name = view.findViewById(R.id.ExerciseRoutine_DialogNameInput);
        //Routine_split = view.findViewById(R.id.ExerciseRoutine_DialogSplitInput);
        Split = view.findViewById(R.id.RadioSplit);
        final RadioButton split_2day = view.findViewById(R.id.Radio_2day);
        final RadioButton split_3day = view.findViewById(R.id.Radio_3day);
        final RadioButton split_4day = view.findViewById(R.id.Radio_4day);
        final RadioButton split_5day = view.findViewById(R.id.Radio_5day);


        ActionOK = view.findViewById(R.id.ExerciseRoutine_DialogAction_OK);
        ActionCANCEL = view.findViewById(R.id.ExerciseRoutine_DialogAction_CANCEL);

        ActionCANCEL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getDialog().dismiss();
            }
        });

        ActionOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = Routine_name.getText().toString();
                String split = "";

                if(split_2day.isChecked()){
                    split = "2 Day Split";
                }
                if(split_3day.isChecked()){
                    split = "3 Day Split";
                }
                if(split_4day.isChecked()){
                    split = "4 Day Split";
                }
                if(split_5day.isChecked()){
                    split = "5 Day Split";
                }

                if(!name.equals("") && split != null) {
                    RoutineDialogListener listener = getListener();
                    if(listener != null) {
                        listener.sendInput(name, split);
                    }
                }else{
                    Toast.makeText(getContext(), "Routine name and/or split selection was invalid", Toast.LENGTH_LONG).show();
                }


                Log.d("Database Operations", "Routine Name is: " + name + " and Selected Split: " + split);
                getDialog().dismiss();
            }
        });

        return view;
    }

    @Nullable
    private RoutineDialogListener getListener() {
        RoutineDialogListener listener;
        try{
            Fragment onInputSelected_Fragment = getTargetFragment();
            if (onInputSelected_Fragment != null){
                listener = (RoutineDialogListener) onInputSelected_Fragment;
            }
            else {
                Activity onInputSelected_Activity = getActivity();
                listener = (RoutineDialogListener) onInputSelected_Activity;
            }
            return listener;
        }catch(ClassCastException e){
            Log.e("Custom Dialog", "onAttach: ClassCastException: " + e.getMessage());
        }
        return null;
    }
}

