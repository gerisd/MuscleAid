package doova.fitgoal;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class BackendTask_Eroutine extends AsyncTask<String, ExerciseRoutine_Information, String> {

    private Context mContext;

    private ArrayList<ExerciseRoutine_Information> eRoutineData = new ArrayList<>();

    public RecyclerView recyclerView;
    Activity activity;

    public BackendTask_Eroutine(Context context) {
        this.mContext = context;
        activity = (Activity) context;
    }

    public ArrayList<ExerciseRoutine_Information> getRoutineList() {
        return eRoutineData;
    }

    @Override
    protected String doInBackground(String... strings) {

        ExerciseRoutine_DBHandler dbHandler = new ExerciseRoutine_DBHandler(mContext);

        String method = strings[0];

        if(method.equals("add_eRoutine")){
            String name = strings[1];
            String split = strings[2];

            SQLiteDatabase db = dbHandler.getWritableDatabase();
            dbHandler.insertData(db, name, split);

            return "One Row Inserted...";
        }

        if(method.equals("display_eRoutine")){

            recyclerView = activity.findViewById(R.id.ExerciseRoutine_Recycler);

            SQLiteDatabase db = dbHandler.getReadableDatabase();
            Cursor cursor = dbHandler.getData(db);

            String name, split;

            while(cursor.moveToNext()){
                name = cursor.getString(cursor.getColumnIndex(ExerciseRoutine_DBHandler.NAME));
                split = cursor.getString(cursor.getColumnIndex(ExerciseRoutine_DBHandler.SPLIT));

                ExerciseRoutine_Information info = new ExerciseRoutine_Information(name, split);

                publishProgress(info);
            }
            return "Display eRoutine";
        }

        return null;
    }

    @Override
    protected void onProgressUpdate(ExerciseRoutine_Information... values) {
        eRoutineData.add(values[0]);
    }
}
