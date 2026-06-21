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
        String nome = input.nextLine(); 
        
        System.out.println("Horas Trabalhadas: ");
        int horas_trabalhadas = input.nextInt();
        
        System.out.println("Salario por hora: ");
        double salario_hora = input.nextDouble();
        
        System.out.println("Filhos < 14 anos: ");
        int filhos_14 = input.nextInt();
        
        System.out.println("Idade: ");
        int idade = input.nextInt();
        
        System.out.println("Tempo de Serviço: ");
        int tempo_serviço = input.nextInt();
        
        System.out.println("Salario Familiar: ");
        double salario_familiar = input.nextDouble();
        

        double salario_bruto =  horas_trabalhadas * salario_hora;

        double desconto = 0.085 * salario_bruto;

        double bruto = salario_bruto - desconto;

        double familia = salario_familiar * filhos_14;
        
        
        ir = 0;
        if (bruto > 1500) {
            ir = bruto * 0.15;
        }
        if (bruto >= 500 & bruto <= 1500) {
            ir = bruto * 0.08;
        }

        if (idade > 40) {
            adicional_idade = bruto * 0.02;
        }

        if (tempo_serviço > 15) {
            adicional_tempo = bruto * 0.035;
        } 
        
        if (tempo_serviço < 15 & tempo_serviço > 5 & idade > 30) {
            adicional_tempo = bruto * 0.015;
        }

        double total_descontos = desconto + ir;
        double total_adicionais = bruto + familia + adicional_idade + adicional_tempo;

        double salario_liquido = total_adicionais - total_descontos;

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
        
        input.close();
    }
}