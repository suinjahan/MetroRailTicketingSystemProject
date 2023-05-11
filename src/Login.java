public class Login {
    private String username;
    private String password;

    public Login(String user, String pass) {
        this.username = user;
        this.password = pass;
    }

    public boolean login(String enteredUsername, String enteredPassword) {
        if (this.username.equals(enteredUsername) && this.password.equals(enteredPassword)) {
            System.out.println("Login successful");
            return true;
        } else {
            System.out.println("Invalid username or password");
            return false;
        }
    }
}