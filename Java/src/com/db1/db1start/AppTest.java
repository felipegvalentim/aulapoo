package com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {
    Application application = new Application();

    //Exercícios de Inteiro (Integer)

    // 1 - Método que some dois números
    @Test
    public void testeSomar(){
        Integer expected = 8;
        Integer response = application.somar(3,5);
        Assert.assertEquals(expected,response);
    }

    // 2 - Método que subtraia dois números
    @Test
    public void testeSubtrair(){
        Integer expected = 2;
        Integer response = application.subtrair(5,3);
        Assert.assertEquals(expected,response);
    }

    // 3 - Método que multiplique dois números
    @Test
    public void testeMultiplicar(){
        Integer expected = 4;
        Integer response = application.multiplicar(2,2);
        Assert.assertEquals(expected,response);
    }

    // 4 - Método que divida dois números
    @Test
    public void testeDividir(){
        Integer expected = 2;
        Integer response = application.dividir(4,2);
        Assert.assertEquals(expected,response);
    }

    // 5 - Método que diga se o número é par
    @Test
    public void testeNumber(){
        Boolean expected = true;
        Boolean response = application.par(10);
        Assert.assertEquals(expected,response);
    }

    // 6 - Método que receba dois números e diga qual é o maior
    @Test
    public void testeMaior(){
        Integer expected = 25;
        Integer response = application.maior(25,20);
        Assert.assertEquals(expected,response);
    }

    // 7 - Método que a partir de um valor inicial, mostre a quantidade de n ímpares até ele.
    @Test
    public void testeImpares(){
        Integer expected = 5;
        Integer response = application.impares(10);
        Assert.assertEquals(expected,response);
    }

    //Exercícios de Texto (String)

    // 1 - Método que receba um texto e devolva ele em LETRAS MAIUSCULAS
    @Test
    public void testeMaiuscula(){
        String expected = "FELIPE";
        String response = application.maiuscula("felipe");
        Assert.assertEquals(expected,response);
    }

    // 2 - Método que receba um texto e devolva ele em LETRAS MINUSCULAS
    @Test
    public void testeMinuscula(){
        String expected = "felipe";
        String response = application.minuscula("FELIPE");
        Assert.assertEquals(expected,response);
    }

    // 3 - Método que receba DB1START e retorne a quantidade de letras que existe nesta palavra
    @Test
    public void testeQtdd(){
        int quantidade = application.qtddLetras();
        Assert.assertEquals(7, quantidade);
    }

    // 4 - Método que receba DB1START (tendo um espaço no inicio e no fim da palavra) e retorne a quantidade de letras que existe
    @Test
    public void testeContLetrasEspaco(){
        Integer expected = 8;
        Integer response = application.contLetrasEspaco(" DB1START ");
        Assert.assertEquals(expected,response);
    }
    // 5 - Método que retorne o item 4 com a mesma quantidade de letras do item 3.
    @Test
    public void testeContComEspacos(){
        Integer expected = 7;
        Integer response = application.AnularEspacoNum(" DB1START ");
        Assert.assertEquals(expected,response);
    }

    // 6 - Método que receba o seu nome completo e exiba somente as 4 primeiras letras do seu nome
    @Test
    public void testeQuatroLetras(){
        String expected = "Feli";
        String response = application.nomeQuatroLetras("Felipe");
        Assert.assertEquals(expected,response);
    }

    // 7 - Método que receba o seu nome completo e exiba a partir da terceira letra do seu nome
    @Test
    public void testeTerceiraLetra(){
        String expected = "ipe";
        String response = application.nomeTerceiraLetra("Felipe");
        Assert.assertEquals(expected,response);
    }

    // 8 - Método que receba o seu nome completo e exiba somente as 4 ultimas letras do seu nome
    @Test
    public void testeQuartaLetra(){
        String expected = "lipe";
        String response = application.nomeQuartaLetra("Felipe");
        Assert.assertEquals(expected,response);
    }

    // 9 - Método que receba o seu nome completo e substitua o seu primeiro nome por ALUNO/ALUNA
    @Test
    public void testeAlterarNome(){
        String expected = "Aluno Valentim";
        String response = application.nomeAlterar("Felipe Valentim");
        Assert.assertEquals(expected,response);
    }

    // 10 - Método que receba o seguinte texto "banana, maçã, melancia" e exiba o texto separadamente.
    @Test
    public void testeSepararTexto(){
        String[] esperado = new String[]{"banana","maca","melancia"};
        String[] resultado = application.separarTexto("banana, maca, melancia");
        Assert.assertArrayEquals(esperado, resultado);
    }

    // 11 - Método que receba um texto e exiba quantas vogais tem no texto
    @Test
    public void testeQtddVogaisTexto(){
        Integer expected = 4;
        Integer response = application.qtddVogais("Rogerio");
        Assert.assertEquals(expected,response);
    }

    // 12 - Método que receba um texto e devolva ele invertido
    @Test
    public void testedeveMostrarTextoInvertido(){
        String expected = "epilef";
        String response = application.inverterTexto("felipe");
        Assert.assertEquals(expected, response);
    }

    // Exercícios de Matemática (Double)

    // 1 - Método que exiba qual é o menor valor entre dois doubles
    @Test
    public void testeMaiorDoisDouble(){
        Double expected = 77.2;
        Double response = application.maiorDoisDouble(77.2,56.1);
        Assert.assertEquals(expected, response);
    }

    // 2 - Método que exiba qual é o menor valor entre três doubles
    @Test
    public void testeMenorTresDoubles(){
        Double expected = 2.4;
        Double response = application.menorTresDoubles(2.4, 5.6, 9.4);
        Assert.assertEquals(expected, response);
    }

    // 3 - Método que exiba a média de três números
    @Test
    public void testeMediaTresNumeros(){
        Double expected = 30.0;
        Double response = application.mediaTresNumeros(30.0,30.0,30.0);
        Assert.assertEquals(expected, response);
    }

    //4 - Método que calcule a área de um triangulo
    @Test
    public void deveMostrarAreaDoTriangulo(){
        Integer expected = 180;
        Integer response = application.areaTriangulo(30, 5);
        Assert.assertEquals(expected, response);
    }
}
