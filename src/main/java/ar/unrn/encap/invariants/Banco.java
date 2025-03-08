package ar.unrn.encap.invariants;


public class Banco {

    public void retirarDinero(CuentaBancaria cuenta, float saldo) {
        cuenta.retirar(saldo); // Ok, y deberia ser a unica posibilidad

        //dejar getters y setters me da la posibilidad de cometer estos errores
        //pudiendo no cumplir con la invariante: el saldo nunca puede ser negativo
        var saldoActual = cuenta.getSaldo();
        cuenta.setSaldo(saldoActual - saldo);
    }

    public void transferir(CuentaBancaria cuentaOrigen, CuentaBancaria cuentaDestino, float saldo) {
        //Por otro lado, es probable que empiece a duplicar código en Banco, por ejemplo:
//        var saldoActualOrigen = cuentaOrigen.getSaldo();
//        cuentaOrigen.setSaldo(saldoActualOrigen - saldo);
//
//        var saldoActualDestino = cuentaDestino.getSaldo();
//        cuentaDestino.setSaldo(saldoActualDestino + saldo);
//        vs
//        cuentaOrigen.retirar(saldo);
//        cuentaDestino.depositar(saldo);
    }
}
