import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tabuada;

        System.out.println("Tabuada de número: ");
        tabuada = scan.nextInt();

        System.out.println("Tabuada de número " + tabuada);
        for(int i = 0; i <= 10; i++){
            System.out.println(tabuada + " x " + + i + " = " + (tabuada * i));
        }
    }
}
