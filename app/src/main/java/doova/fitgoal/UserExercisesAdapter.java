package doova.fitgoal;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class UserExercisesAdapter extends RecyclerView.Adapter<UserExercisesAdapter.ExerciseViewHolder> {

    public ArrayList<UserExercisesData> muscleExercisesInfo;
    public Context mContext;

    public UserExercisesAdapter(Context mContext, ArrayList<UserExercisesData> muscleExercisesInfo) {
        this.muscleExercisesInfo = muscleExercisesInfo;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ExerciseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_exercises_row, parent, false);

        ExerciseViewHolder viewHolder = new ExerciseViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ExerciseViewHolder holder, int position) {
        final UserExercisesData current_item = muscleExercisesInfo.get(position);

        holder.Workout_Image.setImageResource(current_item.getWorkout_image());
        holder.Workout_Name.setText(current_item.getWorkout_name());

        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, Tab_Exercise_Progress.class);
                mContext.startActivity(intent);
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
        private RelativeLayout relativeLayout;

        public ExerciseViewHolder(View view){
            super(view);
            Workout_Image = view.findViewById(R.id.Workout_Image);
            Workout_Name = view.findViewById(R.id.Workout_Name);

            relativeLayout = view.findViewById(R.id.User_Exercise_RelativeLayout);
        }
    }
}
