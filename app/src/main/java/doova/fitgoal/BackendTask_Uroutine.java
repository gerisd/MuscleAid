package doova.fitgoal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;

import java.util.ArrayList;

public class BackendTask_Uroutine extends AsyncTask<String, String, String> {

    private Context mContext;
    private ArrayList<String> targeted_muscle = new ArrayList<>();

    public BackendTask_Uroutine(Context context) {
        this.mContext = context;
    }

    public ArrayList<String> getTargeted_muscle() {
        return targeted_muscle;
    }

    @Override
    protected String doInBackground(String... strings) {

        UserRoutine_DBHandler dbHandler = new UserRoutine_DBHandler(mContext);
        String method = strings[0];

        if(method.equals("add_routine")){
            String muscleGroup = strings[1];
            SQLiteDatabase db = dbHandler.getWritableDatabase();
            dbHandler.insertData(db, muscleGroup);

            return "One Row Inserted...";
        }

        if(method.equals("display_routine")){
            SQLiteDatabase db = dbHandler.getReadableDatabase();

            Cursor cursor = dbHandler.getData(db);
            cursor.moveToFirst();

            String muscleGroup;

            while(cursor.moveToNext()){
                muscleGroup = cursor.getString(cursor.getColumnIndex(UserRoutine_DBHandler.TARGETED_MUSCLE));

                publishProgress(muscleGroup);
            }
            return "Displaying Exercises...";
        }

        return null;
    }

    @Override
    protected void onProgressUpdate(String... values) {
        targeted_muscle.add(values[0]);
    }
}
