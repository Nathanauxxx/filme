import br.com.br.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.br.alura.screenmatch.calculo.Recomendacao;
import br.com.br.alura.screenmatch.modelos.Episodios;
import br.com.br.alura.screenmatch.modelos.Filme;
import br.com.br.alura.screenmatch.modelos.Serie;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        //para chamar os itens que estao em outra pasta utilizar
        // o nome da pasta que voce criou a variavel
        // e utilizar um new que significa novo
        Filme meuFilme = new Filme();
        meuFilme.setNome("o poderoso chefao");
        meuFilme.setAnoDeLancamento(1998);
        meuFilme.setDuracaoEmMinutos(333);
        System.out.println("duração do filme" + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(2);
        System.out.println("total de avaliacoes:"+ meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie();

        lost.setNome("lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("duração para maratonar lost:"+ lost.getDuracaoEmMinutos());


        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2022);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.incluir(outroFilme);
        calculadora.incluir(meuFilme);
        calculadora.incluir(lost);
        System.out.println(calculadora.getTempoTotal());

        Recomendacao filtro = new Recomendacao();

        filtro.filtra(meuFilme);

        Episodios episodio = new Episodios();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoPaulo = new Filme();
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.setNome("dogville");
        filmeDoPaulo.setAnoDeLancamento(2003);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> ListaDeFilmes = new ArrayList<>();
        ListaDeFilmes.add(filmeDoPaulo);
        ListaDeFilmes.add(meuFilme);
        ListaDeFilmes.add(outroFilme);
        System.out.println("tamanho da lista "+ ListaDeFilmes.size());
        System.out.println("primeiro filme" + ListaDeFilmes.get(0).getNome());
        System.out.println(ListaDeFilmes);
        System.out.println("toString filme" + ListaDeFilmes.get(0).toString());




















    }
}