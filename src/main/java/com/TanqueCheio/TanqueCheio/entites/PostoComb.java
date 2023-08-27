package com.TanqueCheio.TanqueCheio.entites;

public class PostoComb {
    private Long id;
    private String nomePosto;
    private String endPosto;
    private String tipoCombustivel;
    private double precoGasCom;
    private double precoGasAdtv;
    private double precoAlcool;

    private double precoDieselComum;
    private double precoDieselS10;
    private double precoGasNatural;

    public PostoComb (){

    }

    public PostoComb(Long id, String nomePosto, String endPosto, String tipoCombustivel, double precoGasCom, double precoGasAdtv, double precoAlcool, double precoDieselComum, double precoDieselS10, double precoGasNatural) {
        this.id = id;
        this.nomePosto = nomePosto;
        this.endPosto = endPosto;
        this.tipoCombustivel = tipoCombustivel;
        this.precoGasCom = precoGasCom;
        this.precoGasAdtv = precoGasAdtv;
        this.precoAlcool = precoAlcool;
        this.precoDieselComum = precoDieselComum;
        this.precoDieselS10 = precoDieselS10;
        this.precoGasNatural = precoGasNatural;
    }

    public Long getId() {
        return id;
    }

    public String getNomePosto() {
        return nomePosto;
    }

    public String getEndPosto() {
        return endPosto;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public double getPrecoGasCom() {
        return precoGasCom;
    }

    public double getPrecoGasAdtv() {
        return precoGasAdtv;
    }

    public double getPrecoAlcool() {
        return precoAlcool;
    }

    public double getDieselComum() {
        return precoDieselComum;
    }

    public double getPrecoDieselS10() {
        return precoDieselS10;
    }

    public double getPrecoGasNatural() {
        return precoGasNatural;
    }

    public void setid(long l) {
    }

    public void setNomePosto(String nomePosto) {
        this.nomePosto = nomePosto;
    }

    public void setEndPosto(String endPosto) {
        this.endPosto = endPosto;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public void setPrecoGasCom(double precoGasCom) {
        this.precoGasCom = precoGasCom;
    }

    public void setPrecoGasAdtv(double precoGasAdtv) {
        this.precoGasAdtv = precoGasAdtv;
    }

    public void setPrecoAlcool(double precoAlcool) {
        this.precoAlcool = precoAlcool;
    }

    public void setDieselComum(double dieselComum) {
        this.precoDieselComum = dieselComum;
    }

    public void setPrecoDieselS10(double precoDieselS10) {
        this.precoDieselS10 = precoDieselS10;
    }

    public void setPrecoGasNatural(double precoGasNatural) {
        this.precoGasNatural = precoGasNatural;
    }
}
