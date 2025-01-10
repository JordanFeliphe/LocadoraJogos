package Question2;

import java.util.Date;
import java.util.List;

public class RegistroAluguel {
    private int codigoAluguel;
    private Usuario usuario;
    private Date dataInicio;
    private List<AluguelTitulo> titulosAlugados;

    public RegistroAluguel(int codigoAluguel, Usuario usuario, Date dataInicio, List<AluguelTitulo> titulosAlugados) {
        if (codigoAluguel <= 0) {
            throw new IllegalArgumentException("O código do aluguel deve ser maior que zero.");
        }
        if (usuario == null) {
            throw new IllegalArgumentException("O usuário não pode ser nulo.");
        }
        if (dataInicio == null) {
            throw new IllegalArgumentException("A data de início não pode ser nula.");
        }
        if (titulosAlugados == null || titulosAlugados.isEmpty()) {
            throw new IllegalArgumentException("Deve haver pelo menos um título alugado.");
        }

        this.codigoAluguel = codigoAluguel;
        this.usuario = usuario;
        this.dataInicio = dataInicio;
        this.titulosAlugados = titulosAlugados;
    }

    public int getCodigoAluguel() {
        return codigoAluguel;
    }

    public void setCodigoAluguel(int codigoAluguel) {
        if (codigoAluguel <= 0) {
            throw new IllegalArgumentException("O código do aluguel deve ser maior que zero.");
        }
        this.codigoAluguel = codigoAluguel;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        if (usuario == null) {
            throw new IllegalArgumentException("O usuário não pode ser nulo.");
        }
        this.usuario = usuario;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        if (dataInicio == null) {
            throw new IllegalArgumentException("A data de início não pode ser nula.");
        }
        this.dataInicio = dataInicio;
    }

    public List<AluguelTitulo> getTitulosAlugados() {
        return titulosAlugados;
    }

    public void setTitulosAlugados(List<AluguelTitulo> titulosAlugados) {
        if (titulosAlugados == null || titulosAlugados.isEmpty()) {
            throw new IllegalArgumentException("Deve haver pelo menos um título alugado.");
        }
        this.titulosAlugados = titulosAlugados;
    }

    public double calcularCustoTotal() {
        double total = 0;
        for (AluguelTitulo titulo : titulosAlugados) {
            total += titulo.getCustoTotal();
        }
        return total;
    }

    public void exibirDetalhes() {
        System.out.println("Código do Aluguel: " + codigoAluguel);
        System.out.println("Usuário: " + usuario.getNomeCompleto());
        System.out.println("Data de Início: " + dataInicio);
        System.out.println("Títulos Alugados:");
        for (AluguelTitulo titulo : titulosAlugados) {
            titulo.exibirInformacoes();
        }
        System.out.println("Custo Total do Aluguel: R$" + calcularCustoTotal());
    }
}
