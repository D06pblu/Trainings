package kata.post;

import kata.post.precreated.MailPackage;
import kata.post.precreated.MailService;
import kata.post.precreated.Sendable;

public class Inspector implements MailService {

    @Override
    public Sendable processMail(Sendable mail) throws Exception {
        if (mail instanceof MailPackage){
            if (((MailPackage) mail).getContent().equals("weapons") || ((MailPackage) mail).getContent().equals("banned substance")){
                throw  new IllegalPackageException();
            }
            else if (((MailPackage) mail).equals("stones")) {
                throw new StolenPackageException();
            }
        }
        return mail;
    }

    class IllegalPackageException extends RuntimeException {}
    class StolenPackageException extends RuntimeException {}
}
