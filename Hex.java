import java.util.Scanner;
public class Hex{
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

    }
    public static void Classique() {
        int[][] plateau = new int[5][5];

        for(int i = 0;i<plateau.length;i++){
            for(int j = 0;j<plateau[i].length;j++){
                System.out.print(plateau[i][j]);
            }
            System.out.println();
        }
    }
}