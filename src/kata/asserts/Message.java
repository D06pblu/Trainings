package kata.asserts;
/*
надо чтобы Salary и MailMessage происходили из одного источника, чтобы дженерик нормально работал
можно вместо интерфейса запилить абстрактный класс, чтобы можно было и поля добавить, и реализацию
getTo и getContent сразу запилить
 */

public abstract class Message<T>{
    private String from;
    private String to;
    private T content;

    public Message(String from, String to, T content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public T getContent() {
        return content;
    }
}
