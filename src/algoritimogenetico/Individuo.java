package algoritimogenetico;

import java.util.Random;

public class Individuo {

    private double distanciaPercorrida;
    private int numeroDePontos;

    public int ordemIndividuos[][];

    Random r = new Random();

    // Métodos get e set
    public int getNumeroDePontos() {
        return numeroDePontos;
    }

    public void setNumeroDePontos(int numeroDePontos) {
        this.numeroDePontos = numeroDePontos;
    }

    public double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public void setDistanciaPercorrida(double distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }

    // Construtor
    public Individuo() {

    }

    // Métodos
    public void assimilarPontos(int[] coordenadasX, int[] coordenadasY) {

        for (int i = 0; i < coordenadasX.length; i++) {

            this.ordemIndividuos[i][1] = coordenadasY[i];
            this.ordemIndividuos[i][0] = coordenadasX[i];

        }

    }

    public void embaralharVetor(int[] coordenadasX) {

        for (int i = 0; i < coordenadasX.length; i++) {
            int randomIndexToSwap = r.nextInt(coordenadasX.length);
            int temp1 = ordemIndividuos[randomIndexToSwap][0];
            int temp2 = ordemIndividuos[randomIndexToSwap][1];
            ordemIndividuos[randomIndexToSwap][0] = ordemIndividuos[i][0];
            ordemIndividuos[randomIndexToSwap][1] = ordemIndividuos[i][1];

            ordemIndividuos[i][0] = temp1;
            ordemIndividuos[i][1] = temp2;
        }

    }

    public void eliminarPiores(Individuo[] individuo) {

        this.ordemIndividuos = individuo[0].ordemIndividuos;

    }

    public void morphIntoChildren(Individuo[] individuo, int[] coordenadasX, Random r, int fatorMutacao) {

        for (int m = 0; m < fatorMutacao; m++) {
            int[][] original = this.ordemIndividuos;
            int[][] newSon = new int[original.length][];
            for (int l = 0; l < original.length; l++) {
                newSon[l] = original[l].clone();
            }

            int random1 = r.nextInt(coordenadasX.length);
            int random2 = r.nextInt(coordenadasX.length);

            int temp1 = newSon[random1][0];
            int temp2 = newSon[random1][1];

            newSon[random1][0] = newSon[random2][0];
            newSon[random1][1] = newSon[random2][1];

            newSon[random2][0] = temp1;
            newSon[random2][1] = temp2;

            this.ordemIndividuos = newSon.clone();
        }
    }

}
