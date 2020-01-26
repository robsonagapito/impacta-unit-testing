public class Conta {
    private double saldo;

    public Conta(){
        zeraSaldo();
    }

    private void zeraSaldo(){
        saldo = 0;
    }

    public double depositarValor(double valor){
        if (valor > 0 ) {
            setSaldo(getSaldo() + valor);
        }
        return getTotal();
    }

    public double sacarValor(double valor){
        if (valor > 0 ) {
            setSaldo(getSaldo() - valor);
        }
        return getSaldo();
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }

    public double getTotal(){
        return saldo;
    }

}
