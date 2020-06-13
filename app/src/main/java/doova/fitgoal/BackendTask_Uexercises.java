package doova.fitgoal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;

import java.util.ArrayList;

public class BackendTask_Uexercises extends AsyncTask<String, UserExercisesData, String> {

    private Context mContext;
    private ArrayList<UserExercisesData> data = new ArrayList<>();

    public BackendTask_Uexercises(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    protected String doInBackground(String... strings) {

        UserExercises_DBHandler dbHandler = new UserExercises_DBHandler(mContext);
        String method = strings[0];

        if(method.equals("add_exercise")){
            String name = strings[1];
            String image = strings[2];

            SQLiteDatabase db = dbHandler.getWritableDatabase();
            dbHandler.insertData(db, name, image);

            return "One Row Inserted...";
        }
        if(method.equals("display_exercises")){
            SQLiteDatabase db = dbHandler.getReadableDatabase();

            Cursor cursor = dbHandler.getData(db);

            String name, image;

            while(cursor.moveToNext()){
                name = cursor.getString(cursor.getColumnIndex(UserExercises_DBHandler.NAME));
                image = cursor.getString(cursor.getColumnIndex(UserExercises_DBHandler.IMAGE));

                UserExercisesData userExercisesData = new UserExercisesData(name, Integer.parseInt(image));

                publishProgress(userExercisesData);
            }
            return "Displaying Exercises...";
        }

        return null;
    }

    @Override
    protected void onProgressUpdate(UserExercisesData... values) {
        data.add(values[0]);
    }

    public ArrayList<UserExercisesData> getData() {
        return data;
    }
}
