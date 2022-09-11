package br.edu.ifpr.poswebsys;

import br.edu.ifpr.poswebsys.rh.dominio.Pessoa;
import br.edu.ifpr.poswebsys.rh.dominio.PessoaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class PopulacaoInicialBanco  implements CommandLineRunner {

    @Autowired
    private PessoaRepositorio pessoaRepo;
    @Override
    public void run(String... args) throws Exception {
        Pessoa p1 = new Pessoa("Gean Schuck");
        p1.setDataNascimento(LocalDate.of(1996,10,26));
        p1.setEmail("geangv@outlook.com");

        Pessoa p2 = new Pessoa("Arthur Schuck");
        p2.setDataNascimento(LocalDate.of(2011,2,3));
        p2.setEmail("arthursgv@outlook.com");

        pessoaRepo.save(p1);
        pessoaRepo.save(p2);
    }
}
