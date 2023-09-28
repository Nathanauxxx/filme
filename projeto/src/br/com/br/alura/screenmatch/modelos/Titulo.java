package br.com.br.alura.screenmatch.modelos;

public class Titulo {

    private String nome;
    private int anoDeLancamento;
    private boolean incluindo;
    private double somaDasAvaliacoes;
    private   int duracaoEmMinutos;

    private int totalDeAvaliacoes;
    //setters e para incluir o valor
    //para atribuir um valor set e para pegar get
    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluindo() {
        return incluindo;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluindo(boolean incluindo) {
        this.incluindo = incluindo;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme "+nome);
        System.out.println("ano do lançamento " +anoDeLancamento);
        System.out.println("duração de minutos do filme "+duracaoEmMinutos);
    }
    //void sempre que voce quiser fazer uma ação utilizar ele.
    public void avalia(double nota){
        somaDasAvaliacoes +=nota;
        totalDeAvaliacoes++;
    }
    public double pegaMedia(){
        return somaDasAvaliacoes/totalDeAvaliacoes;

    }
}
