package Calculoviagem;

public class calculoviagem {
    public static void main(String[] args) {
        // Obter o valor do litro do combustível
        int preçolitrocombustivel = 5;
        /*
         * Obter quilometros por litro que o carro realiza
         */
        int kmlitro = 10;
        /*
         * Obter a distância que será percorrida
         */
        int distanciapercorrida = 100;
        /*
         * Dividir quilometros percorridos por Km/litro
         */
        float calculoviagem = distanciapercorrida / kmlitro * preçolitrocombustivel;
        System.out.println("Valor total gasto:");
        System.out.println(calculoviagem + " R$");

    }
}
