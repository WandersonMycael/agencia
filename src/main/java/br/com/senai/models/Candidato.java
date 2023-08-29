package br.com.senai.models;

import java.time.LocalDate;

import br.com.senai.enuns.Genero;

public class Candidato {
   public String  nomeCompleto;
  public  LocalDate dataNascimento;
   public String cpf;
    public String email;
    public Genero genero;
   public String naturalidade;
   public String nacionalidade; 
   public Endereco endereco;

}
