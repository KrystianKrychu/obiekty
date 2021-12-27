package pl.akademia108;

public class Main {

    public static void main(String[] args) {
        User user = new User(1,"adam", "1234");

        user.login("adam", "1234"); //zalogowany

        user.login("adam", "12345"); //błąd

        User userWithDescription = new User(2, "tomek", "qwerty", "Tomek to bardzo miły człowiek");

        userWithDescription.login("tomek", "qwerty");

        System.out.println(userWithDescription.printInfo());

        user.logout();
        userWithDescription.logout();
    }
}
