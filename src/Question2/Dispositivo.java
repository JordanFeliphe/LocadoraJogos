package Question2;

public class Dispositivo {
    private int codigoDispositivo;
    private String modelo;
    private double valorPorHora;

    public Dispositivo(int codigoDispositivo, String modelo, double valorPorHora) {
        if (codigoDispositivo <= 0) {
            throw new IllegalArgumentException("O código do dispositivo deve ser maior que zero.");
        }
        if (modelo == null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("O modelo do dispositivo não pode ser vazio.");
        }
        if (valorPorHora <= 0) {
            throw new IllegalArgumentException("O valor por hora deve ser maior que zero.");
        }
        this.codigoDispositivo = codigoDispositivo;
        this.modelo = modelo;
        this.valorPorHora = valorPorHora;
    }

    public int getCodigoDispositivo() {
        return codigoDispositivo;
    }

    public void setCodigoDispositivo(int codigoDispositivo) {
        if (codigoDispositivo <= 0) {
            throw new IllegalArgumentException("O código do dispositivo deve ser maior que zero.");
        }
        this.codigoDispositivo = codigoDispositivo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("O modelo do dispositivo não pode ser vazio.");
        }
        this.modelo = modelo;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        if (valorPorHora <= 0) {
            throw new IllegalArgumentException("O valor por hora deve ser maior que zero.");
        }
        this.valorPorHora = valorPorHora;
    }

    public void exibirInformacoes() {
        System.out.println("Código do Dispositivo: " + codigoDispositivo);
        System.out.println("Modelo: " + modelo);
        System.out.println("Valor por Hora: R$" + valorPorHora);
    }

    public double calcularCusto(int horas) {
        if (horas <= 0) {
            throw new IllegalArgumentException("O número de horas deve ser maior que zero.");
        }
        return horas * valorPorHora;
    }
}
