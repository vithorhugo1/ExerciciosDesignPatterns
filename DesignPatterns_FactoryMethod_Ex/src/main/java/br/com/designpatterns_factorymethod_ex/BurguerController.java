package br.com.designpatterns_factorymethod_ex;

import br.com.designpatterns_factorymethod_ex.Burguer.Angus.AngusController;
import br.com.designpatterns_factorymethod_ex.Burguer.ControllerAngus;
import java.util.HashMap;
import java.util.Map;

public class BurguerController extends ControllerAngus{

public void listProducts(){
    //aqui pega os dados do banco;
    
       String nome = "Hamburguer Angus";
       
        //context é´populado pelos dados do BD;
        
        montarBurguer(nome);
   
    }
    
}
