import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int soma = 0;

        while (x != 0)
        {

            x = sc.nextInt();
            soma += x;
        }

        System.out.println(soma);

        sc.close();
    }
}
