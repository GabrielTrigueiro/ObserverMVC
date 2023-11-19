package ObserverMVC;

public class Assentos {
  private int numero;
  private StatusEnum status;

  public Assentos(int numero, StatusEnum status) {
    this.numero = numero;
    this.status = status;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

}
