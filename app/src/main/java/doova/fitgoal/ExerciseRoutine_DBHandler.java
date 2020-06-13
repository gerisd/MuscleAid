package doova.fitgoal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class ExerciseRoutine_DBHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "EroutineDB.db";
    private static final String TABLE_NAME = "RoutineFolderData";
    public static final String NAME = "name";
    public static final String SPLIT = "split";

    private static final String create_query = "CREATE TABLE " + TABLE_NAME + " (" +
            NAME + " TEXT NOT NULL," + SPLIT + " TEXT NOT NULL" + ");";

    private static final String delete_query = "DROP TABLE IF EXISTS " + TABLE_NAME + ";";

    public ExerciseRoutine_DBHandler(Context context) {
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

    public void insertData(SQLiteDatabase db, String name, String split){
        ContentValues values = new ContentValues();

        values.put(NAME, name);
        values.put(SPLIT, split);

        db.insert(TABLE_NAME, null, values);
        db.close();
        Log.d("Database Operations", "One Row Created...");
    }

    public Cursor getData(SQLiteDatabase db){
        String[] projections = {NAME, SPLIT};

        Cursor cursor = db.query(TABLE_NAME, projections, null, null, null, null, null);

        return cursor;
    }
}
