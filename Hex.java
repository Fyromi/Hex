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

        return bMode;
                
    }
    
    public static void Classique() {
        int dimension;
        Scanner sc = new Scanner(System.in);

        // Recupère et verifie que l'entrée est comprise entre 9 et 14;
        do{
            System.out.print("Quelle est la dimension souhaitée pour le plateau (de 9x9 jusqu’à 14x14)\n>> ");
                dimension = sc.nextInt();
            
            if(dimension<9||dimension>14)
                System.out.println("ERREUR : la dimension n'est pas admise\n");
    
        }while((dimension<9)||( dimension >14));

        char[][] plateau = new char[dimension+3][2*dimension+2];
    }
    public static void Special() {
        
    }
    public static void Aleatoire() {
        
    }
}
