package Question2;

public class DispositivoPlataforma	 {
    private int codigoPlataforma;
    private String nomePlataforma;
    private double precoUsoHora;

    public DispositivoPlataforma(int codigoPlataforma, String nomePlataforma, double precoUsoHora) {
        if (codigoPlataforma <= 0) {
            throw new IllegalArgumentException("O código da plataforma deve ser maior que zero.");
        }
        if (nomePlataforma == null || nomePlataforma.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome da plataforma não pode ser vazio.");
        }
        if (precoUsoHora < 0) {
            throw new IllegalArgumentException("O preço por hora não pode ser negativo.");
        }

        this.codigoPlataforma = codigoPlataforma;
        this.nomePlataforma = nomePlataforma;
        this.precoUsoHora = precoUsoHora;
    }

    public int getCodigoPlataforma() {
        return codigoPlataforma;
    }

    public void setCodigoPlataforma(int codigoPlataforma) {
        if (codigoPlataforma <= 0) {
            throw new IllegalArgumentException("O código da plataforma deve ser maior que zero.");
        }
        this.codigoPlataforma = codigoPlataforma;
    }

    public String getNomePlataforma() {
        return nomePlataforma;
    }

    public void setNomePlataforma(String nomePlataforma) {
        if (nomePlataforma == null || nomePlataforma.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome da plataforma não pode ser vazio.");
        }
        this.nomePlataforma = nomePlataforma;
    }

    public double getPrecoUsoHora() {
        return precoUsoHora;
    }

    public void setPrecoUsoHora(double precoUsoHora) {
        if (precoUsoHora < 0) {
            throw new IllegalArgumentException("O preço por hora não pode ser negativo.");
        }
        this.precoUsoHora = precoUsoHora;
    }

    public void exibirInformacoes() {
        System.out.println("Código da Plataforma: " + codigoPlataforma);
        System.out.println("Nome da Plataforma: " + nomePlataforma);
        System.out.println("Preço de Uso por Hora: R$" + precoUsoHora);
    }
}
