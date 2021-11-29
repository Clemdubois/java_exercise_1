import java.util.*;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("Bienvenue sur le terminal de monsieur roule.");
        Scanner sc = new Scanner(System.in);

        while(sc.next().compareTo("quit") != 0){
            System.out.println("Unknown Command");
        }
        System.out.println("Sortie classique");
    }
}
