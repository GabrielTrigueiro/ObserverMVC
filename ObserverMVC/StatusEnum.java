package ObserverMVC;

public enum StatusEnum {
  DISPONIVEL(1),
  INDISPONIVEL(2),
  RESERVADO(3);

  private final int codigo;

  StatusEnum(int codigo) {
    this.codigo = codigo;
  }

  public int getCodigo() {
    return codigo;
  }
}
