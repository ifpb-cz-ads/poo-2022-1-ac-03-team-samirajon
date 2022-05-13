import java.util.Scanner;
public class Main{
    public static void main(String[] args){
      int idade;
      Scanner entrada = new Scanner(System.in);

      System.out.println("Digite a sua idade:");
      idade = entrada.nextInt();
      
      System.out.println("Você tem " + idade + " anos, ou seja:");
      
      if(idade < 16){
        System.out.println("\nNão pode votar");
      }
      else if(idade > 15 && idade < 18 || idade > 65){
        System.out.println("Voto facultativo");
      }
      else{
        System.out.println("Voto obrigatório");
      }
    }
}