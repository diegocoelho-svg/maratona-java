package academy.devdojo.maratonajava.introducao.Aula08;

public class Aula08ArraysMultidimensionais01_example {
    public static void main(String[] args) {
        //Você vai criar um programa que armazena as notas de alunos em diferentes disciplinas. A estrutura será uma matriz bidimensional, onde cada linha representa um aluno e cada coluna representa uma disciplina.
        //- Crie um array bidimensional de 5 alunos (linhas) e 3 disciplinas (colunas).
        //- Preencha o array com as notas dos alunos nas 3 disciplinas.
        //- Calcule a média das notas de cada aluno.
        //- Imprima o nome do aluno e a média de suas notas.
        //- Depois, calcule a média geral de todas as notas de todos os alunos e imprima o resultado.

        //Notar outro jeito de declarar os arrays, usando chaves em ordem.


        String[] alunos = {"Arnaldo", "Bruno", "Coelho", "Diego", "Erick"};
        double[][] notas = {
                {7.5, 8.0, 7.0},  // Notas do Arnaldo
                {8.5, 7.5, 8.0},  // Notas do Bruno
                {6.0, 6.5, 7.0},  // Notas do Coelho
                {9.0, 9.5, 8.5},  // Notas do Diego
                {7.0, 6.5, 8.0},  // Notas do Erick
        };

        double somaGeral = 0;

        for (int i = 0; i < alunos.length; i++) {
            double somaAluno = 0;
            for (int j = 0; j < notas[i].length; j++) {
                somaAluno += notas[i][j];
            }
            double mediaAluno = somaAluno / notas[i].length;
            System.out.println(alunos[i] + ": Média = " + mediaAluno);
            somaGeral += somaAluno; // somaGeral = somaGeral + somaAluno;

        }

        double mediaGeral = somaGeral / (alunos.length * notas[0].length  );
        System.out.println("\nMédia geral dos alunos: " + mediaGeral); // \n é uma quebra de linha <br>
    }
}
