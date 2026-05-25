package Exercícicos;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        double ir, adicional_idade, adicional_tempo;
        adicional_idade = 0;
        adicional_tempo = 0;
        System.out.println("aaa");
        Scanner input = new Scanner(System.in); 

        System.out.println("Nome: ");
        String nome = input.nextLine();  // Read user input
        
        System.out.println("Horas Trabalhadas: ");
        int horas_trabalhadas = input.nextInt();
        
        System.out.println("Salario por hora: ");
        int salario_hora = input.nextInt();
        
        System.out.println("Filhos < 14 anos: ");
        int filhos_14 = input.nextInt();
        
        System.out.println("Idade: ");
        int idade = input.nextInt();
        
        System.out.println("Tempo de Serviço: ");
        int tempos_serviso = input.nextInt();
        
        System.out.println("Salario Familiar: ");
        int salario_familiar = input.nextInt();
        

        int salario_bruto =  horas_trabalhadas * salario_hora;

        double desconto = 0.085 * salario_bruto;

        double bruto = salario_bruto - desconto;

        double familia = salario_familiar * filhos_14;


        if (bruto > 1500) {
            ir = bruto * 0.15;
        } else if (bruto >= 500 & bruto <= 1500) {
            ir = bruto * 0.08;
        } else {
            ir = 0;
        }

        if (idade > 40) {
            adicional_idade = bruto * 0.02;
        }

        if (tempos_serviso > 15) {
            adicional_tempo = bruto * 0.035;
        } else if (tempos_serviso < 15 & tempos_serviso > 5 & idade > 30) {
            adicional_tempo = bruto * 0.015;
        }

        double total_descontos = desconto + ir;

        double salario_liquido = bruto + familia + adicional_idade + adicional_tempo - total_descontos;

        System.out.println("--------------------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("--------------------------------------");
        System.out.println("Salario bruto: " + salario_bruto);
        System.out.println("--------------------------------------");
        System.out.println("Total de Descontos: " + total_descontos);
        System.out.println("--------------------------------------");
        System.out.println("Adicional Familia: " + familia);
        System.out.println("--------------------------------------");
        System.out.println("Adicional Idade: "+ adicional_idade);
        System.out.println("--------------------------------------");
        System.out.println("Adicional tempo de serviço: " + adicional_tempo);
        System.out.println("--------------------------------------");
        System.out.println("Salario Liquido: "+ salario_liquido);
        System.out.println("--------------------------------------");

    }
}