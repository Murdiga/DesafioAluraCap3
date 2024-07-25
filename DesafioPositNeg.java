import java.util.Scanner;

public class DesafioPositNeg {
    public static void main(String[] args) throws Exception {
        
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor informe qualquer numero que desejar");
        double num = scan.nextDouble();

        if (num > 0) {

            System.out.println("Este número é positivo");

        }else if (num < 0){

            System.out.println("Este número é negativo");
        
        }else{
            
            System.out.println("O número zero é neutro");

        }

    }
}
