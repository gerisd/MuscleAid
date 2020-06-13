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
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class UserRoutine_Dialog extends DialogFragment {

    private Button Chest, Back, Legs, Biceps, Triceps, Delts, Abs, Traps, Calves, Forearms;

    private boolean Chestchecked = true;
    private boolean Backchecked = true;
    private boolean Legschecked = true;
    private boolean Bicepschecked = true;
    private boolean Tricepschecked = true;
    private boolean Deltschecked = true;
    private boolean Abschecked = true;
    private boolean Trapschecked = true;
    private boolean Calveschecked = true;
    private boolean Forearmschecked = true;

    private TextView ActionOK, ActionCANCEL;

    private ArrayList<String> Exercises_Clicked = new ArrayList<>();

    public interface UserRoutineDialogListener{
        void sendInput(ArrayList<String> exercises_clicked);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.user_routine_dialog, container, false);

        ActionOK = view.findViewById(R.id.ExerciseRoutine_DialogAction_OK);
        ActionCANCEL = view.findViewById(R.id.ExerciseRoutine_DialogAction_CANCEL);

        Chest = view.findViewById(R.id.DialogChestButton);
        Back = view.findViewById(R.id.DialogBackButton);
        Legs = view.findViewById(R.id.DialogLegsButton);
        Biceps = view.findViewById(R.id.DialogBicepsButton);
        Triceps = view.findViewById(R.id.DialogTricepsButton);
        Delts = view.findViewById(R.id.DialogDeltsButton);
        Abs = view.findViewById(R.id.DialogAbsButton);
        Traps = view.findViewById(R.id.DialogTrapsButton);
        Calves = view.findViewById(R.id.DialogCalvesButton);
        Forearms = view.findViewById(R.id.DialogForearmsButton);


        Chest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Chestchecked) {
                    Chest.setBackground(getContext().getDrawable(R.drawable.dialog_button_clicked));
                    Chestchecked = false;
                }
                else{
                    Chest.setBackground(getContext().getDrawable(R.drawable.dialog_button_unclicked));
                    Chestchecked = true;
                }
            }
        });

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Backchecked) {
                    Back.setBackground(getContext().getDrawable(R.drawable.dialog_button_clicked));
                    Backchecked = false;
                }
                else{
                    Back.setBackground(getContext().getDrawable(R.drawable.dialog_button_unclicked));
                    Backchecked = true;
                }
            }
        });

        Legs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Legschecked) {
                    Legs.setBackground(getContext().getDrawable(R.drawable.dialog_button_clicked));
                    Legschecked = false;
                }
                else{
                    Legs.setBackground(getContext().getDrawable(R.drawable.dialog_button_unclicked));
                    Legschecked = true;
                }
            }
        });

        Biceps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Bicepschecked) {
                    Biceps.setBackground(getContext().getDrawable(R.drawable.dialog_button_clicked));
                    Bicepschecked = false;
                }
                else{
                    Biceps.setBackground(getContext().getDrawable(R.drawable.dialog_button_unclicked));
                    Bicepschecked = true;
                }
            }
        });

        Triceps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Tricepschecked) {
                    Triceps.setBackground(getContext().getDrawable(R.drawable.dialog_button_clicked));
                    Tricepschecked = false;
                }
                else{
                    Triceps.setBackground(getContext().getDrawable(R.drawable.dialog_button_unclicked));
                    Tricepschecked = true;
                }
            }
        });

        Delts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Deltschecked) {
                    Delts.setBackground(getContext().getDrawable(R.drawable.dialog_button_clicked));
                    Deltschecked = false;
                }
                else{
                    Delts.setBackground(getContext().getDrawable(R.drawable.dialog_button_unclicked));
                    Deltschecked = true;
                }
            }
        });

        Abs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Abschecked) {
                    Abs.setBackground(getContext().getDrawable(R.drawable.dialog_button_clicked));
                    Abschecked = false;
                }
                else{
                    Abs.setBackground(getContext().getDrawable(R.drawable.dialog_button_unclicked));
                    Abschecked = true;
                }
            }
        });

        Traps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Trapschecked) {
                    Traps.setBackground(getContext().getDrawable(R.drawable.dialog_button_clicked));
                    Trapschecked = false;
                }
                else{
                    Traps.setBackground(getContext().getDrawable(R.drawable.dialog_button_unclicked));
                    Trapschecked = true;
                }
            }
        });

        Calves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Calveschecked) {
                    Calves.setBackground(getContext().getDrawable(R.drawable.dialog_button_clicked));
                    Calveschecked = false;
                }
                else{
                    Calves.setBackground(getContext().getDrawable(R.drawable.dialog_button_unclicked));
                    Calveschecked = true;
                }
            }
        });

        Forearms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Forearmschecked) {
                    Forearms.setBackground(getContext().getDrawable(R.drawable.dialog_button_clicked));
                    Forearmschecked = false;
                }
                else{
                    Forearms.setBackground(getContext().getDrawable(R.drawable.dialog_button_unclicked));
                    Forearmschecked = true;
                }
            }
        });

        ActionCANCEL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getDialog().dismiss();
            }
        });

        ActionOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!Legschecked){
                    Exercises_Clicked.add("Legs");
                }
                if(!Chestchecked){
                    Exercises_Clicked.add("Chest");
                }
                if(!Backchecked) {
                    Exercises_Clicked.add("Back");
                }
                if(!Deltschecked){
                    Exercises_Clicked.add("Delts");
                }
                if(!Bicepschecked){
                    Exercises_Clicked.add("Biceps");
                }
                if(!Tricepschecked){
                    Exercises_Clicked.add("Triceps");
                }
                if(!Abschecked){
                    Exercises_Clicked.add("Abs");
                }
                if(!Trapschecked){
                    Exercises_Clicked.add("Traps");
                }
                if(!Calveschecked){
                    Exercises_Clicked.add("Calves");
                }
                if(!Forearmschecked){
                    Exercises_Clicked.add("Forearms");
                }

                if(Exercises_Clicked != null){
                    UserRoutineDialogListener listener = getListener();
                    if(listener != null){
                        listener.sendInput(Exercises_Clicked);
                    }
                }else{
                    Toast.makeText(getContext(), "Select an exercise for the day", Toast.LENGTH_SHORT).show();
                }

                //Log.d("Database Operations", "Routine Name is: " + name + " and Selected Split: " + split);
                getDialog().dismiss();
            }
        });

        return view;
    }

    @Nullable
    private UserRoutine_Dialog.UserRoutineDialogListener getListener() {
        UserRoutine_Dialog.UserRoutineDialogListener listener;
        try{
            Fragment onInputSelected_Fragment = getTargetFragment();
            if (onInputSelected_Fragment != null){
                listener = (UserRoutine_Dialog.UserRoutineDialogListener ) onInputSelected_Fragment;
            }
            else {
                Activity onInputSelected_Activity = getActivity();
                listener = (UserRoutine_Dialog.UserRoutineDialogListener ) onInputSelected_Activity;
            }
            return listener;
        }catch(ClassCastException e){
            Log.e("Custom Dialog", "onAttach: ClassCastException: " + e.getMessage());
        }
        return null;
    }
}
