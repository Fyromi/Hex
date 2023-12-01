import java.util.Scanner;
public class Hex{
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        if(Mode()==1)
            Classique();
        else if(Mode()==2)
            Aleatoir();
        else
            Special();
    }
}