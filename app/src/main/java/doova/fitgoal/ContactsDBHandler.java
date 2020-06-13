//User information SQL databse handler

package doova.fitgoal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class ContactsDBHandler extends SQLiteOpenHelper{

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "ContactsDB.db";
    private static final String TABLE_NAME = "LoginInformation";
    public static final String UID = "_id";
    public static final String USERNAME = "username";
    public static final String EMAIL = "email";
    public static final String PASSWORD = "password";

    private static final String create_query = "CREATE TABLE " + TABLE_NAME + " (" + UID +
            " INTEGER PRIMARY KEY AUTOINCREMENT," + USERNAME + " TEXT NOT NULL," +
            EMAIL + " TEXT NOT NULL," + PASSWORD + " TEXT NOT NULL" + ");";

    public ContactsDBHandler(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(create_query);
        Log.d("Database Operations", "Table Created...");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public void insertData(SQLiteDatabase db, String Username, String Email, String Password){
        ContentValues values = new ContentValues();

        //put(key,value) where key is the column name in the database and value is value to store in the column
        values.put(USERNAME, Username);
        values.put(EMAIL, Email);
        values.put(PASSWORD, Password);

        db.insert(TABLE_NAME, null, values);
        db.close();
        Log.d("Database Operations", "Contact Inserted...");
    }

    public Cursor getData(SQLiteDatabase db){
        String[] projections = {USERNAME, EMAIL, PASSWORD};

        Cursor cursor = db.query(TABLE_NAME, projections,null, null, null, null, null);

        return cursor;
    }

    public void deleteData(String userName){
        //Reference to the db
        SQLiteDatabase db = getWritableDatabase();

        //Delete from this table where ever the product name is equal to whatever the ContactName we passed in
        db.execSQL("DELETE FROM " + TABLE_NAME + " WHERE "+ USERNAME + "=\"" + userName + "\";");
        Log.d("Database Operations", userName + "Deleted");

        if(db != null) {
            db.close();
        }
    }

    //Find password for username
    public String searchPass(String username){
        SQLiteDatabase db = getReadableDatabase();

        String[] columns = {USERNAME, PASSWORD};
        String[] selectionArgs = {username};

        //Create database search for user and pass columns only where username = login user
        //First input is username, (0), and second input is password, (1)
        Cursor cursor = db.query(TABLE_NAME, columns, USERNAME + " =?", selectionArgs, null, null, null);

        String db_user;
        String db_pass = "Password not found";

        if(cursor.moveToFirst()){
            do {
                db_user = cursor.getString(0);

                if(db_user.equals(username)){
                    db_pass = cursor.getString(1);
                    break;
                }
            }while(cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return db_pass;
    }

    //Check if username exists
    public boolean UsernameExists(String username){
        SQLiteDatabase db = getReadableDatabase();

        String[] column = {USERNAME};
        String[] selectionArgs = {username};

        Cursor cursor = db.query(TABLE_NAME, column, USERNAME + "=? ", selectionArgs, null, null, null);

        if(cursor.moveToFirst()) {
            String db_user = cursor.getString(0);
            if(db_user.equals(username)){
                return true;
            }
        }

        return false;
    }

    public boolean EmailExists(String Email){
        SQLiteDatabase db = getReadableDatabase();

        String[] column = {EMAIL};
        String[] selectionArgs = {Email};

        Cursor cursor = db.query(TABLE_NAME, column, EMAIL + " =?", selectionArgs, null, null, null);

        if (cursor.moveToFirst()) {
            String db_email = cursor.getString(0);
            if(db_email.equals(Email)){
                return true;
            }
        }

        return false;
    }

    public String dataToString(){
        String dbString = "";
        SQLiteDatabase db = getWritableDatabase();

        //*Select every column
        //1 from every row
        String query = "SELECT * FROM " + TABLE_NAME + " WHERE 1";

        //Cursor point to location in results
        Cursor cursor = db.rawQuery(query, null);
        //Move cursor to first row in results
        cursor.moveToFirst();

        //While not passed the last time
        while(!cursor.isAfterLast()){
            if(cursor.getString(cursor.getColumnIndex("username")) != null){
                dbString += cursor.getString(cursor.getColumnIndex("username"));
                dbString += "\n";
            }
            cursor.moveToNext();
        }

        if(cursor != null) {
            cursor.close();
        }
        if(db != null) {
            db.close();
        }
        return dbString;
    }
}
