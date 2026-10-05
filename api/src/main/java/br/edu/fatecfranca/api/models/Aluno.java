package br.edu.fatecfranca.api.models;


import java.util.List;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "alunos")
public class Aluno {


   @Id
   private String id;


   private String nome;
   private String cpf;
   private String telefone;
   private String email;


   private List<Endereco> enderecos;


   // Construtor genérico
   public Aluno() {
   }


   // Construtor personalizado completo, com todos os atributos
   public Aluno(
           String id,
           String nome,
           String cpf,
           String telefone,
           String email,
           List<Endereco> enderecos) {
       this.id = id;
       this.nome = nome;
       this.cpf = cpf;
       this.telefone = telefone;
       this.email = email;
       this.enderecos = enderecos;
   }


   //*
}
