package pl.akademia108;

public class User {

    private int id;
    private String username;
    private String password;
    private boolean isLogged;
    private String description;

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.isLogged = false;
        this.description = "-";
    }

    public User(int id, String username, String password, String description) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.isLogged = false;
        this.description = description;
    }


    public void login(String username, String password) {
        if(username == this.username && password == this.password) {
            this.isLogged = true;
            System.out.println("Zalogowano");
        } else {
            System.out.println("Błędne dane");
        }
    }

    public String printInfo() {
        if(isLogged) {
            return "Użytkownik " + username + " jest zalogowany. Jego opis to " + description;
        } else {
            return "Użytkownik " + username + " nie jest zalogowany. Jego opis to " + description;
        }
    }

    public void logout() {
        this.isLogged = false;
        System.out.println("wylogowano");
    }
}