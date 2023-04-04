package atividade2;

public class PopulacaoDeBaratas {
    private int TamanhoPopulacao;
    public PopulacaoDeBaratas(int PopulacaoInicial){
        this.TamanhoPopulacao = PopulacaoInicial;
    }
    public void esperaUmTempo(){
        this.TamanhoPopulacao *= 2;
    }
    public void pulveriza() {
        this.TamanhoPopulacao = (int) Math.round(this.TamanhoPopulacao * 0.25);
    }

    public int getTamanhoPopulacao() {
        return this.TamanhoPopulacao;
    }
}


