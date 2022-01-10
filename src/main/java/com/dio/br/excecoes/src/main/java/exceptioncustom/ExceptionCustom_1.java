package exceptioncustom;

import java.io.*;
import java.util.Scanner;

public class ExceptionCustom_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do arquivo exibido: ");
        String nomeArquivo = sc.nextLine();

        imprimeArquivoConsole(nomeArquivo);
        sc.close();
    }

    public static void imprimeArquivoConsole(String nomeArquivo) {
        try {
            BufferedReader br = lerArquivo(nomeArquivo);

            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null);
            bw.flush();
            bw.close();
        } catch (ImposivelAberturaException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("Não foi possível abrir o arquivo. Informe um arquivo válido!");
        }
    }

    public static BufferedReader lerArquivo(String nomedoArquivo) throws ImposivelAberturaException {
        File file = new File(nomedoArquivo);
        try {
            return new BufferedReader(new FileReader(nomedoArquivo));
        } catch (FileNotFoundException e) {
            throw new ImposivelAberturaException(file.getName(), file.getPath());
        }
    }
}
