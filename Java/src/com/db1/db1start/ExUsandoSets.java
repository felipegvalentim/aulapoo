package com.db1.db1start;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class ExUsandoSets {
    public static void main(String[] args) {

        //Crie um set com uma lista de nomes com 5 nomes sendo adicionados mais de uma vez

        Set<String> nomes = new HashSet<>();
        nomes.add("Felipe");
        nomes.add("Rogerio");
        nomes.add("Ronaldo");
        nomes.add("Felipe");
        nomes.add("Carlos");
        System.out.println(nomes);
        System.out.println("----------------------------------");

        //Remova os nomes "Suzete" OU começados com "F" ou terminados em "naldo"

        Optional<String> naldo = nomes.stream()
                .filter(s -> s.equals("naldo"))
                .findFirst();

    }
}
