package Exercícicos;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        System.out.println("Sexo (M ou F): ");
        String sexo = input.nextLine(); 

        System.out.println("Código Funcionario: ");
        int codigo = input.nextInt();

        System.out.println("Tempo de casa: ");
        int tempo = input.nextInt();

        System.out.println("Salario: ");
        int salario = input.nextInt();

        double adicional;
        adicional = 100;

        if (sexo.equals("M") & tempo > 15){
            adicional = salario * 0.2;
        }

        if (sexo.equals("F") & tempo > 10){
            adicional = salario * 0.25;
        }

        System.out.println("-------------------------");
        System.out.println("Bonus: " + adicional);
        System.out.println("-------------------------");

    }
}