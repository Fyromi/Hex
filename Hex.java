import java.util.Scanner;
public class Hex{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String mode;
        do{
            System.out.print("Veuillez choisir un mode de jeu :\n\n(1) pour le mode Classique\n(2) pour le mode Aleatoire\n(3) pour le mode Special\n\n>> ");
            mode = sc.nextLine();

            if((!mode.equals("1")) && (!mode.equals("2")) && (!mode.equals("3")))
                System.out.println("Erreur, la réponse n'est pas admise\n");
    
        }while(!mode.equals("1") && !mode.equals("2") && !mode.equals("3"));

        sc.close();
    }
}