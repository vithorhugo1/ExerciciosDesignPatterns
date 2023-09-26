package br.com.designpatterns_factorymethod_ex.Burguer.Angus;

import java.util.Map;
import br.com.designpatterns_factorymethod_ex.Burguer.ViewBurguer;

public class AngusViewEngine implements ViewBurguer{

    private String[] vetorAngus = {"Carne Angus", "Cheddar", "Molho Especial"}; 
    
    public String montarBurguer(String burguerName) {
        StringBuilder builder = new StringBuilder();
        builder.append("Burguer Vegano: ");
        
        for (String item : vetorAngus) {
            builder.append(item).append(", ");
        }

        if (vetorAngus.length > 0) {
            builder.delete(builder.length() - 2, builder.length());
        }

        return builder.toString();
    }


    
}
