package Prova;

import javax.xml.crypto.Data;

public class Pet extends Cliente {
    private int codigo;
    private String apelido;
    private String sexo;
    private int idade;
    private String tiporacao;
    private int peso;
    private Data dataVenda;
    private String pelo;
    private String domesticado;
    private String asas;

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

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
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
}
