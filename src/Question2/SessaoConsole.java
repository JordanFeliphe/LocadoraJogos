package Question2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SessaoConsole {
    private int codigoSessao;
    private Usuario usuario;
    private Dispositivo consoleUtilizado;
    private double duracaoHoras;
    private double custoTotal;
    private Date dataSessao;

    public SessaoConsole(int codigoSessao, Usuario usuario, Dispositivo consoleUtilizado, double duracaoHoras, Date dataSessao) {
        if (codigoSessao <= 0) {
            throw new IllegalArgumentException("O código da sessão deve ser maior que zero.");
        }
        if (usuario == null) {
            throw new IllegalArgumentException("O usuário não pode ser nulo.");
        }
        if (consoleUtilizado == null) {
            throw new IllegalArgumentException("O console utilizado não pode ser nulo.");
        }
        if (duracaoHoras <= 0) {
            throw new IllegalArgumentException("A duração da sessão deve ser maior que zero.");
        }
        if (dataSessao == null) {
            throw new IllegalArgumentException("A data da sessão não pode ser nula.");
        }

        this.codigoSessao = codigoSessao;
        this.usuario = usuario;
        this.consoleUtilizado = consoleUtilizado;
        this.duracaoHoras = duracaoHoras;
        this.custoTotal = calcularCustoTotal(duracaoHoras, consoleUtilizado.getValorPorHora());
        this.dataSessao = dataSessao;
    }

    public int getCodigoSessao() {
        return codigoSessao;
    }

    public void setCodigoSessao(int codigoSessao) {
        if (codigoSessao <= 0) {
            throw new IllegalArgumentException("O código da sessão deve ser maior que zero.");
        }
        this.codigoSessao = codigoSessao;
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

    public Dispositivo getConsoleUtilizado() {
        return consoleUtilizado;
    }

    public void setConsoleUtilizado(Dispositivo consoleUtilizado) {
        if (consoleUtilizado == null) {
            throw new IllegalArgumentException("O console utilizado não pode ser nulo.");
        }
        this.consoleUtilizado = consoleUtilizado;
        this.custoTotal = calcularCustoTotal(this.duracaoHoras, consoleUtilizado.getValorPorHora());
    }

    public double getDuracaoHoras() {
        return duracaoHoras;
    }

    public void setDuracaoHoras(double duracaoHoras) {
        if (duracaoHoras <= 0) {
            throw new IllegalArgumentException("A duração da sessão deve ser maior que zero.");
        }
        this.duracaoHoras = duracaoHoras;
        this.custoTotal = calcularCustoTotal(duracaoHoras, this.consoleUtilizado.getValorPorHora());
    }

    public double getCustoTotal() {
        return custoTotal;
    }

    public Date getDataSessao() {
        return dataSessao;
    }

    public void setDataSessao(Date dataSessao) {
        if (dataSessao == null) {
            throw new IllegalArgumentException("A data da sessão não pode ser nula.");
        }
        this.dataSessao = dataSessao;
    }

    private double calcularCustoTotal(double horas, double valorPorHora) {
        return horas * valorPorHora;
    }

    public String getTempoFormatado() {
        int horas = (int) duracaoHoras;
        int minutos = (int) ((duracaoHoras - horas) * 60);
        return horas + "h " + minutos + "min";
    }

    public String getDataSessaoFormatada() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return formato.format(dataSessao);
    }

    public void exibirDetalhesSessao() {
        System.out.println("Código da Sessão: " + codigoSessao);
        System.out.println("Usuário: " + usuario.getNomeCompleto());
        System.out.println("Console: " + consoleUtilizado.getModelo());
        System.out.println("Duração: " + getTempoFormatado());
        System.out.println("Custo Total: R$" + custoTotal);
        System.out.println("Data da Sessão: " + getDataSessaoFormatada());
    }
}
