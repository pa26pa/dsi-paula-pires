package aula07;
public class For {
    public static void main(String[] args) {
        int a, b, c;
        a = 0;
        b = 0;
        for(int i = 0; i < 5; i++) {
            System.out.println("- " +  i);
            a += 1;
            c = i;
        }
        b = c - a;

        System.out.println("O número original era: " + b);
        
    }
}
