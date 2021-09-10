public class ContaCorrente {

  private int agencia;
  private int conta;
  private double saldo;

  public ContaCorrente (int agencia, int conta, double saldo) {
    this.agencia = agencia;
    this.conta = conta;
    this.saldo = saldo;
  }

  public double saque(double valor) {
    return saldo -=valor;
  }
}