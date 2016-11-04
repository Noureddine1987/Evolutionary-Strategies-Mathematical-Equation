/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evolutionaryprogramming;

/**
 *
 * @author Fauhan
 */
public class EvolutionStrategies {

    final static int numOfPop = 20;
    final static int numOfGen = 100;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Tanpa Rekombinasi, Mutasi tanpa korelasi dengan satu thau, Seleksi Survivor 1");
        Populasi pop = new Populasi(numOfPop, true);
        System.out.println("Nilai awal");
//        System.out.println("X1 = " + pop.getFittest().getVariable(0));
//        System.out.println("X2 = " + pop.getFittest().getVariable(1));
//        System.out.println("Mutationstep 1 = " + pop.getFittest().getMutationStep(0));
//        System.out.println("Mutationstep 2 = " + pop.getFittest().getMutationStep(1));
        System.out.println("Fitness = " + pop.getFittest().getFitness());
        for (int i = 0; i < numOfGen; i++) {
            pop = ES.Evolution(pop);
//            System.out.println("");
//            System.out.println("");
//            System.out.println("X1 = " + pop.getFittest().getX(0));
//            System.out.println("X2 = " + pop.getFittest().getX(1));
//            System.out.println("Fitness = " + pop.getFittest().getFitness());
        }
        System.out.println("Nilai Akhir");
//        System.out.println("X1 = " + pop.getFittest().getVariable(0));
//        System.out.println("X2 = " + pop.getFittest().getVariable(1));
//        System.out.println("Mutationstep 1 = " + pop.getFittest().getMutationStep(0));
//        System.out.println("Mutationstep 2 = " + pop.getFittest().getMutationStep(1));
        System.out.println("Fitness = " + pop.getFittest().getFitness());
        System.out.println("======================================================================================");
        System.out.println("Tanpa Rekombinasi, Mutasi tanpa korelasi dengan n thau, Seleksi Survivor 1");
        Populasi pop2 = new Populasi(numOfPop, true);
        System.out.println("Nilai awal");
//        System.out.println("X1 = " + pop2.getFittest().getVariable(0));
//        System.out.println("X2 = " + pop2.getFittest().getVariable(1));
//        System.out.println("Mutationstep 1 = " + pop2.getFittest().getMutationStep(0));
//        System.out.println("Mutationstep 2 = " + pop2.getFittest().getMutationStep(1));
        System.out.println("Fitness = " + pop2.getFittest().getFitness());
        for (int i = 0; i < numOfGen; i++) {
            pop2 = ES.Evolution2(pop2);
//            System.out.println("");
//            System.out.println("");
//            System.out.println("X1 = " + pop.getFittest().getX(0));
//            System.out.println("X2 = " + pop.getFittest().getX(1));
//            System.out.println("Fitness = " + pop.getFittest().getFitness());
        }
        System.out.println("Nilai Akhir");
//        System.out.println("X1 = " + pop2.getFittest().getVariable(0));
//        System.out.println("X2 = " + pop2.getFittest().getVariable(1));
//        System.out.println("Mutationstep 1 = " + pop2.getFittest().getMutationStep(0));
//        System.out.println("Mutationstep 2 = " + pop2.getFittest().getMutationStep(1));
        System.out.println("Fitness = " + pop2.getFittest().getFitness());
        System.out.println("======================================================================================");
        System.out.println("Rekombinasi Intermediary Lokal, Mutasi tanpa korelasi dengan satu thau, Seleksi Survivor 2");
        Populasi pop3 = new Populasi(numOfPop, true);
        System.out.println("Nilai awal");
//        System.out.println("X1 = " + pop3.getFittest().getVariable(0));
//        System.out.println("X2 = " + pop3.getFittest().getVariable(1));
//        System.out.println("Mutationstep 1 = " + pop3.getFittest().getMutationStep(0));
//        System.out.println("Mutationstep 2 = " + pop3.getFittest().getMutationStep(1));
        System.out.println("Fitness = " + pop3.getFittest().getFitness());
        for (int i = 0; i < numOfGen; i++) {
            pop3 = ES.Evolution3(pop3);
//            System.out.println("");
//            System.out.println("");
//            System.out.println("X1 = " + pop.getFittest().getX(0));
//            System.out.println("X2 = " + pop.getFittest().getX(1));
//            System.out.println("Fitness = " + pop.getFittest().getFitness());
        }
        System.out.println("Nilai Akhir");
//        System.out.println("X1 = " + pop3.getFittest().getVariable(0));
//        System.out.println("X2 = " + pop3.getFittest().getVariable(1));
//        System.out.println("Mutationstep 1 = " + pop3.getFittest().getMutationStep(0));
//        System.out.println("Mutationstep 2 = " + pop3.getFittest().getMutationStep(1));
        System.out.println("Fitness = " + pop3.getFittest().getFitness());
        System.out.println("======================================================================================");
        System.out.println("Rekombinasi Intermediary Lokal, Mutasi tanpa korelasi dengan satu thau, Seleksi Survivor 2");
        Populasi pop4 = new Populasi(numOfPop, true);
        System.out.println("Nilai awal");
//        System.out.println("X1 = " + pop4.getFittest().getVariable(0));
//        System.out.println("X2 = " + pop4.getFittest().getVariable(1));
//        System.out.println("Mutationstep 1 = " + pop4.getFittest().getMutationStep(0));
//        System.out.println("Mutationstep 2 = " + pop4.getFittest().getMutationStep(1));
        System.out.println("Fitness = " + pop4.getFittest().getFitness());
        for (int i = 0; i < numOfGen; i++) {
            pop4 = ES.Evolution4(pop4);
//            System.out.println("");
//            System.out.println("");
//            System.out.println("X1 = " + pop.getFittest().getX(0));
//            System.out.println("X2 = " + pop.getFittest().getX(1));
//            System.out.println("Fitness = " + pop.getFittest().getFitness());
        }
        System.out.println("Nilai Akhir");
//        System.out.println("X1 = " + pop4.getFittest().getVariable(0));
//        System.out.println("X2 = " + pop4.getFittest().getVariable(1));
//        System.out.println("Mutationstep 1 = " + pop4.getFittest().getMutationStep(0));
//        System.out.println("Mutationstep 2 = " + pop4.getFittest().getMutationStep(1));
        System.out.println("Fitness = " + pop4.getFittest().getFitness());
    }

}
