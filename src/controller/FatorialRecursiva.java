package controller;

public class FatorialRecursiva {

    public FatorialRecursiva ()
    {
        super();
    }

    public int fatorialCalc(int num)
    {
        //Ao decrescer o numero até zero, ele retorna como 1 (pois será mutiplicado, assim não afetara o calculo)
        if (num <= 1 || num > 12)
        {
            return 1;
        }

        //Multiplica o valor atual com o valor da próxima chamada
        return num * fatorialCalc(num - 1);
    }
}
