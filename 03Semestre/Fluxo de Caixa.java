import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        float[] respostas = new float[72];
        float saldoAntPrevisto, saldoAntRealizado;
        float saldoTotalPrevisto = 0, saldoTotalRealizado = 0;

        System.out.print("Saldo Anterior Previsto: R$");
        saldoAntPrevisto = input.nextFloat();
        
        System.out.print("Saldo Anterior Realizado: R$");
        saldoAntRealizado = input.nextFloat();

        for (int mes = 1; mes <= 3; mes++) {
            System.out.println("\n=== MES " + mes + " ===");
            
            // PREVISTO
            System.out.println("\nPREVISTO " + mes);
            saldoTotalPrevisto = processarFluxo(respostas, saldoAntPrevisto, (mes - 1) * 24, true);
            saldoAntPrevisto = saldoTotalPrevisto;

            // REALIZADO
            System.out.println("\nREALIZADO " + mes);
            saldoTotalRealizado = processarFluxo(respostas, saldoAntRealizado, (mes - 1) * 24 + 12, false);
            saldoAntRealizado = saldoTotalRealizado; 
        }

        System.out.println("\nSaldo Final Previsto: R$" + saldoTotalPrevisto);
        System.out.println("Saldo Final Realizado: R$" + saldoTotalRealizado);
    }

    public static float processarFluxo(float[] respostas, float saldoAnt, int indiceBase, boolean isPrevisto) {
        String tipoFluxo = isPrevisto ? "Previsto" : "Realizado";
        
        fluxoDeCaixa(respostas, indiceBase, indiceBase + 3, true); 
        fluxoDeCaixa(respostas, indiceBase + 3, indiceBase + 11, false); 

        float somaEntradas = calcularSoma(respostas, indiceBase, indiceBase + 3);
        float somaSaidas = calcularSoma(respostas, indiceBase + 3, indiceBase + 11);

        float saldoLiq = somaEntradas - somaSaidas;
        float saldoAcumulado = saldoLiq + saldoAnt;

        System.out.println("\nTotal de Entradas " + tipoFluxo + ": R$" + somaEntradas);
        System.out.println("Total de Saídas " + tipoFluxo + ": R$" + somaSaidas);
        System.out.println("Saldo Líquido " + tipoFluxo + ": R$" + saldoLiq);
        System.out.println("Saldo Acumulado " + tipoFluxo + ": R$" + saldoAcumulado);

        return saldoAcumulado;
    }

    public static void fluxoDeCaixa(float[] respostas, int inicio, int fim, boolean isReceita) {
        String tipo = isReceita ? "Recebidos" : "Despesas";
        System.out.println("\nDigite valores " + tipo + ":");

        for (int i = inicio; i < fim; i++) {
            System.out.print(tipo + " " + (i - inicio + 1) + ": R$");
            respostas[i] = input.nextFloat();
        }
    }

    public static float calcularSoma(float[] respostas, int inicio, int fim) {
        float soma = 0;
        for (int i = inicio; i < fim; i++) {
            soma += respostas[i];
        }
        return soma;
    }
}
