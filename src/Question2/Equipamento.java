package Question2;

public class Equipamento {
    private int codigoEquipamento;
    private String descricao;
    private Dispositivo dispositivoAssociado;

    public Equipamento(int codigoEquipamento, String descricao, Dispositivo dispositivoAssociado) {
        if (codigoEquipamento <= 0) {
            throw new IllegalArgumentException("O código do equipamento deve ser maior que zero.");
        }
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("A descrição do equipamento não pode ser vazia.");
        }
        this.codigoEquipamento = codigoEquipamento;
        this.descricao = descricao;
        this.dispositivoAssociado = dispositivoAssociado;
    }

    public int getCodigoEquipamento() {
        return codigoEquipamento;
    }

    public void setCodigoEquipamento(int codigoEquipamento) {
        if (codigoEquipamento <= 0) {
            throw new IllegalArgumentException("O código do equipamento deve ser maior que zero.");
        }
        this.codigoEquipamento = codigoEquipamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("A descrição do equipamento não pode ser vazia.");
        }
        this.descricao = descricao;
    }

    public Dispositivo getDispositivoAssociado() {
        return dispositivoAssociado;
    }

    public void associarDispositivo(Dispositivo dispositivoAssociado) {
        if (dispositivoAssociado == null) {
            throw new IllegalArgumentException("O dispositivo associado não pode ser nulo.");
        }
        this.dispositivoAssociado = dispositivoAssociado;
    }

    public void exibirInformacoes() {
        System.out.println("Código do Equipamento: " + codigoEquipamento);
        System.out.println("Descrição: " + descricao);
        if (dispositivoAssociado != null) {
            System.out.println("Associado ao Dispositivo: " + dispositivoAssociado.getModelo());
        } else {
            System.out.println("Este equipamento não está associado a nenhum dispositivo.");
        }
    }
}
