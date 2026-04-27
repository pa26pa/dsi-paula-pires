package aula05;

public class Operadores {
    public static void main(String[] args) {
        int a = 8;
        int b = 3;
        int c = 10;

        float d = a;
        float e = b;
        
        // Operadores:
            // Aritméticos: +, -, *, /, % Retorna o resto da divisão, ++ Aumenta o valor da variavel por 1, -- Diminui o valor da variavel por 1
            // Relacionais: ==, !=, >, <, >=, <=
            // Lógicos: &&, || PIPE (ou), !
        

        // Aritméticos:
        System.out.println("adisao " + (a + b));
        System.out.println("menos: " + (a - b));
        System.out.println("vezes: " + (a * b));
        System.out.println("divisao: " + (a / b));
        System.out.println("divisao float: " + (d / e));
        System.out.println("RESTO da divisao: " + (d % e));
        ++c;
        --b;
        System.out.println(c - b);

        a &= b;
        System.out.println(a);

        a |= b;
        System.out.println(a);

    }
}