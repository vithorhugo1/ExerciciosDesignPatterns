
package br.com.designpatterns_observer_ex;

import java.util.List;

public class StockListView implements Observer {
    private List<Stock> stocks;

    public StockListView(List<Stock> stocks) {
        this.stocks = stocks;

        for (Stock stock : stocks) {
            stock.addObserver(this);
        }
    }

    @Override
    public void update() {
        System.out.println("\n StockListView: ");
        for (Stock stock : stocks) {
            System.out.println(stock.getSymbol() + " - " + stock.getPreco());
        }
    }
}
