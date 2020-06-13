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

public class ExerciseRoutineAdapter extends RecyclerView.Adapter<ExerciseRoutineAdapter.RoutineViewHolder> {

    private ArrayList<ExerciseRoutine_Information> routine_information;
    private Context mContext;

    public ExerciseRoutineAdapter(Context context, ArrayList<ExerciseRoutine_Information> routine){
        routine_information = routine;
        mContext = context;
    }

    @NonNull
    @Override
    public RoutineViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.exercise_routine_row, parent, false);
        RoutineViewHolder routineViewHolder = new RoutineViewHolder(view);
        return routineViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RoutineViewHolder holder, int position) {
        final ExerciseRoutine_Information current_routine = routine_information.get(position);

        holder.RoutineName.setText(current_routine.getRoutine_name());
        holder.RoutineSplit.setText(current_routine.getRoutine_Split());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

               Intent intent = new Intent(mContext, UserRoutine.class);
               intent.putExtra("Routine Name", current_routine.getRoutine_name());
               intent.putExtra("Routine Split", current_routine.getRoutine_Split());
               mContext.startActivity(intent);
                }
        });
    }

    @Override
    public int getItemCount() {
        return routine_information.size();
    }

    public static class RoutineViewHolder extends RecyclerView.ViewHolder{

        private TextView RoutineName;
        private TextView RoutineSplit;
        private CardView cardView;

        public RoutineViewHolder(View itemView){
            super(itemView);
            RoutineName = itemView.findViewById(R.id.ExerciseRoutineName);
            RoutineSplit = itemView.findViewById(R.id.ExerciseRoutineSplit);
            cardView = itemView.findViewById(R.id.ExerciseRoutine_RowCardView);
        }

    }
}
