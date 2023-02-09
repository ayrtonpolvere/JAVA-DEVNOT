package CalcularVelocidadeMedia;

/**
 * VelocidadeMedia
 */
public class VelocidadeMedia {

    public static void main(String[] args) {
        //obter distancia percorrida pelo usuário
        int distanciapercorrida = 150;
        /*
         * obter tempo gasto pelo usuário*/
        int tempogasto = 2;
        //calcular velocidade média
        float velocidadeMedia = distanciapercorrida/tempogasto;
        //mostre a velocidade média
        System.out.println("A velocidade média foi de:");
        System.out.println(velocidadeMedia+" km/h");
        
    }
}
