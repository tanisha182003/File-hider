import views.Welcome;

public class Main {
    public static void main(String[] args) {
        //entry point of appl
        Welcome w = new Welcome();
        do {
            w.welcomeScreen();
        }while(true);
    }
}
