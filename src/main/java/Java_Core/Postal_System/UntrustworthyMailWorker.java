package Java_Core.Postal_System;

public class UntrustworthyMailWorker implements MailService {
    private final MailService[] mailServices;
    private final RealMailService realMailService = new RealMailService();

    public UntrustworthyMailWorker(MailService[] mailServices) {
        this.mailServices = mailServices;
    }

    public RealMailService getRealMailService() {
        return realMailService;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        Sendable currentMail = mail;
        for (MailService service : mailServices) {
            currentMail = service.processMail(currentMail);
        }
        return realMailService.processMail(currentMail);
    }
}
