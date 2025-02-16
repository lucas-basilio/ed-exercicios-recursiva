package controller;

public class SequenciaSoma {

    public SequenciaSoma()
    {
        super();
    }

    public double soma(int val, int div)
    {
        //Quando o divisor se igualar ao valor inserido, retorna a ultima divisão
        if (div == val)
        {
            return 1 / (double)div;
        }

        //Soma a divisão de 1 pelo divisor, passa o divisor somando + 1
        return 1 / (double)div + soma(val, div + 1);
    }
}
