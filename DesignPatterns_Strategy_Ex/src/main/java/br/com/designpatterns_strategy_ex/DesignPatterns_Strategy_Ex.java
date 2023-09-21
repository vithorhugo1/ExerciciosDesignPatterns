
package br.com.designpatterns_strategy_ex;

public class DesignPatterns_Strategy_Ex {

    public static void main(String[] args) {
        
        PaymentStorage paymentStorage = new PaymentStorage();
        
        paymentStorage.store("Selecionado:", new FormaPagamentoAleatoria());
        paymentStorage.store("Selecionado:", new DogeCoin());
        paymentStorage.store("Selecionado: ", new Dinheiro());
        paymentStorage.store("Selecionado: ", new PayPal());
        paymentStorage.store("Selecionado: ", new Bitcoin());
        
    }
}
