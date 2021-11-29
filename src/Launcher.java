import java.util.*;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("Bienvenue sur le terminal de monsieur roule.");
        Scanner sc = new Scanner(System.in);
        String i = sc.next();

        if(i.compareTo("quit") == 0){
            System.out.println("Sortie classique");
        }
        else{
            System.out.println("Unknown Command");
        }

    }
}
