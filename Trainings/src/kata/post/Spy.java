package kata.post;

import kata.post.precreated.MailMessage;
import kata.post.precreated.MailService;
import kata.post.precreated.Sendable;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Spy implements MailService {
    private Logger logger;

    public Spy(Logger logger){
        this.logger = logger;
    }
    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailMessage) {
            if (mail.getFrom().equals("Austin Powers") || mail.getTo().equals("Austin Powers")) {
                logger.log(Level.WARNING, "Detected target mail correspondence: from {0} to {1} \"{2}\"",
                        new Object [] {mail.getFrom(), mail.getTo(), ((MailMessage)mail).getMessage()});
            }
            logger.log(Level.INFO,"Usual correspondence: from {0} to {1}",
                    new Object [] {mail.getFrom(), mail.getTo()});
        }
        return mail;
    }
}
