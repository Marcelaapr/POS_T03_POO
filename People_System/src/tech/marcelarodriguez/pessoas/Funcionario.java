package tech.marcelarodriguez.pessoas;

import tech.marcelarodriguez.composicoes.*;

import java.time.LocalDate;

public class Funcionario extends Pessoa {
    private int matricula;
    private Cargo cargo;
    private double salario;
    private LocalDate data_admissao;

    public Funcionario() {

    }

   public Funcionario(String nome, LocalDate dataNascimento, Endereco endereco, Telefone telsContato, int matricula, Cargo cargo, double salario, LocalDate data_admissao) {
        super(nome, dataNascimento, endereco, telsContato);
        this.matricula = matricula;
        this.cargo = cargo;
        this.salario = salario;
        this.data_admissao = data_admissao;
    }

    public void reajustarSalario(double percentual) {
        this.salario = this.salario * (percentual/100); //10%
    }

    public void promover(Cargo novoCargo) {
        this.cargo = novoCargo;
    }
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Cargo getCargo() {
        return cargo;
    }

   public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getData_admissao() {
        return data_admissao;
    }

    public void setData_admissao(LocalDate data_admissao) {
        this.data_admissao = data_admissao;
    }
}


