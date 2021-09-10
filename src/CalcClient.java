import java.rmi.Naming;

public class CalcClient {
    public static void main(String[] args) {
        try {
            Calc objCalc = (Calc) Naming.lookup("rmi://localhost:5000/calc");
            System.out.println("O resultado da soma é : " + objCalc.add(3, 7));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}