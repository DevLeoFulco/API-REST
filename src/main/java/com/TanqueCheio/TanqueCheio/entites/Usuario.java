package com.TanqueCheio.TanqueCheio.entites;

public class Usuario {

    private Long id;
    private String name;
    private String modeloVeiculo;
    private double valorAbastecido;
    private double qtdNoTanque;

    private String postoAbst;

    public void setPostoAbst(String postoAbst) {
        this.postoAbst = postoAbst;
    }

    public String getPostoAbst() {
        return postoAbst;
    }

    private PostoComb postocomb;

    public Usuario (){

    }
       public Usuario(Long id, String name, String modeloVeiculo, double valorAbastecido, double qtdNoTanque, PostoComb postocomb) {
        this.id = id;
        this.name = name;
        this.modeloVeiculo = modeloVeiculo;
        this.valorAbastecido = valorAbastecido;
        this.qtdNoTanque = qtdNoTanque;
        this.postocomb = postocomb;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public void setValorAbastecido(double valorAbastecido) {
        this.valorAbastecido = valorAbastecido;
    }

    public void setQtdNoTanque(double qtdNoTanque) {
        this.qtdNoTanque = qtdNoTanque;
    }

    public void setPostocomb(PostoComb postocomb) {
        this.postocomb = postocomb;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public double getValorAbastecido() {
        return valorAbastecido;
    }

    public double getQtdNoTanque() {
        return qtdNoTanque;
    }

    public PostoComb getPostocomb() {
        return postocomb;
    }
}
