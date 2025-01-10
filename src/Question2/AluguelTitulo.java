package Question2;

public class AluguelTitulo {
    private Titulo titulo;
    private DispositivoPlataforma plataformaUsada;
    private int quantidadeDias;
    private double custoTotal;

    public AluguelTitulo(Titulo titulo, DispositivoPlataforma plataformaUsada, int quantidadeDias, double precoDiario) {
        if (titulo == null) {
            throw new IllegalArgumentException("O título não pode ser nulo.");
        }
        if (plataformaUsada == null) {
            throw new IllegalArgumentException("A plataforma usada não pode ser nula.");
        }
        if (quantidadeDias <= 0) {
            throw new IllegalArgumentException("A quantidade de dias deve ser maior que zero.");
        }
        if (precoDiario <= 0) {
            throw new IllegalArgumentException("O preço diário deve ser maior que zero.");
        }

        this.titulo = titulo;
        this.plataformaUsada = plataformaUsada;
        this.quantidadeDias = quantidadeDias;
        this.custoTotal = calcularCusto(precoDiario, quantidadeDias);
    }

    public Titulo getTitulo() {
        return titulo;
    }

    public void setTitulo(Titulo titulo) {
        if (titulo == null) {
            throw new IllegalArgumentException("O título não pode ser nulo.");
        }
        this.titulo = titulo;
    }

    public DispositivoPlataforma getPlataformaUsada() {
        return plataformaUsada;
    }

    public void setPlataformaUsada(DispositivoPlataforma plataformaUsada) {
        if (plataformaUsada == null) {
            throw new IllegalArgumentException("A plataforma usada não pode ser nula.");
        }
        this.plataformaUsada = plataformaUsada;
    }

    public int getQuantidadeDias() {
        return quantidadeDias;
    }

    public void setQuantidadeDias(int quantidadeDias, double precoDiario) {
        if (quantidadeDias <= 0) {
            throw new IllegalArgumentException("A quantidade de dias deve ser maior que zero.");
        }
        this.quantidadeDias = quantidadeDias;
        this.custoTotal = calcularCusto(precoDiario, quantidadeDias);
    }

    public double getCustoTotal() {
        return custoTotal;
    }

    private double calcularCusto(double precoDiario, int quantidadeDias) {
        return precoDiario * quantidadeDias;
    }

    public void exibirInformacoes() {
        System.out.println("Título Alugado: " + titulo.getNomeTitulo());
        System.out.println("Plataforma: " + plataformaUsada.getNomePlataforma());
        System.out.println("Dias Alugados: " + quantidadeDias);
        System.out.println("Custo Total: R$" + custoTotal);
    }
}
