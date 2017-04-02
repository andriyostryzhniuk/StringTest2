package hello;

public class MessagePrinter {

    private MessageService service;

    public void setService(MessageService service) {
        this.service = service;
    }

    public String getMessage() {
        return service.getMessage();
    }
}
