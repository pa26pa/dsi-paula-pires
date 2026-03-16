package aula02;

public class Variaveis {
    public static void main(String[] args) {
       // Armazenando valor em variáveis do tipo String, e depois concatenando as duas variáveis para formar uma frase completa.

        String msgPt1 = "Olá ";
        String msgPt2 = "Alunos";

        // .concat = concatenação de string, ou seja, juntar as duas strings em uma só.

        System.out.println(msgPt1.concat(msgPt2));
        
        

        int n1 = 1;
        String n2 = "2";
        System.out.println(n1 + n2);

        // Integer.parseInt() é um método que converte uma string em um número inteiro.

        System.out.println(n1 + Integer.parseInt(n2)); 
    }
}