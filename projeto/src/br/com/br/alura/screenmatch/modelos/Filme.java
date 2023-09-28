package br.com.br.alura.screenmatch.modelos;

import br.com.br.alura.screenmatch.calculo.Classificavel;

public class Filme extends Titulo implements Classificavel {
    //QUANDO USAR EXTENDS fala que o filme tem mais o diretor
    //para usar a interface no sistema e integrar com outro utilizar o implementes e o nome da classe ao lado
  private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int)pegaMedia() /2;
    }

    @Override
    public String toString() {
        return "filme:" +this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }
}
