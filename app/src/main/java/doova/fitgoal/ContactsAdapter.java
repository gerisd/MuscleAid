package doova.fitgoal;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ContactsAdapter extends ArrayAdapter {

    List list = new ArrayList();

    //Menu Search
    Context context;
    ArrayList<Contacts> contactsArrayList = new ArrayList<>();

    public ContactsAdapter(Context context, int resource){
        super(context, resource);
        this.context = context;
    }

    public void addList(ArrayList<Contacts> Oldarraylist){
        this.contactsArrayList = Oldarraylist;
    }

    public void add(@Nullable Contacts object) {
        list.add(object);
        super.add(object);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Nullable
    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //Referencing each database row as a View object
        View row = convertView;
        ContactsHolder contactsHolder;

        if (row == null) {
            //No view, creating one

            LayoutInflater layoutInflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = layoutInflater.inflate(R.layout.display_contacts_row, parent, false);

            //Locate the views in row.xml
            contactsHolder = new ContactsHolder();
            contactsHolder.Username = row.findViewById(R.id.USERNAME_Display_Text);
            contactsHolder.Email = row.findViewById(R.id.EMAIL_Display_Text);
            contactsHolder.Password = row.findViewById(R.id.PASSWORD_Display_Text);

            //Reference to object that references on some parts of layout(displaying in ListView) instead of findViewById.
            row.setTag(contactsHolder);
        } else {
            //Recycle existing view
            contactsHolder = (ContactsHolder) row.getTag();
        }

        //Have a reference to the returning view, we set its values
        final Contacts contacts = (Contacts) getItem(position);
        contactsHolder.Username.setText(contacts.get_username().toString());
        contactsHolder.Email.setText(contacts.get_email().toString());
        contactsHolder.Password.setText(contacts.get_password().toString());

        row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DisplayContacts_onClick.class);
                intent.putExtra("username", contacts.get_username());
                intent.putExtra("email", contacts.get_email());
                intent.putExtra("password", contacts.get_password());

                context.startActivity(intent);
            }
        });

        return row;

    }

    //Database Search Bar Filter
    public void filter(String charText){
        charText = charText.toLowerCase(Locale.getDefault());
        list.clear();

        if(charText.length() == 0){
            list.addAll(contactsArrayList);
        }
        else{
            for(Contacts contacts : contactsArrayList){
                if(contacts.get_username().toLowerCase(Locale.getDefault()).contains(charText)){
                    list.add(contacts);
                }
            }
        }
        notifyDataSetChanged();
    }

    private static class ContactsHolder{
        TextView Username, Email, Password;
    }
}
