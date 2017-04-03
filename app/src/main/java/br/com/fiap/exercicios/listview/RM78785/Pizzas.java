package br.com.fiap.exercicios.listview.RM78785;

public class Pizzas {


    private Integer id;
    private String nome;
    private String descricao;
    private String igredientes;
    private Double valor;
    private String igredienteAlergicos;
    private Integer pontuacao;
    private int foto;

    public Pizzas(Integer id, String nome, String descricao, String igredientes, Double valor,
                  String igredienteAlergicos, Integer pontuacao, int foto) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.igredientes = igredientes;
        this.valor = valor;
        this.igredienteAlergicos = igredienteAlergicos;
        this.pontuacao = pontuacao;
        this.foto = foto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getIgredientes() {
        return igredientes;
    }

    public void setIgredientes(String igredientes) {
        this.igredientes = igredientes;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getIgredienteAlergicos() {
        return igredienteAlergicos;
    }

    public void setIgredienteAlergicos(String igredienteAlergicos) {
        this.igredienteAlergicos = igredienteAlergicos;
    }

    public Integer getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(Integer pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

}
