package tech.marcelarodriguez.estruturadedados;

import tech.marcelarodriguez.composicoes.Telefone;

public class ListaDeTelefonesNaoOrdenados {
    //Vetor de telefone
    private Telefone[] telefones;
    //Controle do tamanho = quantidade de elementos
    private int tamanho;
    //Capacidade "inicial" (pode ser alterado depois)
    private static final int CAPACIDADE_PADRAO = 7;

    //CONSTRUTOR da LISTA = cria objetos passando instruções
    public ListaDeTelefonesNaoOrdenados() {
        this.telefones = new Telefone[CAPACIDADE_PADRAO];//construindo o vetor
        this.tamanho = 0;
    }

    public ListaDeTelefonesNaoOrdenados(Telefone[] lisTels) {
        this.telefones = lisTels;
        this.tamanho = lisTels.length;
    }
    //Verificar se está vazia
    public boolean isEmpty() {
        return this.tamanho == 0;
    }
    //Add Telefone com restrição de capacidade


}
