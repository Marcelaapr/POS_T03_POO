package tech.marcelarodriguez;

import tech.marcelarodriguez.composicoes.Endereco;
import tech.marcelarodriguez.pessoas.*;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        Endereco end1 = new Endereco("Rua end1", "Num End1", "Cep end1", "Cid end1", "Estado end1", "Pais end1");


        c1.setCodigo(("1"));
        c1.setNome("Marcela");
        c1.setDataNascimento(LocalDate.of(1990, 1,2));
        c1.setEndereco(end1);
        System.out.println("Nome do cliente: " + c1.getNome());
        System.out.println("Rua do cliente: " + c1.getEndereco().getRua());

        System.out.println("Cep do cliente: " + c1.getEndereco().getCep());

        c2.setEndereco(end1);


    }
}
