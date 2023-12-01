import java.util.Scanner;
public class Hex{
    public static void main(String[] args){
        if(Mode()==1)
            Classique();
        else if(Mode()==2)
            Aleatoire();
        else
            Special();
    }

    public static int Mode() {
        Scanner sc = new Scanner(System.in);
        String cMode;
        byte bMode;

        do{
            System.out.print("Veuillez choisir un mode de jeu :\n\n(1) pour le mode Classique\n(2) pour le mode Aleatoire\n(3) pour le mode Special\n\n>> ");
            cMode = sc.nextLine();

            if((!cMode.equals("1")) && (!cMode.equals("2")) && (!cMode.equals("3")))
                System.out.println("Erreur, la réponse n'est pas admise\n");
    
        }while(!cMode.equals("1") && !cMode.equals("2") && !cMode.equals("3"));

        if(cMode.equals("1"))
            bMode =1;
        else if(cMode.equals("2"))
            bMode =2;
        else
            bMode =3;
        
        sc.close();

        return bMode;
                
    }
    
    public static void Classique() {
        
    }
    public static void Special() {
        
    }
    public static void Aleatoire() {
        
    }
}
