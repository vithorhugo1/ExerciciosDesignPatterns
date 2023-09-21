package br.com.designpatterns_observer_ex;

import java.util.Arrays;

public class DesignPatterns_Observer_Ex {

   public static void main(String[] args) {
        Stock acao1 = new Stock("Coca-Cola", 150f);
        Stock acao2 = new Stock("Sukita", 400f);

        StatusBar statusBar = new StatusBar(Arrays.asList(acao1, acao2));
        StockListView stockListView = new StockListView(Arrays.asList(acao1, acao2));

        //SetPrice p/ atualizar o preço
        acao1.setPreco(200f);
        acao2.setPreco(400f);
    }
   
}
