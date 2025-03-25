package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprima todos os números pares de 0 até 1.000.000

        //É um jeito, porém tem um problema a longo prazo caso a regra mude (Experimente colocar i=1)
        for (int i = 2; i <= 1000000; i += 2) {
            // System.out.println(i);
        }

        //Dessa maneira, garantimos que o resto da divisão é sempre zero (sendo classificado como número par)
        for (int i = 1; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
