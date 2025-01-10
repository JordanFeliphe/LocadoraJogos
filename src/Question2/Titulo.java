package Question2;

public class Titulo {
    private int codigoTitulo;
    private String nomeTitulo;
    private String detalhes;

    public Titulo(int codigoTitulo, String nomeTitulo, String detalhes) {
        if (codigoTitulo <= 0) {
            throw new IllegalArgumentException("O código do título deve ser maior que zero.");
        }
        if (nomeTitulo == null || nomeTitulo.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do título não pode ser vazio.");
        }
        this.codigoTitulo = codigoTitulo;
        this.nomeTitulo = nomeTitulo;
        this.detalhes = detalhes;
    }

    public int getCodigoTitulo() {
        return codigoTitulo;
    }

    public void setCodigoTitulo(int codigoTitulo) {
        if (codigoTitulo <= 0) {
            throw new IllegalArgumentException("O código do título deve ser maior que zero.");
        }
        this.codigoTitulo = codigoTitulo;
    }

    public String getNomeTitulo() {
        return nomeTitulo;
    }

    public void setNomeTitulo(String nomeTitulo) {
        if (nomeTitulo == null || nomeTitulo.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do título não pode ser vazio.");
        }
        this.nomeTitulo = nomeTitulo;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    public void exibirInformacoes() {
        System.out.println("Código do Título: " + codigoTitulo);
        System.out.println("Nome do Título: " + nomeTitulo);
        System.out.println("Detalhes: " + (detalhes != null ? detalhes : "Nenhum detalhe disponível."));
    }
}
