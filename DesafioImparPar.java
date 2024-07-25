import java.util.Scanner;

public class DesafioImparPar {

    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe qualquer número inteiro para validar se é impar ou par");
        
        int vlr = scan.nextInt();

        if (vlr % 2 == 0) {
            
            System.out.println("Este número é par");

        }else{
            System.out.println("Este número é impar");
        }

    }

}
