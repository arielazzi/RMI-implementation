import java.rmi.Naming;

public class CalcClientSincrono {
    public static void main(String[] args) {
        try {
            Calc objCalc = (Calc) Naming.lookup("rmi://localhost:5000/calc");
            
            final double valor = 50.1;
            System.out.println("O saldo atual é: " + objCalc.getSaldo());
            System.out.println("Realizando saque de: " + valor);
            System.out.println("esperando finalização...");
            objCalc.saqueSincrono(50.1);
            System.out.println("O saldo final é: " + objCalc.getSaldo());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}