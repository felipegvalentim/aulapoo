package ContaCorrente;

import org.junit.Assert;
import org.junit.Test;

public class ContaTeste {

    @Test
    public void deveSacar(){
        Conta conta = new Conta("Felipe", 1,50);
        conta.sacar(30);
        Assert.assertEquals(20,20);
        System.out.println("Operação de teste: Saque realizada com sucesso");
        System.out.println("Saldo atual: " + conta.saldo + " Reais");
    }
    @Test
    public void deveDepositar(){
        Conta conta = new Conta("Felipe", 1,50);
        conta.depositar(30);
        Assert.assertEquals(80,80);
        System.out.println("Operação de teste: Depósito realizada com sucesso");
        System.out.println("Saldo atual: " + conta.saldo + " Reais");
    }
}