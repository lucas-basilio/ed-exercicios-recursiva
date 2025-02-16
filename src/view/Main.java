package view;
import controller.*;

public class Main {
    public static void main(String[] args)
    {
        //Exercicio 1
        System.out.println("Soma numeros naturais: " + new SomaNaturais().soma(5));

        //Exercicio 2
        int[] vetor = {7, 12, 2, 6, 1};
        System.out.println("Indice do menor valor: " + new MenorValorVetor().menorValor(vetor, vetor.length - 1, vetor.length - 1));

        //Exercicio 3
        System.out.println("Fatorial: " + new FatorialRecursiva().fatorialCalc(4));

        //Exercicio 4
        int[] novoVetor = {-7, -12, -2, 6, -1};
        System.out.println("Total valores negativos: " + new TotalNegativo().somaTotal(novoVetor, novoVetor.length - 1));

        //Exercicio 5
        System.out.println("Soma da sequência de divisão: " + new SequenciaSoma().soma(10, 1));

        //Exercicio 6
        System.out.println("Soma primitiva: " + new SomaPrimitiva().soma(20, 20));
    }
}
