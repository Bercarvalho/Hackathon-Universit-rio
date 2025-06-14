import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private String nome;
    private List<Aluno> membros = new ArrayList<>();
    private Projeto projeto;

    public Equipe(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public List<Aluno> getMembros() {
        return membros;
    }

    public void adicionarAluno(Aluno a) {
        if (membros.size() < 5) {
            membros.add(a);
        }
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }
}
