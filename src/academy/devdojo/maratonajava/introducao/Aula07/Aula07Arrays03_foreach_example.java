package academy.devdojo.maratonajava.introducao.Aula07;

public class Aula07Arrays03_foreach_example {
    public static void main(String[] args) {
        int[] elementos = {1,2,3,4,5};
        int soma = 0;

        for (int numeros : elementos) {
            soma += numeros;
        }
        System.out.println("O resultado da soma de cada item do array é: "+soma);
    }
}
