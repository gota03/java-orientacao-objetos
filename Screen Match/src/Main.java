import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelo.Episodio;
import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.setNome("Vingadores");
        filme.setAnoDeLancamento(2011);
        filme.setDuracaoEmMinutos(220);

        Filme filme2 = new Filme();
        filme2.setNome("Kingsman");
        filme2.setAnoDeLancamento(2019);
        filme2.setDuracaoEmMinutos(160);

        filme.exibeFichaTecnica();
        filme.avaliaFilme(8.0);
        filme.avaliaFilme(6.5);
        filme.avaliaFilme(9.0);
        System.out.println("Total de avaliações: "+filme.getTotalDeAvaliacao());

        System.out.println(filme.pegaMedia());

        Serie serie = new Serie();
        serie.setNome("Dark");
        serie.setAnoDeLancamento(2019);
        serie.exibeFichaTecnica();
        serie.setTemporadas(3);
        serie.setEpisodiosPorTemporada(12);
        serie.setMinutosPorEpisodio(65);
        System.out.println("Duração para maratonar dark: "+serie.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme);
        calculadora.inclui(filme2);
        calculadora.inclui(serie);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme);

        Episodio episodio = new Episodio();
        episodio.setNumero(2);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacao(450);
        filtro.filtra(episodio);

    }
}
