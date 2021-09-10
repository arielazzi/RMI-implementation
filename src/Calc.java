import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calc extends Remote {
    void saque(double valor) throws RemoteException, InterruptedException;
    void saqueSincrono(double valor) throws RemoteException, InterruptedException;
    double getSaldo() throws RemoteException;
}