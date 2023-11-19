package ObserverMVC;

import java.util.ArrayList;
import java.util.List;

public class OnibusModelSource {
  private List<Display> displays = new ArrayList<>();
  private List<Assentos> assentos = new ArrayList<>(List.of(
      new Assentos(1, StatusEnum.DISPONIVEL),
      new Assentos(2, StatusEnum.DISPONIVEL),
      new Assentos(3, StatusEnum.DISPONIVEL),
      new Assentos(4, StatusEnum.INDISPONIVEL)));

  public void addObserver(Display obs) {
    this.displays.add(obs);
  }

  public void removeObserver(Display obs) {
    this.displays.remove(obs);
  }

  public void reservarAssento(int numero)
      throws AssentoNaoDisponivelException, AssentoNaoEncontradoException {
    boolean assentoEncontrado = false;

    for (Assentos assento : assentos) {
      if (assento.getNumero() == numero) {
        assentoEncontrado = true;
        if (assento.getStatus() == StatusEnum.DISPONIVEL) {
          assento.setStatus(StatusEnum.RESERVADO);
          return; // Assento reservado com sucesso
        } else {
          throw new AssentoNaoDisponivelException("O assento não está disponível para reserva.");
        }
      }
    }

    if (!assentoEncontrado) {
      throw new AssentoNaoEncontradoException("Assento não encontrado com o número fornecido.");
    }
  }

  public void setDisplays(List<Assentos> listaAtualizada) {
    this.assentos = listaAtualizada;
    for (Display display : this.displays) {
      display.update(this.assentos);
    }
  }
}