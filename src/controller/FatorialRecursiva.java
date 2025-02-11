package controller;

public class FatorialRecursiva {

    public FatorialRecursiva ()
    {
        super();
    }

    public int fatorialCalc(int num)
    {
        if (num <= 1 || num > 12)
        {
            return 1;
        }

        return num * fatorialCalc(num - 1);
    }
}
