import java.util.Scanner;

public class DesafioTabuada {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Por favor informe qual número deseja gerar uma tabuada");
            
        int valor = scan.nextInt();

        System.out.println("Tabuada do número %d :".formatted(valor));

        for(int i = 1; i <= 10; i++){

            System.out.println("%d x %d = %d".formatted(valor, i, valor * i));

        }

    }

}
