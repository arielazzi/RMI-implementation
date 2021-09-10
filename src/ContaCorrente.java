public class ContaCorrente {

  private int agencia;
  private int conta;
  private double saldo;

  public ContaCorrente (int agencia, int conta, double saldo) {
    this.agencia = agencia;
    this.conta = conta;
    this.saldo = saldo;
  }

  public double getSaldo() {
    return this.saldo;
  }

  public double saque(double valor) throws InterruptedException {
    if(this.saldo < valor) {
      throw new RuntimeException("Limite alcançado");
    }
    Thread.sleep(4000);
    return saldo -=valor;
  }
}