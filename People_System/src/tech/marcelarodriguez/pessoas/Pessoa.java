package tech.marcelarodriguez.pessoas;

import tech.marcelarodriguez.composicoes.*;

import java.time.LocalDate;
import java.time.Period;
public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private Endereco endereco;
    private Telefone telsContato;


    public Pessoa(){
        System.out.println(("Criando uma pessoa" + " " + " sem atributos!"));
    }
    public Pessoa(String nome, LocalDate dataNascimento, Endereco endereco, Telefone telsContato) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.telsContato = telsContato;
    }

    public void cadastrar(String nome, LocalDate dataNascimento, Endereco endereco, Telefone telsContato) {
        System.out.println("Digite o Nome: ");
        this.setNome(nome);
        System.out.println("Digite a data de Nascimento: ");
        this.setDataNascimento(dataNascimento);
        System.out.println("Digite o Endereço: ");
        this.setEndereco(endereco);
        System.out.println("Digite o Telefone de Contato: ");
        this.setTelsContato(telsContato);
    }
    public int obterIdade(){
        int idade = 0;
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(this.dataNascimento, dataAtual);
        idade = periodo.getYears();
        return idade;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone getTelsContato() {
        return telsContato;
    }

    public void setTelsContato(Telefone telsContato) {
        this.telsContato = telsContato;
    }
}
