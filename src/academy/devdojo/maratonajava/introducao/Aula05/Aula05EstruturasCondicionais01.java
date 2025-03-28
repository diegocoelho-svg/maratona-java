package academy.devdojo.maratonajava.introducao.Aula05;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAuthorizedBuyDrink = idade >= 18;
        // ! (negação)
        System.out.println("Idade: " + idade);
        if (isAuthorizedBuyDrink) {
            System.out.println("Autorizado a comprar bebida alcoólica");
        }

        if (!isAuthorizedBuyDrink) {
            System.out.println("Não é Autorizado a comprar bebida alcoólica");
        }
        //Questões de Certificação, não deve ser utilizado
        boolean c = false;
        if(c == true) {
            System.out.println("Dentro de algo que nunca deve ser feito");
        }

        // else if
        if (isAuthorizedBuyDrink != false) {
            System.out.println("Autorizado a comprar bebida alcoólica!!");
        }else {
            System.out.println("Não é autorizado a comprar bebida alcoólica!!");
        }




    }
}
