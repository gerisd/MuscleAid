package doova.fitgoal;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class UserRoutineAdapter extends RecyclerView.Adapter<UserRoutineAdapter.RoutineViewHolder> {

    private ArrayList<String> Chosen_Exercises;
    private Context mContext;

    public UserRoutineAdapter(Context context, ArrayList<String> chosen_Exercises) {
        Chosen_Exercises = chosen_Exercises;
        mContext = context;
    }

    @NonNull
    @Override
    public RoutineViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_routine_row, parent, false);
        UserRoutineAdapter.RoutineViewHolder routineViewHolder = new UserRoutineAdapter.RoutineViewHolder(view);
        return routineViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RoutineViewHolder holder, int position) {

        holder.Exercise_Text.setText("Day " + position + 1 + ": ");
        holder.Exercise_Text.append(Chosen_Exercises.get(position));

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, UserExercises.class);
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return Chosen_Exercises.size();
    }

    public static class RoutineViewHolder extends RecyclerView.ViewHolder{

        private TextView Exercise_Text;
        private CardView cardView;


        public RoutineViewHolder(View itemView){
            super(itemView);
            Exercise_Text = itemView.findViewById(R.id.UserRoutineName);
            cardView = itemView.findViewById(R.id.UserRoutine_RowCardView);
        }

    }
}
