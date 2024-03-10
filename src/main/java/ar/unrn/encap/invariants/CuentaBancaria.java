package ar.unrn.encap.invariants;

public class CuentaBancaria {
    private String titular;
    private float saldo;

    public CuentaBancaria(String titular, float saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    //Invariante: el saldo nunca puede ser negativo
    public void retirar(float saldo) {
        if (this.saldo < saldo) {
            throw new RuntimeException("No tiene saldo suficiente para retirar");
        }
        this.saldo -= saldo;
    }
}
