package brunoandrade.com.br.rotaideal.servico;

/**
 * Created by JeanCarlos and Bruno Vieira on 12/12/2016.
 */

public class Calculo {


    public static double calcularICMS(double cidade){

        return cidade * 60;
    }

    public static double calcularImposto(double icmsLugar){

        return (icmsLugar * 0.01) * 60;
    }

    public static double calcularTotalProduto(double imposto, double valorProduto, double custoTransporte){

        return (imposto * valorProduto) + custoTransporte;
    }


    public static double calcularTudo(double valorDoProduto, double valorFrete, int cidade){

        double icms = calcularICMS(cidade);
        double imposto = calcularImposto(icms);
        double totalProduto = calcularTotalProduto(imposto, valorDoProduto, valorFrete);

        return totalProduto;

    }
}
