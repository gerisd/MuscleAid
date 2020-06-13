package doova.fitgoal;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import maes.tech.intentanim.CustomIntent;

public class Exercise_NameList_Fragment extends Fragment {

    CardView Legs, Chest, Back, Deltoids, Biceps, Triceps, Abs, Traps, Forearms, Calves;

    NameList_Listener activityCommander;

    public interface NameList_Listener{
        void LegExercises();
        void ChestExercises();
        void BackExercises();
        void DeltExercises();
        void BicepExercises();
        void TricepExercises();
        void AbsExercises();
        void TrapExercises();
        void ForearmsExercises();
        void CalvesExercises();
    }

    @Override
    public void onAttach(Context context) {
        try{
            activityCommander = (NameList_Listener) context;
        }catch(ClassCastException e){
            throw new ClassCastException(context.toString());
        }

        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.exercise_namelist_fragment, container, false);

        Legs = view.findViewById(R.id.ExerciseLegs_CardView);
        Chest = view.findViewById(R.id.ExerciseChest_CardView);
        Back = view.findViewById(R.id.ExerciseBack_CardView);
        Deltoids = view.findViewById(R.id.ExerciseDelts_CardView);
        Biceps = view.findViewById(R.id.ExerciseBiceps_CardView);
        Triceps = view.findViewById(R.id.ExerciseTriceps_CardView);
        Abs = view.findViewById(R.id.ExerciseAbs_CardView);
        Traps = view.findViewById(R.id.ExerciseTraps_CardView);
        Forearms = view.findViewById(R.id.ExerciseForearms_CardView);
        Calves = view.findViewById(R.id.ExerciseCalves_CardView);

        Legs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityCommander.LegExercises();
            }
        });

        Chest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityCommander.ChestExercises();
            }
        });

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityCommander.BackExercises();
            }
        });

        Deltoids.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityCommander.DeltExercises();
            }
        });

        Biceps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityCommander.BicepExercises();
            }
        });

        Triceps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityCommander.TricepExercises();
            }
        });

        Abs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityCommander.AbsExercises();
            }
        });

        Traps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityCommander.TrapExercises();
            }
        });

        Forearms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityCommander.ForearmsExercises();
            }
        });

        Calves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityCommander.CalvesExercises();
            }
        });

        return view;
    }


}
