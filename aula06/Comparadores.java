package aula06;


public class Comparadores {
    public static void main(String[] args) {

        boolean fome = false;
        float horas = 9f, horario_intervalo = 9.5f, ate_lanche = 0f;

        if (horas < horario_intervalo) {
            ate_lanche = horario_intervalo - horas;
        }

        if (horario_intervalo < horas) {
            ate_lanche = horas - horario_intervalo;
        }

        if (ate_lanche > 0 || ate_lanche < 0) {
            fome = true;
        }

        System.out.println("Fome: " + fome);
        System.out.println("Ate lanche: " + ate_lanche);
    }
}