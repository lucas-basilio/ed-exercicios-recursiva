package view;
import controller.FatorialRecursiva;
import controller.MenorValorVetor;
import controller.SomaNaturais;

public class Main {
    public static void main(String[] args)
    {
        //Exercicio 1
        System.out.println("Soma numeros naturais: " + new SomaNaturais().soma(5));

        //Exercicio 2
        int[] vetor = {7, 4, 2, 6, 1};
        System.out.println("Indice do menor valor: " + new MenorValorVetor().menorValor(vetor, vetor.length - 1, vetor.length - 1));

        //Exercicio 3
        System.out.println("Fatorial: " + new FatorialRecursiva().fatorialCalc(4));

        //Exercicio 4

    }
}
