import Question2.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario(1, "João Silva", "joao@email.com", "99999-9999", "senha123");
        Usuario usuario2 = new Usuario(2, "Maria Oliveira", "maria@email.com", "88888-8888", "senha456");

        Titulo titulo1 = new Titulo(1, "FIFA 23", "Jogo de futebol emocionante");
        Titulo titulo2 = new Titulo(2, "Call of Duty", "Jogo de ação e tiro");
        Titulo titulo3 = new Titulo(3, "Minecraft", "Jogo de construção e exploração");

        DispositivoPlataforma plataformaXbox = new DispositivoPlataforma(1, "Xbox Series X", 10.00);
        DispositivoPlataforma plataformaPS4 = new DispositivoPlataforma(2, "PlayStation 4", 8.00);
        DispositivoPlataforma plataformaPC = new DispositivoPlataforma(3, "PC", 12.00);

        TarifaPorPlataforma tarifaFIFA_Xbox = new TarifaPorPlataforma(titulo1, plataformaXbox, 15.00);
        TarifaPorPlataforma tarifaFIFA_PS4 = new TarifaPorPlataforma(titulo1, plataformaPS4, 18.00);
        TarifaPorPlataforma tarifaCOD_Xbox = new TarifaPorPlataforma(titulo2, plataformaXbox, 20.00);
        TarifaPorPlataforma tarifaMinecraft_PC = new TarifaPorPlataforma(titulo3, plataformaPC, 10.00);

        List<AluguelTitulo> titulosAlugados1 = new ArrayList<>();
        titulosAlugados1.add(new AluguelTitulo(titulo1, plataformaXbox, 3, tarifaFIFA_Xbox.getTarifaDiaria()));
        titulosAlugados1.add(new AluguelTitulo(titulo2, plataformaXbox, 2, tarifaCOD_Xbox.getTarifaDiaria()));

        RegistroAluguel aluguel1 = new RegistroAluguel(1, usuario1, new Date(), titulosAlugados1);

        List<AluguelTitulo> titulosAlugados2 = new ArrayList<>();
        titulosAlugados2.add(new AluguelTitulo(titulo1, plataformaPS4, 4, tarifaFIFA_PS4.getTarifaDiaria()));
        titulosAlugados2.add(new AluguelTitulo(titulo3, plataformaPC, 5, tarifaMinecraft_PC.getTarifaDiaria()));

        RegistroAluguel aluguel2 = new RegistroAluguel(2, usuario2, new Date(), titulosAlugados2);

        Dispositivo console1 = new Dispositivo(1, "Xbox Series X", 12.00);
        Dispositivo console2 = new Dispositivo(2, "PlayStation 4", 10.00);

        Equipamento acessorio1 = new Equipamento(1, "Controle", console1);
        Equipamento acessorio2 = new Equipamento(2, "Headset", console1);
        Equipamento acessorio3 = new Equipamento(3, "Teclado", console2);

        SessaoConsole sessao1 = new SessaoConsole(1, usuario1, console1, 2.5, new Date());
        SessaoConsole sessao2 = new SessaoConsole(2, usuario2, console2, 3.0, new Date());

        System.out.println("Locações Realizadas:");
        aluguel1.exibirDetalhes();
        aluguel2.exibirDetalhes();

        System.out.println("\nUsos de Console:");
        sessao1.exibirDetalhesSessao();
        sessao2.exibirDetalhesSessao();
    }
}
