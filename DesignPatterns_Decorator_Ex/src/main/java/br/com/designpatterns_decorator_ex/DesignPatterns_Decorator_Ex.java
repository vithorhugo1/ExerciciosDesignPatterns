

package br.com.designpatterns_decorator_ex;

public class DesignPatterns_Decorator_Ex {

    public static void main(String[] args) {
       
           StatusEnvio(new NotifierEmail(new Notifier()));
           StatusEnvio(new NotifierTelegram(new Notifier()));
           StatusEnvio(new NotifierWhatsapp(new Notifier()));

    }

    public static void StatusEnvio(NotifierInterface notifierInterface) {
        notifierInterface.write("Saiu para Entrega!!!");
    }
        
    }