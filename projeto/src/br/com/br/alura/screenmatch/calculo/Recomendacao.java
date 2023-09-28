package br.com.br.alura.screenmatch.calculo;

import br.com.br.alura.screenmatch.modelos.Filme;

public class Recomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel){
        if(classificavel.getClassificacao() >= 4){
            System.out.println("está etre os preferidos do momento!");
        } else if (classificavel.getClassificacao() >=2) {
            System.out.println("muito bem avaliado no momento");
        }else{
            System.out.println("coloque na sua lista para assistir depois");
        }
    }
}
