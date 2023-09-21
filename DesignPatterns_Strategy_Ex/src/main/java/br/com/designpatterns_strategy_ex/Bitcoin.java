package br.com.designpatterns_strategy_ex;

public class Bitcoin implements FormaPagamento{

    @Override
    public void pagamento(String dsPagamento) {
        System.out.println("Forma Pagamento: Selecionou Bitcoin");
    }
    
}
