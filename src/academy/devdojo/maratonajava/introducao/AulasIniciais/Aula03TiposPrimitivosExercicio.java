package academy.devdojo.maratonajava.introducao.AulasIniciais;

/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salário>, na data <data>

*/
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String name = "Diego";
        String address = "Rua Giovani Boscolo";
        double remuneration = 1750.00;
        String dateReceivedRemuneration = "20/03/2025";
        String report = "Eu "+name+" morando no endereço " + address + ", confirmo que recebi o salário de "+remuneration+", na data " + dateReceivedRemuneration;

        System.out.println(report);
    }



}
