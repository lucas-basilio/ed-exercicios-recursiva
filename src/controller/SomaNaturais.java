package controller;

public class SomaNaturais {

    public SomaNaturais()
    {
        super();
    }

    public int soma(int num)
    {
        //Quando o numero atingir 0 (ou caso o valor inserido seja menor que zero), a função retorna
        if (num <= 0)
        {
            return 0;
        }

        //Enquanto houver valores acima de 0, realiza a soma com o valor anterior
        return num + soma(num - 1);
    }
}
