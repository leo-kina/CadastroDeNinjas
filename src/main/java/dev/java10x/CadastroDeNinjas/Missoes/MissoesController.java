package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missoes")
public class MissoesController {
    @GetMapping("/listar")
    public String listarMissoes(){
        return "Missoes listadas";
    }
    @PostMapping("/criar")
    public String criarMissoes(){
        return "Missao criada";
    }
    @PutMapping("/alterar")
    public String alterarMissao(){
        return "Missao alterada";
    }
    @DeleteMapping("/deletar")
    public String deletarMissao(){
        return "Missao deletada";
    }
}
