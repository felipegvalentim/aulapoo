package ContaCorrente;

import org.junit.Assert;
import org.junit.Test;

public class ContaTeste {

    @Test
    public void deveSacar(){
        Conta conta = new Conta("Felipe", 1,50);
        Assert.assertEquals(25, conta.sacar(25), 0);
        System.out.println("Operação de teste: Saque realizada com sucesso");
        System.out.println("Saldo atual: " + conta.saldo + " Reais");
    }
    @Test
    public void deveDepositar(){
        Conta conta = new Conta("Felipe", 1,50);
        conta.depositar(30);
        Assert.assertEquals(80, conta.getSaldo(), 0);
        System.out.println("Operação de teste: Depósito realizada com sucesso");
        System.out.println("Saldo atual: " + conta.saldo + " Reais");
    }
    @Test
    public void deveTransferir(){
        Conta conta1 = new Conta("Felipe", 1,50);
        Conta conta2 = new Conta("Rogerio", 2,100);
        conta1.transferir(conta2, 20);
        Assert.assertEquals(30, conta1.getSaldo(), 0);
        System.out.println("Operação de teste: Transferencia realizada com sucesso");
        System.out.println("Saldo atual Conta1: " + conta1.saldo + " Reais");
        System.out.println("Saldo atual Conta2: " + conta2.saldo + " Reais");
    }
}