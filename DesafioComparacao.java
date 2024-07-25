import java.util.Scanner;

public class DesafioComparacao {
    
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe dois número inteiro para realizarmos a comparação");
        int int1 = scan.nextInt();

        System.out.println("Por favor informe o segundo número");
        int int2 = scan.nextInt();

        if (int1 > int2) {
            
            System.out.println("Os números são diferentes e o primeiro número (%d) é maior que o segundo (%d)".formatted(int1, int2));

        }else if (int1 == int2) {

            System.out.println("Os números são iguais, nenhum é maior que o outro neste caso");
            
        }else{
            System.out.println("Os números são diferentes e o segundo número (%d) é maior que o primeiro (%d)".formatted(int2, int1));
        }

    }
}
