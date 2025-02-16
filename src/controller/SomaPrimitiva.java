package controller;

public class SomaPrimitiva {

    public SomaPrimitiva()
    {
        super();
    }

    public int soma(int firstNum, int secondNum)
    {
        if (secondNum <= 0 && firstNum <= 0)
        {
            return 0;
        }

        if (secondNum <= 0)
        {
            return 1 + soma(firstNum - 1, secondNum);
        } else if (firstNum <= 0)
        {
            return 1 + soma(firstNum, secondNum - 1);
        }

        return 2 + soma(firstNum - 1, secondNum - 1);
    }
}
