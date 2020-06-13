package doova.fitgoal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Muscle_Exercises_Adapter extends RecyclerView.Adapter<Muscle_Exercises_Adapter.ExerciseViewHolder> {

    public ArrayList<Muscle_Exercises_Info> muscleExercisesInfo;
    public Context mContext;

    public Muscle_Exercises_Adapter(Context mContext, ArrayList<Muscle_Exercises_Info> muscleExercisesInfo) {
        this.muscleExercisesInfo = muscleExercisesInfo;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ExerciseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.muscle_exercises_row, parent, false);

        ExerciseViewHolder viewHolder = new ExerciseViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ExerciseViewHolder holder, int position) {
        final Muscle_Exercises_Info current_item = muscleExercisesInfo.get(position);

        holder.Workout_Image.setImageResource(current_item.getWorkout_Image());
        holder.Workout_Name.setText(current_item.getWorkout_name());
        holder.Workout_Description.setText(current_item.getTargeted_Muscles());

        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "Exercise " + current_item.getWorkout_name() + " was successfully added", Toast.LENGTH_SHORT).show();

                //The exercise the user selects is added to the db to be displayed in the users routine
                BackendTask_Uexercises backendTask_uexercises_add = new BackendTask_Uexercises(mContext);
                backendTask_uexercises_add.execute("add_exercise", current_item.getWorkout_name(), String.valueOf(current_item.getWorkout_Image()));

                Bundle bundle = new Bundle();
                bundle.putString("workout name", current_item.getWorkout_name());
                bundle.putInt("workout image", current_item.getWorkout_Image());

                UserExercisesFragment fragment = new UserExercisesFragment();
                fragment.setArguments(bundle);

                Log.d("Database Operations", "User Exercise Selection Saved...");
            }
        });
    }

    @Override
    public int getItemCount() {
        return muscleExercisesInfo.size();
    }

    public static class ExerciseViewHolder extends RecyclerView.ViewHolder{
        private ImageView Workout_Image;
        private TextView Workout_Name;
        private TextView Workout_Description;
        private RelativeLayout relativeLayout;

        public ExerciseViewHolder(View view){
            super(view);
            Workout_Image = view.findViewById(R.id.Muscle_Workout_Image);
            Workout_Name = view.findViewById(R.id.Muscle_Workout_Name);
            Workout_Description = view.findViewById(R.id.Muscle_TargetedMuscles_Description);

            relativeLayout = view.findViewById(R.id.Muscle_Exercise_RelativeLayout);
        }
    }
}
