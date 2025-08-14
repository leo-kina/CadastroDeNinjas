package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {
    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa é minha primeria mensgaem nessa rota";
    }


    //Adicionar ninja (Create)
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja Criado";
    }
    //Mostrar todos os ninjas (Read)
    @GetMapping("/todos")
    public String mostrarTodosOsNinjas(){
        return "Ninjas";
    }
    //Procurar ninja por ID (Create)
    @GetMapping("/todosID")
    public String mostrarTodosOsNinjasPorId(){
        return "Ninjas";
    }
    //Alterar dados dos ninjas (Update)
    @PutMapping("/alterarID")
    public String alterarNinjaPorId(){
        return "Alterar Ninja por Id";
    }
    //Deletar Ninjas (Delete)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorId(){
        return "Deletar Ninja por id";
    }
    //Ou seja é o CRUD
}
