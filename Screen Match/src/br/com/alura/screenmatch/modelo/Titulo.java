package br.com.alura.screenmatch.modelo;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacao;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento){
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getTotalDeAvaliacao(){
        return this.totalDeAvaliacao;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }
    public String getNome() {
        return this.nome;
    }
    public int getAnoDeLancamento() {
        return this.anoDeLancamento;
    }
    public int getDuracaoEmMinutos() {
        return this.duracaoEmMinutos;
    }
    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: "+this.nome);
        System.out.println("Ano de lançamento: "+this.anoDeLancamento);
        System.out.println("Duração em minutos: "+this.duracaoEmMinutos);
    }
    public void avaliaFilme(double nota){
        this.somaDasAvaliacoes += nota;
        this.totalDeAvaliacao++;
    }
    public double pegaMedia(){
        return somaDasAvaliacoes/totalDeAvaliacao;
    }
}
