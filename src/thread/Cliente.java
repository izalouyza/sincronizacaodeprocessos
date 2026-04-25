package thread;

import model.Conta;

public class Cliente extends Thread {

    private Conta conta;

    public Cliente(Conta conta, String nome) {
        super(nome);
        this.conta = conta;
    }

    @Override
    public void run() {
        conta.sacar(500, getName());
    }
}