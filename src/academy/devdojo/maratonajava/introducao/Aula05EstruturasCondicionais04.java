package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        // Exercicio: Dado um determinado salario, quero saber qual valor tenho que pagar (tax)
        // salario <= 34,712 (9.70%) - baixa
        // salario > 34,712 && salario <= 68,507 (37.35%) - media
        // salario > 68,507 (49.50%) - alta
        double salarioAnual = 45000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;

        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            valorImposto = salarioAnual * segundaFaixa;
        } else {
            valorImposto = salarioAnual * terceiraFaixa;
        }
        double salarioLiquido = salarioAnual - valorImposto;
        System.out.println("O valor do imposto a ser pago é: " + valorImposto);
        System.out.println("O salário líquido é: "+ salarioLiquido);
    }
}
