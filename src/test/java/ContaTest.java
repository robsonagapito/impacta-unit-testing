import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ContaTest {

    private double valorDep;
    private double valorSac;
    private double valorNeg;

    @Before
    public void prepareTests(){
        valorDep = 12;
        valorSac = 10.00;
        valorNeg = -10.00;
    }

    @Test
    public void testDepositarValorComSaldoZero() throws Exception {

        //arrange
        Conta conta =  new Conta();
        double expect = valorDep;
        double actual = 0;

        //act
        conta.depositarValor(expect);
        actual = conta.getSaldo();

        //assert
        Assert.assertEquals(expect, actual, 0);

    }

    @Test
    public void testSacarValorComSaldoMaiorQueZero() throws Exception {

        //arrange
        Conta conta =  new Conta();
        double expect = 2.00;
        double actual;

        //act
        conta.depositarValor(valorDep);
        conta.sacarValor(valorSac);

        actual = conta.getSaldo();

        //assert
        Assert.assertEquals(  expect, actual, 0);

    }

    @Test
    public void testDepositarValorComValorNegativo() throws Exception {

        //arrange
        Conta conta =  new Conta();
        double expect = 12.00;
        double actual;

        //act
        conta.depositarValor(valorDep);
        conta.depositarValor(valorNeg);

        actual = conta.getSaldo();

        //assert
        Assert.assertEquals(  expect, actual, 0);

    }

    @Test
    public void testSacarValorComValorNegativo() throws Exception {

        //arrange
        Conta conta =  new Conta();
        double expect = 12.00;
        double actual;

        //act
        conta.depositarValor(valorDep);
        conta.sacarValor(valorNeg);

        actual = conta.getSaldo();

        //assert
        Assert.assertEquals(expect, actual, 0);

    }

}
