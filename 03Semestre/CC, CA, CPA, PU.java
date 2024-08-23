import java.util.Scanner;

public class Main{

    public static class CustosPrimarios {
        public static float calcularLec(int CA, float CC, float CPA, float PU) {
            return (float) Math.sqrt((2 * CA * CC) / (CPA * PU));
        }
    }

    public static class CustosSecundarios {
        public static float calcularC(int A, float PU) {
            return (A / 2.0f) * PU;
        }

        public static float calcularD(float CPA, float C) {
            return CPA * C;
        }

        public static float calcularE(float CC, int B) {
            return CC * B;
        }

        public static float calcularF(float D, float E) {
            return D + E;
        }
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a quantidade pedida: ");
        int A = leia.nextInt();

        System.out.print("[CA] Insira o consumo anual em quantidade: ");
        int CA = leia.nextInt();

        System.out.print("[CC] Insira o custo do pedido de compra: ");
        float CC = leia.nextFloat();

        System.out.print("[CPA] Insira o custo do material armazenado: ");
        float CPA = leia.nextFloat();

        System.out.print("[PU] Insira  o preço unitário: ");
        float PU = leia.nextFloat();
        
        System.out.println("\n");

        float LEC = CustosPrimarios.calcularLec(CA, CC, CPA, PU);
        System.out.printf("\n Lote Econômico (LEC): %.2f\n", LEC);
        
        int B = CA / A;

        float C = CustosSecundarios.calcularC(A, PU);
        float D = CustosSecundarios.calcularD(CPA, C);
        float E = CustosSecundarios.calcularE(CC, B);
        float F = CustosSecundarios.calcularF(D, E);
        
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> \n");
        
        System.out.printf("Número de pedidos anuais (B): %d\n", B);
        System.out.printf("Estoque médio (C): %.2f\n", C);
        System.out.printf("Custo da posse (D): %.2f\n", D);
        System.out.printf("Custo do pedido (E): %.2f\n", E);
        System.out.printf("Custo Total (F): %.2f\n", F);

        leia.close();
    }
}
