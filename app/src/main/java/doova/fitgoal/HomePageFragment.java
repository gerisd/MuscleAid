package doova.fitgoal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HomePageFragment extends Fragment {

    CardView Exercise, Note, Planner, Progress, Settings;

    HomePageListener activityCommander;

    public interface HomePageListener{
       void GoToExercise(View view);
       void GoToNotes(View view);
       void GoToPlanner(View view);
       void GoToProgress(View view);
       void GoToSettings(View view);
    }

    @Override
    public void onAttach(Context context) {
        try{
            activityCommander = (HomePageListener) context;
        }catch (ClassCastException e){
            throw new ClassCastException(context.toString());
        }

        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.homepage_fragment, container, false);

        Exercise = view.findViewById(R.id.ExerciseCardView);
        Exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityCommander.GoToExercise(view);
            }
        });

        Planner = view.findViewById(R.id.PlannerCardView);
        Planner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityCommander.GoToPlanner(view);
            }
        });

        return view;
    }

}
