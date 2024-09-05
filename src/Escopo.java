public class Escopo {
    public static void main(String[] args) {

        double price = 400.00;
        double discount = 0; // a variavel precisa ser iniciada no começo do programa

        if ( price < 200.00)
        {
            /* variavel discount está dentro do desconto do if apenas,
            não pode se chamada fora */
            discount = price * 0.1;
        }

        System.out.println(discount); // ela podera ser chamada em outros blocos no código

    }
}
