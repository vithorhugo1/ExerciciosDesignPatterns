
package br.com.designpatterns_strategy_ex;

public class FormaPagamentoAleatoria implements FormaPagamento{

    @Override
    public void pagamento(String dsPagamento) {
        
        System.out.println("Forma de Pagamento: 2 Frango Caipira, 1 Leitão, 1 pote de Chimia e 1 Chimarrão bem Bagual");
        
    }
    
}
