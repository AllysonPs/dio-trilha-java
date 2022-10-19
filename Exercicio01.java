import java.util.Scanner;

public class Exercicio01{

    public static void main(String [] args){
        int numero;
        int contador = 0;
        int qntNumeros;
        int qntPares = 0, qntImpar = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantidade de números: ");
        qntNumeros = scan.nextInt();

        do{
            System.out.println("Números: ");
            numero = scan.nextInt();

            if(numero % 2 == 0) qntPares++;
            else qntImpar++;

            contador++;

        }while(contador < qntNumeros);


        System.out.println("Quantidade Par: " + qntPares);
        System.out.println("Quantidades Impar: " + qntImpar);
    }
}