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
    @GeneratedValue(strategy = GenerationType.IDENTITY) //gerar automaticamente o ID
    @Column(name = "id") //para nomear as colunas
    private Long id;

    @Column(name = "nome")
    private String nome;

   @Column(unique = true) //coluna precisa ser unica (ou seja o email nao vai repetir)
   private String email;

    @Column(name = "idade")
    private int idade;

   @ManyToOne//um ninja tem uma unica missao
   @JoinColumn(name = "missoes_id") //Foreing Key ou chave estrangeira
   private MissoesModel missoes;



}
