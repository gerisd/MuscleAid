package doova.fitgoal;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SearchView;

public class DisplayContacts extends AppCompatActivity {

    ListView listview;
    ContactsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_contacts_layout);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("User Registration");
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#424242")));

        listview = findViewById(R.id.DisplayDB_ListView);

        BackendTask_SignUp backendTask_signUp = new BackendTask_SignUp(this);
        backendTask_signUp.execute("display_contacts");

        adapter = new ContactsAdapter(this, R.layout.display_contacts_row);
        backendTask_signUp.getAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.db_menu, menu);

        MenuItem myActionMenuItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) myActionMenuItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {

                if(TextUtils.isEmpty(s)){
                    adapter.filter("");
                    listview.clearTextFilter();
                }
                else{
                    adapter.filter(s);
                }

                return true;
            }
        });

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.action_settings){
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
