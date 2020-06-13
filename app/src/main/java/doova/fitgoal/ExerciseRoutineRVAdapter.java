package doova.fitgoal;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class ExerciseRoutineRVAdapter extends ExerciseRoutineRVCursorAdapter<ExerciseRoutineRVAdapter.RoutineViewHolder> {

    private static final String TAG = ExerciseRoutineRVAdapter.class.getSimpleName();
    private ArrayList<ExerciseRoutine_Information> routine_information;
    private final Context mContext;
    private final Random mRandom;

    public ExerciseRoutineRVAdapter(Context context, ArrayList<ExerciseRoutine_Information> routine){
        super(null);
        mContext = context;
        mRandom = new Random(System.currentTimeMillis());
        routine_information = routine;

        //Sort Order: Ascending, by date.
        //String sortOrder = ProductContract.ProductEntry.COLUMN_DATE + " ASC";
        //Uri productForLocationUri = ProductContract.ProductEntry
        //        .buildProductLocationWithStartDate(locationSettings, System.currentTimeMillis());

        //Students: Uncomment the next lines to display what what you stored in the bulkInsert
        //Cursor cursor = mContext.getContentResolver()
        //        .query(productForLocationUri, null, null, null, sortOrder);

        //Cursor cursor = mContext.getContentResolver()
        //        .query()

        //swapCursor(cursor);
    }

    @Override
    public ExerciseRoutineRVAdapter.RoutineViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
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
    protected void onBindViewHolder(RoutineViewHolder holder, Cursor cursor) {
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
