package exceptioncustom;

public class ImposivelAberturaException extends Exception {

    private String nomeDoArquivo;
    private String diretorio;

    public ImposivelAberturaException(String nomeDoArquivo, String diretorio) {
        super("Arquivo não encontrado: " + nomeDoArquivo + ", não foi possível encontrar no diretório " + diretorio);
        this.nomeDoArquivo = nomeDoArquivo;
        this.diretorio = diretorio;
    }

    @Override
    public String toString() {
        return "ImposivelAberturaException { nome do arquivo=" + nomeDoArquivo + ", diretorio='" + diretorio + '}';
    }
}
