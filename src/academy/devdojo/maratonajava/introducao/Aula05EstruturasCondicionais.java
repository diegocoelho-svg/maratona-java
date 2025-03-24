package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 18;
        boolean isAuthorizedBuyDrink = idade >= 18;
        // ! (negação)
        System.out.println("Idade: " + idade);
        if (isAuthorizedBuyDrink) {
            System.out.println("Autorizado a comprar bebida alcoólica");
        }

        if (!isAuthorizedBuyDrink) {
            System.out.println("Não Autorizado a comprar bebida alcoólica");
        }
        //Questões de Certificação, não deve ser utilizado
        boolean c = false;
        if(c == true) {
            System.out.println("Dentro de algo que nunca deve ser feito");
        }

    }
}
