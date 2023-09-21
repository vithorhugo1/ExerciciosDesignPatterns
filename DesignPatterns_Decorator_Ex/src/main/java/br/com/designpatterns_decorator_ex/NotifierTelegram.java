package br.com.designpatterns_decorator_ex;

public class NotifierTelegram implements NotifierInterface {

    private NotifierInterface notifierInterface;

    public NotifierTelegram(NotifierInterface notifierInterface) {
        this.notifierInterface = notifierInterface;
    }
    
    @Override
    public void write(String data) {
        
        String attStatus = attMsg(data);
        notifierInterface.write(attStatus);

    }

    private String attMsg(String data) {
        return "Telegram: " + data + "\n";
    }

    
}
