package controller;

public class TotalNegativo {

    public TotalNegativo()
    {
        super();
    }

    public int somaTotal(int[] vetor, int pos)
    {
        //Retorna após sair do range da array
        if (pos < 0)
        {
            return 0;
        }

        int count = vetor[pos] < 0 ? 1 : 0;

        //Caso o valor atual seja negativo, ele é contabilizado
        return count + somaTotal(vetor, pos - 1);
    }
}
