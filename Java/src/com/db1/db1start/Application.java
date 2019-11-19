package com.db1.db1start;

import java.util.Arrays;

public class Application {

    // Exercícios de Inteiro (Integer)

    // 1 - Método que some dois números
    public Integer somar(Integer n1,Integer n2){
        return n1 + n2;
    }

    // 2 - Método que subtraia dois números
    public Integer subtrair(Integer n1, Integer n2){
        return n1-n2;
    }

    // 3 - Método que multiplique dois números
    public Integer multiplicar(Integer n1, Integer n2){
        return n1 * n2;
    }

    // 4 - Método que divida dois números
    public Integer dividir(Integer n1, Integer n2){
        return n1 / n2;
    }

    // 5 - Método que diga se o número é par
    public Boolean par(Integer valor){
        if(valor % 2 == 0){
            return true;
        }
        return false;
    }

    // 6 - Método que receba dois números e diga qual é o maior
    public Integer maior(Integer valor1, Integer valor2){
        if(valor1 > valor2){
            return valor1;
        }
        return valor2;
    }

    // 7 - Método que a partir de um valor inicial, mostre a quantidade de n ímpares até ele.
    public Integer impares(Integer num){
        Integer valor = 0;
        for (Integer i = 0; i < num; i++){
            if(i % 2 != 0) {
                valor++;
            }
        }
        return valor;
    }

    //Exercícios de Texto (String)

    // 1 - Método que receba um texto e devolva ele em LETRAS MAIUSCULAS
    public String maiuscula(String textoMai){
        return textoMai.toUpperCase();
    }

    // 2 - Método que receba um texto e devolva ele em LETRAS MINUSCULAS
    public String minuscula(String textoMin){
        return textoMin.toLowerCase();
    }

    // 3 - Método que receba DB1START e retorne a quantidade de letras que existe nesta palavra
    public Integer qtddLetras(){
        String palavra = "Db1Start";
        return removeNumero(palavra).length();
    }
    private String removeNumero (String palavra){
        return palavra
                .replaceAll("[0-9]","");
    }

    // 4 - Método que receba DB1START (tendo um espaço no inicio e no fim da palavra) e retorne a quantidade de letras que existe
    public Integer contLetrasEspaco(String texto){
        String textoSemEspaco = texto.replace(" ", "");
        Integer qtddLetras = textoSemEspaco.length();
        return qtddLetras;
    }
    // 5 - Método que retorne o item 4 com a mesma quantidade de letras do item 3.
    public Integer AnularEspacoNum(String text){
        Integer textoSemEspaco;
        return textoSemEspaco = removeNumero(text.replaceAll(" ", "")).length();
    }

    // 6 - Método que receba o seu nome completo e exiba somente as 4 primeiras letras do seu nome
    public String nomeQuatroLetras(String nome){
        return nome.substring(0,4);
    }

    // 7 - Método que receba o seu nome completo e exiba a partir da terceira letra do seu nome
    public String nomeTerceiraLetra(String nome){
        return nome.substring(3,6);
    }

    // 8 - Método que receba o seu nome completo e exiba somente as 4 ultimas letras do seu nome
    public String nomeQuartaLetra(String nome){
        return nome.substring(2,6);
    }

    // 9 - Método que receba o seu nome completo e substitua o seu primeiro nome por ALUNO/ALUNA
    public String nomeAlterar(String nome){
        Integer PrimeiroEspaco = nome.indexOf(" ");
        return "Aluno" + nome.substring(PrimeiroEspaco);
    }

    // 10 - Método que receba o seguinte texto "banana, maçã, melancia" e exiba o texto separadamente.
    public String[] separarTexto(String valor){
        return valor.split(", ");
    }

    // 11 - Método que receba um texto e exiba quantas vogais tem no texto
    public Integer qtddVogais(String texto){
        Integer contarVogais = 0;
        for (int i = 0; i < texto.length(); i++){
            char c = texto.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                contarVogais++;
        }
        return contarVogais;
    }

    // 12 - Método que receba um texto e devolva ele invertido
    public String inverterTexto(String texto){
        String textoInvertido = new StringBuilder(texto).reverse().toString();
        return textoInvertido;
    }

    // Exercícios de Matemática (Double)
    // 1 - Método que exiba qual é o menor valor entre dois doubles
    public Double maiorDoisDouble (Double n1, Double n2){
        if(n1 > n2)
        return n1;
    return n2;
    }
    // 2 - Método que exiba qual é o menor valor entre três doubles
    public Double menorTresDoubles(Double n1, Double n2, Double n3){
        Double menor =  menorValor(n1,n2);
        if (menor > n3){
            return n3;
        }
        return menor;
    }
    private Double menorValor(Double n1, Double n2){
        if(n1 < n2){
            return n1;
        }
        return n2;
    }

    // 3 - Método que exiba a média de três números
    public Double mediaTresNumeros(Double n1, Double n2, Double n3){
       Double resultado = (n1+n2+n3)/3;
       return resultado;
    }

    //4 - Método que calcule a área de um triangulo
    public Integer areaTriangulo(Integer base, Integer alt){
        Integer area = (base*base) / alt;
        return area;
    }
}
