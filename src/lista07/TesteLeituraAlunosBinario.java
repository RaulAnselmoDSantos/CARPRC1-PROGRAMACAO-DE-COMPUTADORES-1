
package lista07;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Raul feito para estudo
 */

public class TesteLeituraAlunosBinario {
    public static void main(String[] args) {
        String arquivo = "alunos.dat";
        List<Aluno> alunos = new ArrayList<>();

        // Leitura do arquivo binário
        try (DataInputStream in = new DataInputStream(new FileInputStream(arquivo))) {
            while (true) {
                int length = in.readInt();
                char[] chars = new char[length];
                for (int i = 0; i < length; i++) {
                    chars[i] = in.readChar();
                }
                String nome = new String(chars);
                int codigo = in.readInt();
                int nota1 = in.readInt();
                int nota2 = in.readInt();
                alunos.add(new Aluno(nome, codigo, nota1, nota2));
            }
        } catch (EOFException e) {
            // fim do arquivo OK
        } catch (IOException e) {
            System.err.println("Erro ao ler arquivo: " + e.getMessage());
            return;
        }

        // Processamento das médias e classificação
        double somaMedia = 0;
        List<Aluno> aprovados = new ArrayList<>();
        List<Aluno> ifas      = new ArrayList<>();
        List<Aluno> reprovados = new ArrayList<>();

        for (Aluno a : alunos) {
            double media = (a.getNota1() + a.getNota2()) / 2.0;
            somaMedia += media;
            if (media >= 7.0) {
                aprovados.add(a);
            } else if (media >= 4.0) {
                ifas.add(a);
            } else {
                reprovados.add(a);
            }
        }

        double mediaTurma = somaMedia / alunos.size();

        System.out.println("Alunos aprovados:");
        aprovados.forEach(al -> System.out.println(" - " + al.getNome()));

        System.out.println("\nAlunos em IFA:");
        ifas.forEach(al -> System.out.println(" - " + al.getNome()));

        System.out.println("\nAlunos reprovados:");
        reprovados.forEach(al -> System.out.println(" - " + al.getNome()));

        System.out.printf("\nMédia da turma: %.2f%n", mediaTurma);
    }
}

