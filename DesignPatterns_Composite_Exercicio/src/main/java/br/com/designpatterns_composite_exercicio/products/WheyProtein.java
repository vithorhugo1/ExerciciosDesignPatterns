
package br.com.designpatterns_composite_exercicio.products;

public class WheyProtein extends Product {

    public WheyProtein(String title, double price) {
        super(title, price);
    }

    @Override
    public double calculatePrice() {
        return getPrice();
    }
    
}
