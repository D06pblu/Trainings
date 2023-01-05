package kata.post;

import kata.post.precreated.*;
import kata.post.precreated.Package;

public class Thief implements MailService {
    private static int stolenValue = 0;
    private int minPrice;
    public Thief(int minPrice){
        this.minPrice = minPrice;
    }

    public int getStolenValue(){
        return stolenValue;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        if(mail instanceof MailPackage){
            if(((MailPackage)mail).getContent().getPrice() >= minPrice){
                MailPackage stolenPackage = new MailPackage(mail.getFrom(), mail.getTo(),
                        new Package("stones", 0));
                stolenValue += ((MailPackage) mail).getContent().getPrice();
                return stolenPackage;
            }
        }
        return mail;
    }
}
