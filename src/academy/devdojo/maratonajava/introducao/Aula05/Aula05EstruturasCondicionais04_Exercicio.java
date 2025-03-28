package academy.devdojo.maratonajava.introducao.Aula05;

public class Aula05EstruturasCondicionais04_Exercicio {
    public static void main(String[] args) {

        double salarioAnual = 40000;
        double desconto;


        if (salarioAnual <= 34712) {
            desconto = salarioAnual * (9.70 / 100);
        } else if (salarioAnual > 34712 && salarioAnual <= 68507) {
            desconto = salarioAnual * (37.35 / 100);
        } else {
            desconto = salarioAnual * (49.50 / 100);
        }

        double valorLiquido = salarioAnual - desconto;
        System.out.println("O valor do desconto é: " + desconto);
        System.out.println("O valor líquido é: " + valorLiquido);

    }
}
