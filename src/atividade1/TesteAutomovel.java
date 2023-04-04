package atividade1;

public class TesteAutomovel {
    public static void main(String[] args) {

        Automovel car1 = new Automovel("PSG1970",80,90);

        car1.abastece(40);
        System.out.println("combustivel no tanque\n:"+car1.getCombustivelNoTanque());
        car1.dirige(400);
        System.out.println("Combustivel no tanque\n:"+car1.getCombustivelNoTanque());
        System.out.println("Viagens realizadas:\n"+car1.getNumeroDeViagensRealizadas());
        System.out.println("Quilometragem total:\n"+car1.getKmTotal());
        car1.dirige(150);


    }
}
