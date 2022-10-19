import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int contador = 0;
        int maior = 0;
        int soma = 0;

        do{
            System.out.println("Número: ");
            numero = scan.nextInt();
            soma = soma + numero;
            System.out.println("Soma: " +  soma);


            if(numero > maior) maior = numero;
            
            contador = contador + 1;

        }while(contador < 5);

        System.out.println("O maior número é: " + maior);
        System.out.println("Sua média é: " + (soma/5));
    }
}
