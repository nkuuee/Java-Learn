package Java_Core.Postal_System;


public class RealMailService implements MailService {
    @Override
    public Sendable processMail(Sendable mail) {
        return mail;
    }
}
