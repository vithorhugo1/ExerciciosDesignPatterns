
package br.com.designpatterns_decorator_ex;

public class Notifier implements NotifierInterface {

    @Override
    public void write(String data) {
        System.out.println("Status " + data);
    }


    
}
