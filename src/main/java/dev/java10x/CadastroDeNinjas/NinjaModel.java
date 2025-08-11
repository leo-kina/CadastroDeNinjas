package dev.java10x.CadastroDeNinjas;

import jakarta.persistence.*;

//JPA = Java Persistence API
//Entity ele transforma a classe em uma entidade do db
@Entity
@Table(name = "tb_cadastro") //criacao da tabela
public class NinjaModel {
//anotacao id serve para falar q o atributo logo em
//baixo dele vai ser um id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO.IDENTITY) //gerar automaticamente o ID
   private Long id;
   private String nome;
   private String email;
   private int idade;

    public NinjaModel() {

    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
