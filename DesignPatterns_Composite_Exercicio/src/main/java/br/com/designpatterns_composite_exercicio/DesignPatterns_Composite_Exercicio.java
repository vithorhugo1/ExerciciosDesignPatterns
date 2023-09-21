package br.com.designpatterns_composite_exercicio;

import br.com.designpatterns_composite_exercicio.products.Juice;
import br.com.designpatterns_composite_exercicio.products.Toxies;
import br.com.designpatterns_composite_exercicio.products.WheyProtein;

public class DesignPatterns_Composite_Exercicio {

    public static void main(String[] args) {

        DeliveryService deliveryService = new DeliveryService();
        deliveryService.setupOrder(
                new CompositeBox(
                        new Juice("SUCO", 1200.00),
                        new WheyProtein("Whey de Morango", 100.00)
                ),
                 new CompositeBox(
                        new Toxies("TOXICO 1", 25.55),
                        new Toxies("Creatina", 50.00)
                ),
                 new Juice("Trembolona", 1400.00)
        );
        
        

        System.out.println("TOTAL GASTO: \n" + deliveryService.calculateOrderPrice());

    }
}
