import java.util.Scanner;

class BMQ5 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um numero entre um e sete: ");
        num = sc.nextInt();

        if (num == 1)
            System.out.println("Segunda feira");
        if (num == 2)
            System.out.println("Terça feira");
        if (num == 3)
            System.out.println("Quarta feira");
        if (num == 4)
            System.out.println("Quinta feira");
        if (num == 5)
            System.out.println("Sexta feira");
        if (num == 6)
            System.out.println("Sabado");
        if (num == 7)
            System.out.println("Domingo");
        if (num > 7 || num < 1)
            System.out.println("NUMERO INVALIDO");
    }
}