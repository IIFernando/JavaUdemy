public class ExpressaoTernaria {
    public static void main(String[] args) {

        double preco = 34.5;

        //Operador ternário
        double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;

/*
        if (preco < 20)
        {
            desconto = preco * 0.01;
        }
        else
        {
            desconto = preco * 0.05;
        }
*/

        System.out.println("Seu desconto foi de R$ " + desconto);

    }
}
