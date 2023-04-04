package atividade2;

public class TestePopulacaoBarata {
    public static void main(String[] args) {
        PopulacaoDeBaratas populacao = new PopulacaoDeBaratas(10);
        System.out.println("Tamanho inicial da população: " + populacao.getTamanhoPopulacao());
        populacao.esperaUmTempo();
        System.out.println("Tamanho da população após um tempo: " + populacao.getTamanhoPopulacao());
        populacao.pulveriza();
        System.out.println("Tamanho da população após pulverização: " + populacao.getTamanhoPopulacao());
    }
}
