package br.com.designpatterns_strategy_ex;


public class DogeCoin implements FormaPagamento{

    @Override
    public void pagamento(String dsPagamento) {
       
        System.out.println("Forma Pagamento: Você Selecionou DogeCoin(Elon Musk Approves!)");
        
    }


    
}
