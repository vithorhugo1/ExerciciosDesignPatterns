package br.com.designpatterns_strategy_ex;

public class Dinheiro implements FormaPagamento{

    @Override
    public void pagamento(String dsPagamento) {
    
        System.out.println("Forma Pagamento: Selecionou Dinheiro");
    
    }
    
    
    
}
