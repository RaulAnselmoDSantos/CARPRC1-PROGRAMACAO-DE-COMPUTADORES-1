
// TesteGravaAlunosBinario.java
package lista07;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Raul feito para estudo
 */

public class Exercicio4TesteGravaAlunoBinario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Aluno> alunos = new ArrayList<>();

        System.out.println("Cadastro de 3 alunos:\n");
        for (int i = 1; i <= 3; i++) {
            System.out.print("Aluno " + i + " - Nome: ");
            String nome = sc.nextLine();
            System.out.print("Codigo: ");
            int codigo = Integer.parseInt(sc.nextLine());
            System.out.print("Nota 1 (int): ");
            int nota1 = Integer.parseInt(sc.nextLine());
            System.out.print("Nota 2 (int): ");
            int nota2 = Integer.parseInt(sc.nextLine());
            alunos.add(new Aluno(nome, codigo, nota1, nota2));
            System.out.println();
        }

        sc.close();
        String arquivoSaida = "alunos.dat";
        try {
            Gravador.salvarAppend(alunos, arquivoSaida);
            System.out.println("Arquivo binário '" + arquivoSaida + "' gravado com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao gravar arquivo: " + e.getMessage());
        }
    }
}
