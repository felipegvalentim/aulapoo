package ContaCorrente;

import org.junit.Assert;
import org.junit.Test;

public class ContaTeste {

    @Test
    public void deveSacar(){
        Conta conta = new Conta("Felipe", 1,100);
        Assert.assertEquals(95,conta.sacar(5));
    }
}
