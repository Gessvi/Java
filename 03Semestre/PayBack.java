import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        float soma = 0;
        float total;
        
        System.out.println("\t\t --Tempo de Retorno da empresa-- \n\n");
        
        
        System.out.println("Valor do Inicial: ");
        int valorInicial = leia.nextInt();
        
        leia.nextLine();
        
        for(int i = 0; i < 10; i++){
            System.out.println( (i + 1) + "º Saldo Recebido: ");
            float saldo = leia.nextFloat();
            
            soma += saldo;
        }
        
        float total1;
        float total2;
        
        total1 = soma / 10;
        total2 = valorInicial / total1;
        System.out.println("Total do retorno em meses: " +total2);
        
        
        leia.close();
    }
}
