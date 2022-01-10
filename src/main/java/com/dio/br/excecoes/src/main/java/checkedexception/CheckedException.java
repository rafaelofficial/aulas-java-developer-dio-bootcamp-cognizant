package checkedexception;

import java.io.*;

public class CheckedException {

    public static void main(String[] args) {
        String nomeDoArquivo = "romanes-black-crouch.txt";
        imprimirArquivoConsole(nomeDoArquivo);
    }

    public static void imprimirArquivoConsole(String nomeDoArquivo) {
        File file = new File(nomeDoArquivo);

        try (BufferedReader br = new BufferedReader(new FileReader(file.getName()))) {

            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null);
            bw.flush();
        } catch (IOException e) {
            System.out.println("Arquivo não encontrado. Informe um arquivo válido! ");
        }
    }
}
