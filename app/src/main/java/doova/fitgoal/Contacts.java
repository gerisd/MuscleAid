package doova.fitgoal;

public class Contacts {

    private String _username;
    private String _email;
    private String _password;

    public Contacts(){}

    public Contacts(String username, String email, String password){
        this._username = username;
        this._email = email;
        this._password = password;
    }

    public String get_username() {
        return _username;
    }

    public void set_username(String _username) {
        this._username = _username;
    }

    public String get_email() {
        return _email;
    }

    public void set_email(String _email) {
        this._email = _email;
    }

    public String get_password() {
        return _password;
    }

    public void set_password(String _password) {
        this._password = _password;
    }
}
