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
    
    /**
     * 
     */
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

        char[][] plateau = new char[dimension+3][dimension+2];

        //Remplissage du Plateau
        
        char lettre='A';
        for(int ligne = 0; ligne<plateau.length; ligne++){ 
            for(int colone = 1; colone < plateau[ligne].length-1 ; colone++){

                plateau[ligne][colone+1]='*';
                
                //affiche les lettre et les underscor a partir de la 3e colonne
                if(colone!=0 && ligne==1 && colone+1 <= plateau[ligne].length-1){
                        plateau[0][colone+1] = lettre;
                        plateau[1][colone+1]='─';
                        lettre++;
                }
                if(ligne==plateau.length-1)
                        plateau[ligne][colone+1]='─';
            }
                //affiche les slash au début de chaque ligne
                if(ligne!=plateau.length-1 && ligne !=1 && ligne !=0)
                    plateau[ligne][1]=92;
                plateau[plateau.length-1][1]=' ';  
        }
        
        //Affichage du plateau
        for(int ligne = 0;ligne<plateau.length;ligne++){
            if(ligne==1)
                System.out.print(" ");
            for(int nb_espace = 1 ; nb_espace < ligne ; nb_espace++){
                System.out.print(" ");
            }
            for(int colone = 0;colone<plateau[ligne].length;colone++){
                System.out.print(plateau[ligne][colone]);
            }

            if (ligne>=2 && ligne!=plateau.length-1) {
                System.out.print((char)92);
                System.out.println(" "+(ligne-1));
            }
            else
                System.out.println();
        }
        System.err.println();
        System.out.println("Joueur 1 : Indiquer les coordoner de votre pion \n>> ");
        
    }
    public static void Special() {
        
    }
    public static void Aleatoire() {
        
    }
}
