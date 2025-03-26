package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                continue; // Ignora esta iteração se valorParcela for menor que 1000 e continua para a próxima parcela
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
