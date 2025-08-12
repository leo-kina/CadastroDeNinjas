package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//JPA = Java Persistence API
//Entity ele transforma a classe em uma entidade do db
@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {
//anotacao id serve para falar q o atributo logo em
//baixo dele vai ser um id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO.IDENTITY) //gerar automaticamente o ID
   private Long id;
   private String nome;
   private String email;
   private int idade;

   @ManyToOne//um ninja tem uma unica missao
   @JoinColumn(name = "missoes_id") //Foreing Key ou chave estrangeira
   private MissoesModel missoes;



}
