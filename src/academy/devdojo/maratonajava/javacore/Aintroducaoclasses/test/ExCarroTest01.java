package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

//Crie uma classe carro com os seguintes atributos

//nome
//modelo
//ano

// Em seguida, crie dois objetos distintos e imprima seus valores.

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class ExCarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Agile";
        carro1.ano = 2010;
        carro1.modelo = 2011;

        Carro carro2 = new Carro();
        carro2.nome = "Toro";
        carro2.ano = 2019;
        carro2.modelo = 2019;

        System.out.println("Nome do Primeiro carro: " + carro1.nome);
        System.out.println("Ano do Primeiro carro: " + carro1.ano);
        System.out.println("Modelo do Primeiro carro: " + carro1.modelo);

        System.out.println("--------------------------------------------------");

        System.out.println("Nome do Segundo carro: " + carro2.nome);
        System.out.println("Ano do Segundo carro: " + carro2.ano);
        System.out.println("Modelo do Segundo carro: " + carro2.modelo);

    }
}
