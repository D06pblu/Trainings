package kata.asserts;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Message<T>> { // вот именно ради этого сделан интерфейс Message

    Map<String, List<T>> mailBox = new HashMap<>(){
        public List<T> get(Object key) {    // это нужно чтобы в Start в 66 строчке не вываливал NPE
            List<T> messages = super.get(key);
            return messages == null ? Collections.emptyList() : messages;
        }
    }; // ключ - имя почтового ящика, значение - список сообщений для этого почтового ящика

    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }

    /*
    то что пытался сделать на лямбде нахер не надо на ней делать надо просто написать реализацию
    того что будет происходить когда наш консьюмер вызовется в стриме. Потому как там где я не бельмеса
    не понимал что происходит при вызове в стриме объекта класса, на самом деле вызывается вот это метод accept()
     */
    @Override
    public void accept(Message<T> message) {  //можно в одну строчку через computeIfAbsent
        if (mailBox.containsKey(message.getTo())){           //если ключ(адресат) уже есть
            List<T> messages = mailBox.get(message.getTo()); //добываем лист с сообщениями и присваиваем его переменной messages
            messages.add(message.getContent());              //ну а тут просто добавляем в добытый лист новое значение
        } else {
            List<T> messages = new ArrayList<>();
            messages.add(message.getContent());
            mailBox.put(message.getTo(), messages);
        }
    }
}

