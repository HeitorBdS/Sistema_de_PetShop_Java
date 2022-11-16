package Prova;

import javax.xml.crypto.Data;

public class Pet extends Cliente {
    private String especie;
    private int codigo;
    private String apelido;
    private String sexo;
    private int idade;
    private String tiporacao;
    private int qtdracao;
    private float peso;
    private String pelo;
    private String domesticado;
    private String asas;
    private Data dataVenda;
    private String status;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTiporacao() {
        return tiporacao;
    }

    public void setTiporacao(String tiporacao) {
        this.tiporacao = tiporacao;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public Data getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Data dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getPelo() {
        return pelo;
    }

    public void setPelo(String pelo) {
        this.pelo = pelo;
    }

    public String getDomesticado() {
        return domesticado;
    }

    public void setDomesticado(String domesticado) {
        this.domesticado = domesticado;
    }

    public String getAsas() {
        return asas;
    }

    public void setAsas(String asas) {
        this.asas = asas;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getQtdracao() {
        return qtdracao;
    }

    public void setQtdracao(int qtdracao) {
        this.qtdracao = qtdracao;
    }
}
