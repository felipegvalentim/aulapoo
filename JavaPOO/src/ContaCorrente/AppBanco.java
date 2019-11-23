package ContaCorrente;

import java.util.Scanner;
import java.util.Random;

public class AppBanco {
    public static void main(String[] args) {
        Conta c1 = new Conta("Felipe",1,1000);
        Conta c2 = new Conta("Rogeiro", 2, 1500);

        c1.extrato();
        c2.extrato();

        c1.transferir(c2,400);
        c2.transferir(c1, 800);

        c1.extrato();
        c2.extrato();


    }

//Implementar uma abstração para controle de uma conta corrente.
//O controle de conta corrente deverá ter comportamentos como depositar, sacar, saldo, transferir e extrato.

}
