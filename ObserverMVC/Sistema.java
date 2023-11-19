package ObserverMVC;

public class Sistema {
  public static void main(String[] args) throws AssentoNaoDisponivelException, AssentoNaoEncontradoException {
    OnibusModelSource onibus = new OnibusModelSource();
    ViewListener quiosque = new ViewListener();
    ViewListener painel = new ViewListener();

    onibus.addObserver(quiosque);
    onibus.addObserver(painel);
    onibus.reservarAssento(3);

    quiosque.mostrarAssentos();
  }
}
