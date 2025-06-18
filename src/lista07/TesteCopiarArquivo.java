package lista07;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Exercicio 7 – método copiarArquivo:
 *  - lê byte a byte de um arquivo origem
 *  - grava em arquivo destino
 *  - trata origem inexistente, pasta de destino ausente
 *  - se destino existir, pergunta ao usuário se quer sobrescrever
 * @author Raul feito para estudo
 */

public class TesteCopiarArquivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Arquivo de origem: ");
        String origem = sc.nextLine();
        System.out.print("Arquivo de destino: ");
        String destino = sc.nextLine();
        sc.close();

        copiarArquivo(origem, destino);
    }

    public static void copiarArquivo(String origem, String destino) {
        File src = new File(origem);
        if (!src.exists() || !src.isFile()) {
            throw new IllegalArgumentException("Arquivo de origem não existe: " + origem);
        }
        File dst = new File(destino);
        File parent = dst.getParentFile();
        if (parent != null && !parent.exists()) {
            throw new IllegalArgumentException("Pasta de destino não existe: " + parent);
        }

        try (Scanner sc = new Scanner(System.in)) {
            if (dst.exists()) {
                System.out.print("Arquivo destino já existe. Sobrescrever? (s/n): ");
                String resp = sc.nextLine();
                if (!resp.equalsIgnoreCase("s")) {
                    System.out.println("Cópia cancelada.");
                    return;
                }
            }
        }

        try (FileInputStream in = new FileInputStream(src);
             FileOutputStream out = new FileOutputStream(dst)) {
            byte[] buffer = new byte[4096];
            int len;
            while ((len = in.read(buffer)) != -1) {
                out.write(buffer, 0, len);
            }
            System.out.println("Arquivo copiado de " + origem + " para " + destino);
        } catch (IOException e) {
            throw new RuntimeException("Erro ao copiar arquivo: " + e.getMessage(), e);
        }
    }
}