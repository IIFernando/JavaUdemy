package exercicios;

import java.util.Scanner;

public class ex03
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int c = 0; c <= x; c++)
        {
            if(c % 2 != 0)
            {
                System.out.println(c);
            }

        }
    }
}
