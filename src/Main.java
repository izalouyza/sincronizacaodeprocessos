import model.Conta;
import model.ContaBancaria;
import thread.Cliente;

public class Main {

    public static void main(String[] args) {

        Conta conta = new ContaBancaria();

        Cliente t1 = new Cliente(conta, "Thread-1");
        Cliente t2 = new Cliente(conta, "Thread-2");
        Cliente t3 = new Cliente(conta, "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}