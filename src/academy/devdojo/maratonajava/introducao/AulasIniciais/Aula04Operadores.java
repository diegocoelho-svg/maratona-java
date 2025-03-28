package academy.devdojo.maratonajava.introducao.AulasIniciais;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int number01 = 10;
        int number02 = 20;
        double result = number01 / (double) number02;
        System.out.println(result);


        // %
        int resto = 21 % 2;
        System.out.println(resto);

        // < > <= >= = ==(comparando) !=(diferente)
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);

        //&& (AND) || (or) !
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLei = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLei " + isDentroDaLei);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

        // Operadores de Atribuição (= *= -= += /= %=)
        double bonus = 1800; //1800
        bonus += 1000; //2800
        bonus -= 1000; // 1800
        bonus *= 2; // 3600
        bonus /= 2; // 1800
        System.out.println(bonus);

        // Incrementador
        int contador = 0;
        contador += 1; // contador = contador + 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        System.out.println(contador);
        int contador2 = 0;
        System.out.println(contador2++); // Ele executa o número, depois acrescenta
        System.out.println(contador2);
    }
}
