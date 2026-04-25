package model;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ContaBancaria implements Conta {

    private int saldo = 1000;

    private Lock lock = new ReentrantLock();

    @Override
    public void sacar(int valor, String nomeThread) {
        lock.lock();

        try {
            if (saldo >= valor) {
                System.out.println(nomeThread + " vai sacar " + valor);

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                saldo -= valor;
                System.out.println(nomeThread + " sacou. Saldo restante: " + saldo);
            } else {
                System.out.println(nomeThread + " tentou sacar, mas saldo insuficiente.");
            }
        } finally {
            lock.unlock();
        }
    }
}