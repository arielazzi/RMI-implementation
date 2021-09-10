import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalcImpl extends UnicastRemoteObject implements Calc {
    public CalcImpl() throws RemoteException {
        super();
    }

    public int add(int i, int j) {
        return i + j;
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