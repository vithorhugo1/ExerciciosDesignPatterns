package br.com.designpatterns_factorymethod_ex.Burguer;

import java.util.Map;

public class ControllerAngus {

public void montarBurguer(String burguerName) {
       ViewBurguer engine = createViewEngine();
        String html = engine.montarBurguer(burguerName);
        System.out.println(html);
    }

    protected ViewBurguer createViewEngine(){
    return new AngusViewEngine();
    }
    
}
