package doova.fitgoal;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class BackendTask_SignUp extends AsyncTask<String,Contacts, String> {

    Context context;
    ContactsAdapter contactsAdapter;
    Activity activity;
    ListView listView;

    ArrayList<Contacts> arrayList = new ArrayList<>();

    BackendTask_SignUp(Context context){
        this.context = context;
        activity = (Activity) context;
    }

    public void getAdapter(ContactsAdapter adapter){
        this.contactsAdapter = adapter;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected String doInBackground(String... params) {

        String method = params[0];
        ContactsDBHandler dbHandler = new ContactsDBHandler(context);

        if(method.equals("add_contact")){
            String username = params[1];
            String email = params[2];
            String password = params[3];

            SQLiteDatabase db = dbHandler.getWritableDatabase();
            dbHandler.insertData(db, username, email, password);

            return "One Row Inserted...";
        }
        else if(method.equals("display_contacts")){
            listView = activity.findViewById(R.id.DisplayDB_ListView);
            SQLiteDatabase db = dbHandler.getReadableDatabase();
            Cursor cursor = dbHandler.getData(db);

            String username, email, password;

            while(cursor.moveToNext()){
                username = cursor.getString(cursor.getColumnIndex(ContactsDBHandler.USERNAME));
                email = cursor.getString(cursor.getColumnIndex(ContactsDBHandler.EMAIL));
                password = cursor.getString(cursor.getColumnIndex(ContactsDBHandler.PASSWORD));

                Contacts contacts = new Contacts(username, email, password);
                publishProgress(contacts);
            }
            return "displayed_contacts";
        }

        return null;
    }

    @Override
    protected void onPostExecute(String string) {

        if(string.equals("displayed_contacts")){
            //Bind the array adapter to the listview
            listView.setAdapter(contactsAdapter);
            contactsAdapter.addList(arrayList);
            Toast.makeText(context, "Post Execute: setAdapter Done", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(context, string, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onProgressUpdate(Contacts... values) {
        contactsAdapter.add(values[0]);
        arrayList.add(values[0]);
    }
}
