import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import java.lang.*;

public class CalcImpl extends UnicastRemoteObject implements Calc {
    private ContaCorrente conta;

    public CalcImpl() throws RemoteException {
        super();
        this.conta = new ContaCorrente(0, 0, 100);
    }

    public double getSaldo() {
        return this.conta.getSaldo();
    }

    public void saque(double valor) throws InterruptedException {
        this.conta.saque(valor);
    }

    public synchronized void saqueSincrono(double valor) throws InterruptedException {
        this.conta.saque(valor);
    }

    public static void main(String args[]) {
        try {
            CalcImpl objRMI = new CalcImpl();
            Naming.rebind("rmi://localhost:5000/calc", objRMI);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}