package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Listas {
    public static void main(String[] args){
        // Dada uma lista com sete notas de um aluno [7, 8.5, 9.3, 7, 5, 7, 0, 3.6], faça:
        System.out.println("Crie uma lista e add as sete notas: ");
        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(7.0);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: " +notas.indexOf(5d));
        // notas.indexOf -> Exibe a posição do elemento desejado;

        /*System.out.println("Adicione a lista a nota 8.0 na posição 4: ");
        notas.add(i= 4, e= 8d);
        System.out.println(notas);
        //Aqui nesse método pode-se adicionar uma nota em uma posição específica;
        */

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);
        // Aqui pode-se substituir um item da lista por outro desejado;


        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));
        // Irá retornar um False, pois a nota 5 foi substituida no código precedente;

        System.out.println("Exiba todas as notas na ordem que foram informados: ");
        for (Double nota : notas) System.out.println(nota);
        // Exibe as notas de forma ordenada e em cascata;

        System.out.println("Exiba a terceina nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());
        // Exibe o terceiro elemento

        /*System.out.println("Exiba a menor nota: " + Collection.min(notas));
        // Collection.min() -> Por meus elementos serem do tipo double, eles já sabem, por comparações, quem é o menor
        // Apenas peguei isso e exibi na tela
         */

        /* System.out.println("Exiba a menor nota: " + Collection.max(notas));
        // Collection.min() -> Por meus elementos serem do tipo double, eles já sabem, por comparações, quem é o maior
        // Apenas peguei isso e exibi na tela
         */

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        //Aqui nesse trexo eu usei o While para verificar (usando o cursor) qual elemento está a frente.
        // Se há algum elemento, então ele é somado a variavel soma, até que ñ tenha mais elementos
        System.out.println("Exiba a soma dos elementos: " + soma);

        System.out.println("Exiba a média das notas: " + soma/ notas.size());
        // notas.size() Vê os elementos como inteiro, lendo assim os elementos como quantidade. Consigo assim a média

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);
        // Usei o Iterator para verificar as notas menores que sete e remover as que forem

        System.out.println("Apague a lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());




    }
}
