package br.com.designpatterns_factorymethod_ex.Burguer;

import java.util.Map;

public class AngusViewEngine implements ViewBurguer{

    //Inserir Vetor aqui
    
    String[] vetorVegano = {"Carne de Soja", "Alface", "Tofu"};
    
    public String montarBurguer(String burguerName) {
        StringBuilder builder = new StringBuilder();
        builder.append("Burguer Vegano: ");
        
        for (String item : vetorVegano) {
            builder.append(item).append(", ");
        }

        if (vetorVegano.length > 0) {
            builder.delete(builder.length() - 2, builder.length());
        }

        return builder.toString();
    }



    
}
