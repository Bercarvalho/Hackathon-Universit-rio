import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Equipes equipes = Equipes.getInstancia();
        Apresentacoes apresentacoes = Apresentacoes.getInstancia();

        Equipe e1 = new Equipe("Equipe A");
        Equipe e2 = new Equipe("Equipe B");

        for (int i = 1; i <= 5; i++) {
            e1.adicionarAluno(new Aluno("AlunoA" + i, "202300" + i));
            e2.adicionarAluno(new Aluno("AlunoB" + i, "202400" + i));
        }

        Projeto p1 = new Projeto("Sistema Solar", "Projeto sobre energia", e1);
        Projeto p2 = new Projeto("BioTech", "Projeto de biotecnologia", e2);

        e1.setProjeto(p1);
        e2.setProjeto(p2);

        equipes.adicionar(e1);
        equipes.adicionar(e2);

        Apresentacao a1 = new Apresentacao(p1);
        Apresentacao a2 = new Apresentacao(p2);

        a1.adicionarJurado(new Jurado("Carlos", "TI"));
        a1.adicionarJurado(new Jurado("Ana", "Design"));
        a1.adicionarJurado(new Jurado("Bruno", "Negócios"));
        a1.adicionarJurado(new Jurado("Larissa", "Engenharia"));

        a2.adicionarJurado(new Jurado("Paula", "TI"));
        a2.adicionarJurado(new Jurado("Eduardo", "Design"));
        a2.adicionarJurado(new Jurado("Marcos", "Negócios"));
        a2.adicionarJurado(new Jurado("Juliana", "Engenharia"));

        a1.darNota(8.5);
        a1.darNota(9.0);
        a1.darNota(7.5);
        a1.darNota(8.0);
        a1.calcularNotaFinal();

        a2.darNota(6.5);
        a2.darNota(7.0);
        a2.darNota(5.5);
        a2.darNota(6.0);
        a2.calcularNotaFinal();

        apresentacoes.adicionar(a1);
        apresentacoes.adicionar(a2);

        System.out.println("Projetos com nota final maior ou igual a 7:");
        List<Apresentacao> aprovados = apresentacoes.getTodas().stream()
            .filter(a -> a.getProjeto().getNotaFinal() >= 7)
            .collect(Collectors.toList());

        for (Apresentacao ap : aprovados) {
            Projeto p = ap.getProjeto();
            System.out.println("- " + p.getTitulo() + " (" + p.getNotaFinal() + ")");
        }
    }
}
