package controller;

public class MenorValorVetor {

    public MenorValorVetor()
    {
        super();
    }

    public int menorValor(int[] vetor, int length, int indexMenor)
    {
        int menor = vetor[indexMenor] < vetor[length - 1] ? indexMenor : length - 1;

        //Quando o vetor chegar no ultimo valor, retorna o indice do menor numero registrado
        if (length <= 1)
        {
            return menor;
        }

        //Realiza a chamada novamente, decrescendo o index
        return menorValor(vetor, length - 1, menor);
    }
}
