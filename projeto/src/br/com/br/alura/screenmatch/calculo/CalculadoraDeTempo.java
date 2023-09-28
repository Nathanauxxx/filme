package br.com.br.alura.screenmatch.calculo;

import br.com.br.alura.screenmatch.modelos.Filme;
import br.com.br.alura.screenmatch.modelos.Serie;
import br.com.br.alura.screenmatch.modelos.Titulo;

import java.security.PublicKey;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {

        return this.tempoTotal;
    }
//    public void incluir(Filme f){
//
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//    public void inclui(Serie s){
//
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }
    public void incluir(Titulo titulo){
        System.out.println("adicionando duração em minutos de"+ titulo);
        this.tempoTotal +=titulo.getDuracaoEmMinutos();
    }
}
