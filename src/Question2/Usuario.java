package Question2;

public class Usuario {
    private int codigoUsuario;
    private String nomeCompleto;
    private String email;
    private String telefoneContato;
    private String senhaAcesso;

    public Usuario(int codigoUsuario, String nomeCompleto, String email, String telefoneContato, String senhaAcesso) {
        this.codigoUsuario = codigoUsuario;
        setNomeCompleto(nomeCompleto);
        setEmail(email);
        setTelefoneContato(telefoneContato);
        setSenhaAcesso(senhaAcesso);
    }

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        if (codigoUsuario <= 0) {
            throw new IllegalArgumentException("O código do usuário deve ser maior que zero.");
        }
        this.codigoUsuario = codigoUsuario;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        if (nomeCompleto == null || nomeCompleto.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do usuário não pode ser vazio.");
        }
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("O email informado é inválido.");
        }
        this.email = email;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        if (telefoneContato == null || telefoneContato.trim().isEmpty()) {
            throw new IllegalArgumentException("O telefone de contato não pode ser vazio.");
        }
        this.telefoneContato = telefoneContato;
    }

    public String getSenhaAcesso() {
        return senhaAcesso;
    }

    public void setSenhaAcesso(String senhaAcesso) {
        if (senhaAcesso == null || senhaAcesso.length() < 6) {
            throw new IllegalArgumentException("A senha deve ter pelo menos 6 caracteres.");
        }
        this.senhaAcesso = senhaAcesso;
    }

    public void exibirInformacoes() {
        System.out.println("Código do Usuário: " + codigoUsuario);
        System.out.println("Nome Completo: " + nomeCompleto);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefoneContato);
    }

    public boolean validarAcesso(String email, String senha) {
        return this.email.equals(email) && this.senhaAcesso.equals(senha);
    }
}
