package CalculadoraDescontos;

import java.util.Scanner;

public class CalculadoraDescontos {
    public void calcular20() {
        System.out.println("Informe o Preço do Produto: ");
        Scanner sc = new Scanner (System.in);
        double precoProduto = sc.nextDouble();
    final int desconto20 = 20;
        double precoComDesconto = precoProduto - (precoProduto*desconto20/100);
        System.out.println("O Preço com 20% de Desconto é " + precoComDesconto+ " reais");
        sc.close();
    }
        public void calcular30() {
            double precoProduto;
            precoProduto =200;
            final int desconto30 = 30;
            double precoComDesconto = precoProduto - (precoProduto*desconto30/100);
            System.out.println("O Preço com 30% de Desconto é " + precoComDesconto+ " reais");
    }

}
