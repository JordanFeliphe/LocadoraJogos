package Question2;

public class TarifaPorPlataforma {
    private Titulo tituloAssociado;
    private DispositivoPlataforma plataforma;
    private double tarifaDiaria;

    public TarifaPorPlataforma(Titulo tituloAssociado, DispositivoPlataforma plataforma, double tarifaDiaria) {
        if (tituloAssociado == null) {
            throw new IllegalArgumentException("O título associado não pode ser nulo.");
        }
        if (plataforma == null) {
            throw new IllegalArgumentException("A plataforma associada não pode ser nula.");
        }
        if (tarifaDiaria <= 0) {
            throw new IllegalArgumentException("A tarifa diária deve ser maior que zero.");
        }

        this.tituloAssociado = tituloAssociado;
        this.plataforma = plataforma;
        this.tarifaDiaria = tarifaDiaria;
    }

    public Titulo getTituloAssociado() {
        return tituloAssociado;
    }

    public void setTituloAssociado(Titulo tituloAssociado) {
        if (tituloAssociado == null) {
            throw new IllegalArgumentException("O título associado não pode ser nulo.");
        }
        this.tituloAssociado = tituloAssociado;
    }

    public DispositivoPlataforma getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(DispositivoPlataforma plataforma) {
        if (plataforma == null) {
            throw new IllegalArgumentException("A plataforma associada não pode ser nula.");
        }
        this.plataforma = plataforma;
    }

    public double getTarifaDiaria() {
        return tarifaDiaria;
    }

    public void setTarifaDiaria(double tarifaDiaria) {
        if (tarifaDiaria <= 0) {
            throw new IllegalArgumentException("A tarifa diária deve ser maior que zero.");
        }
        this.tarifaDiaria = tarifaDiaria;
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + tituloAssociado.getNomeTitulo());
        System.out.println("Plataforma: " + plataforma.getNomePlataforma());
        System.out.println("Tarifa Diária: R$" + tarifaDiaria);
    }
}
