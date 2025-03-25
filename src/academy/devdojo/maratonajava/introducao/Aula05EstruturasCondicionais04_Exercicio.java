package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04_Exercicio {
    public static void main(String[] args) {
        // Exercicio: Dado um determinado salario, quero saber qual valor tenho que pagar (tax)
        // salario <= 34,712 (9.70%) - baixa
        // salario > 34,712 && salario <= 68,507 (37.35%) - media
        // salario > 68,507 (49.50%) - alta
        double salario = 40000;
        double desconto;


        if (salario <= 34712) {
            desconto = salario * 0.097;
        } else if (salario > 34712 && salario <= 68507) {
            desconto = salario * 0.3735;
        } else {
            desconto = salario * 0.4950;
        }

        double valorLiquido = salario - desconto;
        System.out.println(valorLiquido);

    }
}
