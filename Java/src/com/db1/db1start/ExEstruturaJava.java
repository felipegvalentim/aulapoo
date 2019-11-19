package com.db1.db1start;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Arrays;
import java.util.List;
import static java.util.Collections.*;

public class ExEstruturaJava {
    public static void main(String[] args) {

        //Exibir Cores Favoritas
        System.out.println("Lista de cores Favoritas: "+coresFavoritas());
        separar();

        //Exibir Quantidade de Cores
        listaQtdd();
        separar();

        //Removendo a segunda posição
        removeString();
        separar();

        //Imprimindo a lista de cores do primeiro método
        imprimirFav(coresFavoritas());
        separar();

        //Imprimindo a lista em ordem alfabética
        imprimirEmOrdemAlfabetica(coresFavoritas());
        separar();

        //Removendo um item da lista
        removeCor(coresFavoritas());
        separar();

        //Imprimindo a lista em ordem decrescente
        ordemDec(coresFavoritas());
    }

         //Método que retorne os nomes das cores que você mais gosta
    public static List<String> coresFavoritas(){
        List<String> coresFav = new ArrayList<>(Arrays.asList("Preto", "Branco", "Cinza"));
        return coresFav;
    }

        //Método que dado uma lista retorne a quantidade de itens

    public static void listaQtdd(){
        List<String> qtddDados = new ArrayList<>();
        qtddDados.add("Felipe");
        qtddDados.add("Flavia");
        qtddDados.add("Lidia");
        qtddDados.add("Arthur");
        qtddDados.add("Rogerio");
        System.out.println("Lista de Itens: " + qtddDados);
        System.out.println("Número de itens: " + qtddDados.size());
    }

        //Método que receba 3 String, adicione todos em uma lista e remova a segunda posição

    public static void removeString(){
        List<String> tresString = new ArrayList<>();
        tresString.add("Mouse");
        tresString.add("Teclado");
        tresString.add("Monitor");
        System.out.println("Minha lista: " + tresString);

        tresString.remove(1); // ou tresStringremove("Teclado");
        System.out.println("Removendo a segunda posição: " + tresString);}

        //Método que imprima a lista de cores do primeiro método

    private static void imprimirFav(List<String> coresFav) {
            System.out.println("Listando as cores: " + coresFav);
        }

        //Método que imprima as cores do primeiro método em ordem alfabética

    public static void imprimirEmOrdemAlfabetica(List<String> coresFav) {
        System.out.println("Lista Original: " + coresFav);
        Collections.sort(coresFav);
        System.out.println("Lista em Ordem Alfabética: " + coresFav);
    }

        //Método que receba uma lista das cores que você mais gosta e o nome de uma cor a ser removida

    private static void removeCor (List<String> coresFav){
        String corRemovida = coresFav.remove(1);
        System.out.println("Removendo a cor " + corRemovida + " da lista: " + coresFav);
     }

        //Método que receba a lista de cores que você gosta e imprima em ordem decrescente(alfabética)

    private static void ordemDec (List<String> coresFav){
        System.out.println("Lista Original: " + coresFav);
        coresFav.sort(Collections.reverseOrder());
        System.out.println("Lista Descrecente: " + coresFav);
    }

    //Método que receba uma lista de números e retorne um mapa com listas de números pares e impares



    private static void separar(){
        System.out.println("------------------");
    };
};