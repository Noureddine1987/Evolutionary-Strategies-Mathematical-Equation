/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evolutionaryprogramming;

import java.util.Random;

/**
 *
 * @author Fauhan
 */
public class ES {
    
    public static Kromosom UniformSelection(Populasi pop){
        Random r = new Random();
        Kromosom k = pop.getKromosom(r.nextInt(pop.getNumbOfPop()));
        return k;
    } 
    public static Kromosom CrossoverIL(Populasi pop){ //Rekombinasi Intermediary Lokal
        Kromosom parent1 = UniformSelection(pop);
        Kromosom parent2 = UniformSelection(pop);
        Kromosom child = new Kromosom();
        Random r1 = new Random();
        int rng1 = r1.nextInt(pop.getNumbOfPop());
        int rng2 = r1.nextInt(pop.getNumbOfPop());
        for(int i=0;i<parent1.getVariableLenght();i++){
            double x = parent1.getVariable(i);
            double y = parent2.getVariable(i);
            double xy = (x+y)/2;
            child.setVariable(xy, i);
        }
        child.setFitness();
        return child;
    }
    public static Kromosom Mutation(Kromosom kromosom) {
        //Mutasi tanpa korelasi dengan satu thau
        Random r = new Random();
        double a = r.nextGaussian();
        double lr = 1 / (Math.sqrt(kromosom.getVariableLenght()));
        double[] newMutationStep = new double[1];
        newMutationStep[0] = kromosom.getMutationStep(0) * (Math.exp(lr * a));
        double[] newVariable = new double[2];
        for (int i = 0; i < kromosom.getVariableLenght(); i++) {
            double b = r.nextGaussian();
            newVariable[i] = kromosom.getVariable(i) + newMutationStep[0] * b;
        }
        Kromosom newKromosom = new Kromosom(newVariable[0], newVariable[1], newMutationStep[0]);
        return newKromosom;
    }

    public static Kromosom Mutation2(Kromosom kromosom) {
        //Mutasi tanpa korelasi dengan n thau
        Random r = new Random();
        double a = r.nextGaussian();
        double aa = r.nextGaussian();
        double lr = 1 / (Math.sqrt(kromosom.getVariableLenght()));
        double lr2 = 1 / (Math.pow((2 * kromosom.getVariableLenght()), 1 / 4));
        double[] newMutationStep = new double[2];
        for (int i = 0; i < kromosom.getVariableLenght(); i++) {
            newMutationStep[i] = kromosom.getMutationStep(i) * (Math.exp((lr * a)+(lr2 * aa)));
        }
        double[] newVariable = new double[2];
        for (int i = 0; i < kromosom.getVariableLenght(); i++) {
            double b = r.nextGaussian();
            newVariable[i] = kromosom.getVariable(i) + newMutationStep[i] * b;
        }
        Kromosom newKromosom = new Kromosom(newVariable[0], newVariable[1], newMutationStep[0], newMutationStep[1]);
        return newKromosom;
    }

    public static Populasi SurvivorSelection(Populasi pop) {
        Populasi totalPopulation = new Populasi(pop.getNumbOfPop(), false);
        for (int i = 0; i < pop.getNumbOfPop(); i++) {
            totalPopulation.setKromosom(i, pop.getKromosom(i));
        }
        pop.sortByFitness();
        Populasi newPopulation = new Populasi(pop.getNumbOfPop() / 7, false);
        for (int i = 0; i < newPopulation.getNumbOfPop(); i++) {
            newPopulation.setKromosom(i, pop.getKromosom(i));
        }
        return newPopulation;
    }

    public static Populasi Evolution(Populasi pop) {
        //Tanpa Rekombinasi, Mutasi tanpa korelasi dengan satu thau, Seleksi Survivor 1
        Populasi newPopulation = new Populasi(pop.getNumbOfPop() * 7, false);
        for (int i = 0; i < newPopulation.getNumbOfPop(); i++) {
            int j = 0;
            Kromosom x;
            if (i < pop.getNumbOfPop()) {
                x = pop.getKromosom(i);
                newPopulation.setKromosom(i, x);
            } else {
                 x = Mutation(pop.getKromosom(j));
                newPopulation.setKromosom(i, x);
            }
        }
        newPopulation = SurvivorSelection(newPopulation);
        return newPopulation;
    }
    public static Populasi Evolution2(Populasi pop) {
        //Tanpa Rekombinasi, Mutasi tanpa korelasi dengan n thau, Seleksi Survivor 1
        Populasi newPopulation = new Populasi(pop.getNumbOfPop() * 7, false);
        for (int i = 0; i < newPopulation.getNumbOfPop(); i++) {
            int j = 0;
            Kromosom x;
            if (i < pop.getNumbOfPop()) {
                x = pop.getKromosom(i);
                newPopulation.setKromosom(i, x);
            } else {
                x = Mutation2(pop.getKromosom(j));
                newPopulation.setKromosom(i, x);
            }
        }
        newPopulation = SurvivorSelection(newPopulation);
        return newPopulation;
    }
    public static Populasi Evolution3(Populasi pop) {
        //Rekombinasi Intermediary Lokal, Mutasi tanpa korelasi dengan satu thau, Seleksi Survivor 2
        Populasi newPopulation = new Populasi(pop.getNumbOfPop() * 7, false);
        for (int i = 0; i < newPopulation.getNumbOfPop(); i++) {
            int j = 0;
            Kromosom x;
            Kromosom y;
            if (i < pop.getNumbOfPop()) {
                x = pop.getKromosom(i);
                newPopulation.setKromosom(i, x);
            } else {
                y = CrossoverIL(pop);
                x = Mutation(y);
                newPopulation.setKromosom(i, x);
            }
        }
        newPopulation = SurvivorSelection(newPopulation);
        return newPopulation;
    }
    public static Populasi Evolution4(Populasi pop) {
        //Rekombinasi Intermediary Lokal, Mutasi tanpa korelasi dengan satu thau, Seleksi Survivor 2
        Populasi newPopulation = new Populasi(pop.getNumbOfPop() * 7, false);
        for (int i = 0; i < newPopulation.getNumbOfPop(); i++) {
            int j = 0;
            Kromosom x;
            Kromosom y;
            if (i < pop.getNumbOfPop()) {
                x = pop.getKromosom(i);
                newPopulation.setKromosom(i, x);
            } else {
                y = CrossoverIL(pop);
                x = Mutation2(y);
                newPopulation.setKromosom(i, x);
            }
        }
        newPopulation = SurvivorSelection(newPopulation);
        return newPopulation;
    }
}
