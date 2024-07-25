import java.util.Scanner;

public class DesafioFatorial {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe o número inteiro que deseja que seja realizado a fatorial");
        int numF = scan.nextInt();

        int fatorial = 1;

        for(int i = 1; i <= numF; i++){

            fatorial *= i;

        }

        System.out.println("A fatorial do número %d".formatted(fatorial));

    }

}
