package kata.post;

import kata.post.precreated.MailService;
import kata.post.precreated.RealMailService;
import kata.post.precreated.Sendable;

public class UntrustworthyMailWorker implements MailService {
    MailService [] mailServices;

    public UntrustworthyMailWorker(MailService[] mailServices) {
        this.mailServices = mailServices;
    }

    public RealMailService getRealMailService() {
        return new RealMailService();
    }

    @Override
    public Sendable processMail(Sendable mail) throws Exception {
        Sendable mailInProcess = mail;
        for (int i = 0; i < mailServices.length; i++) {
            mailInProcess = mailServices[i].processMail(mailInProcess);
        }
        return getRealMailService().processMail(mailInProcess);
    }
}