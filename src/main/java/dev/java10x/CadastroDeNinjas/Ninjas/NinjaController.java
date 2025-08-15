package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {
    private NinjaService ninjaService;
    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa é minha primeria mensgaem nessa rota";
    }


    //Adicionar ninja (Create)
    @PostMapping("/criar")
    public NinjaModel criarNinja(@RequestBody NinjaModel ninjaModel){
        return ninjaService.criarNinja(ninjaModel);
    }

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    //Mostrar todos os ninjas (Read)
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
    }
    //Procurar ninja por ID (Create)
    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjasPorId(@PathVariable Long id){
        return ninjaService.listarNinjasPorId(id);
    }
    //Alterar dados dos ninjas (Update)
    @PutMapping("/alterar/{id}")
    public NinjaModel alterarNinjaPorId(@PathVariable Long id, @RequestBody NinjaModel ninjaAtualizado){
        return ninjaService.atualizarNinja(id, ninjaAtualizado);
    }
    //Deletar Ninjas (Delete)
    @DeleteMapping("/deletar/{id}")
    public void deletarNinjaPorId(@PathVariable Long id){
       ninjaService.deletarNinjaPorId(id);
    }
    //Ou seja é o CRUD
}
