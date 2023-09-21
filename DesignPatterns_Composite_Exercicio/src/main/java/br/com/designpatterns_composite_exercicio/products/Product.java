package br.com.designpatterns_composite_exercicio.products;

import br.com.designpatterns_composite_exercicio.Box;
import lombok.Data;

@Data
public abstract class Product implements Box {
    
    protected final String title;
    protected final double price;
    
}
