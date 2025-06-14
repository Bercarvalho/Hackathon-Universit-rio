import java.util.ArrayList;
import java.util.List;

public class Equipes {
    private static Equipes unica = null;
    private List<Equipe> lista = new ArrayList<>();

    private Equipes() {}

    public static Equipes getInstancia() {
        if (unica == null) {
            unica = new Equipes();
        }
        return unica;
    }

    public void adicionar(Equipe e) {
        lista.add(e);
    }

    public List<Equipe> getTodas() {
        return lista;
    }
}
