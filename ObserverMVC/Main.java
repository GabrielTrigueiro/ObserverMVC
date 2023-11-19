package ObserverMVC;

public class Main {
    public static void main(String[] args) {
        OnibusModelSource onibusModel = new OnibusModelSource();

        PainelCentral painelCentral = new PainelCentral();
        onibusModel.addObserver(painelCentral);
        
        System.out.println("Estado Inicial dos Assentos:");
        onibusModel.setAssentos(onibusModel.getAssentos());

        System.out.println("\nTentativa de Reserva do Assento 1:");
        try {
            onibusModel.reservarAssento(1);
        } catch (AssentoNaoDisponivelException | AssentoNaoEncontradoException e) {
            e.printStackTrace();
        }

        System.out.println("\nEstado Atualizado dos Assentos:");
        onibusModel.setAssentos(onibusModel.getAssentos());
    }
}
