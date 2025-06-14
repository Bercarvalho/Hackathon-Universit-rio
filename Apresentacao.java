import java.util.ArrayList;
import java.util.List;

public class Apresentacao {
    private Projeto projeto;
    private List<Jurado> jurados = new ArrayList<>();
    private List<Double> notas = new ArrayList<>();

    public Apresentacao(Projeto projeto) {
        this.projeto = projeto;
    }

    public void adicionarJurado(Jurado j) {
        if (jurados.size() < 4) {
            jurados.add(j);
        }
    }

    public void darNota(double nota) {
        if (notas.size() < 4) {
            notas.add(nota);
        }
    }

    public void calcularNotaFinal() {
        double soma = 0;
        for (double n : notas) {
            soma += n;
        }
        double media = notas.size() > 0 ? soma / notas.size() : 0;
        projeto.setNotaFinal(media);
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public List<Jurado> getJurados() {
        return jurados;
    }

    public List<Double> getNotas() {
        return notas;
    }
}
