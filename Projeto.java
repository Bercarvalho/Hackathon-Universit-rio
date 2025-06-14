public class Projeto {
    private String titulo;
    private String resumo;
    private Equipe equipe;
    private double notaFinal;

    public Projeto(String titulo, String resumo, Equipe equipe) {
        this.titulo = titulo;
        this.resumo = resumo;
        this.equipe = equipe;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getResumo() {
        return resumo;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }
}
