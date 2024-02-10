
public class Main {
    public static void main(String[] args) {
        //Faturamento por estado
        double faturamentoSP = 67836.43;
        double faturamentoRJ = 36678.66;
        double faturamentoMG = 29229.88;
        double faturamentoES = 27165.48;
        double faturamentoOutros = 19849.53;

        //Calcula o faturamento total
        double faturamentoTotal = faturamentoSP + faturamentoRJ + faturamentoMG + faturamentoES + faturamentoOutros;

        //Calcula o percentual por estado
        double percentualSP = calcularPercentual(faturamentoSP, faturamentoTotal);
        double percentualRJ = calcularPercentual(faturamentoRJ, faturamentoTotal);
        double percentualMG = calcularPercentual(faturamentoMG, faturamentoTotal);
        double percentualES = calcularPercentual(faturamentoES, faturamentoTotal);
        double percentualOutros = calcularPercentual(faturamentoOutros, faturamentoTotal);

        //Exibe na tela o percentual por estado
        System.out.println("+----------------------------------------+");
        System.out.println("| Percentual de Representação por Estado |");
        System.out.println("+----------------------------------------+");
        System.out.printf("SP: %.2f%%\n", percentualSP);
        System.out.printf("RJ: %.2f%%\n", percentualRJ);
        System.out.printf("MG: %.2f%%\n", percentualMG);
        System.out.printf("ES: %.2f%%\n", percentualES);
        System.out.printf("Outros: %.2f%%\n", percentualOutros);

    }
    //Função que calcula o percentual
    public static double calcularPercentual(double faturamento, double faturamentoTotal){
        return (faturamento / faturamentoTotal) * 100;
    }
}