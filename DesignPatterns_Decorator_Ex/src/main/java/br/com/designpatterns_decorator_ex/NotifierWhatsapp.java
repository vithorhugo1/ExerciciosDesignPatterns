package br.com.designpatterns_decorator_ex;

public class NotifierWhatsapp implements NotifierInterface {

    private NotifierInterface notifierInterface;

    public NotifierWhatsapp(NotifierInterface notifierInterface) {
        this.notifierInterface = notifierInterface;
    }

    @Override
    public void write(String data) {

        String attStatus = attMsg(data);
        notifierInterface.write(attStatus);

    }

    private String attMsg(String data) {
        return "Whatsapp: " + data + "\n";
    }

}
