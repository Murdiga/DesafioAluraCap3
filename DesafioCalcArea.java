import java.util.Scanner;

public class DesafioCalcArea {

    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        int escolha = 0;
        
        while (escolha != 3) {
        
            System.out.println("""
                -----------------Menu-----------------
                Por favor escolha uma das opções :
                1 - Calcular área de quadrado
                2 - Calcuar área do circulo
                3 - Sair""");
                escolha = scan.nextInt();
            
            switch (escolha) {

                case 1:

                    System.out.println("Por favor informe o tamanho de um dos lados do quadrado");
                    double area = scan.nextDouble();

                    area *= area;
                
                    System.out.println("Área do quadrado é : %.2f".formatted(area));

                    break;

                case 2:

                    System.out.println("Por favor informe o Raio do circulo");
                    double aCirculo = scan.nextDouble();

                    aCirculo *= aCirculo * 3.14;

                    System.out.println("Área do circulo é : %.2f".formatted(aCirculo));

                    break;
                
                case 3:

                    System.out.println("Sistema está sendo encerrado");

                    break;

                default:

                    System.out.println("Valor invalido, tente novamente");

                    break;
                    
            }

        }

    }

}
