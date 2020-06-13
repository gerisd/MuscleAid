package doova.fitgoal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class UserRoutine_DBHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "RoutineCustomization.db";
    private static final String TABLE_NAME = "UsersCustomizedRoutine";
    public static final String TARGETED_MUSCLE = "musclegroup";

    private static final String create_query = "CREATE TABLE " + TABLE_NAME + " (" +
           TARGETED_MUSCLE + " TEXT NOT NULL" + ");";

    private static final String delete_query = "DROP TABLE IF EXISTS " + TABLE_NAME + ";";

    public UserRoutine_DBHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        Log.d("Database Operations", "Database Created...");
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(create_query);
        Log.d("Database Operations", "Table Created...");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(delete_query);
        onCreate(sqLiteDatabase);
        Log.d("Database Operations", "Database Updated...");
    }

    public void insertData(SQLiteDatabase db, String targeted_muscle){
        ContentValues values = new ContentValues();

        values.put(TARGETED_MUSCLE, targeted_muscle);

        db.insert(TABLE_NAME, null, values);
        db.close();
        Log.d("Database Operations", "One Row Created...");
    }

    public Cursor getData(SQLiteDatabase db){
        String[] projections = {TARGETED_MUSCLE};

        Cursor cursor = db.query(TABLE_NAME, projections, null, null, null, null, null);

        return cursor;
    }
}
