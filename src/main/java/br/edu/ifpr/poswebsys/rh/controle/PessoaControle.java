package br.edu.ifpr.poswebsys.rh.controle;

import br.edu.ifpr.poswebsys.rh.dominio.PessoaRepositorio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PessoaControle {

    private PessoaRepositorio pessoaRepo;

    public PessoaControle(PessoaRepositorio pessoaRepo){
        this.pessoaRepo = pessoaRepo;
    }

    @GetMapping("/rh/pessoas")
    public String pessoas(Model model){
        model.addAttribute("listaPessoas", pessoaRepo.findAll());
        return "rh/pessoas/index";
    }
}
