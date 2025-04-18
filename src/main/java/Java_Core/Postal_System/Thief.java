package Java_Core.Postal_System;

public class Thief implements MailService {
    @Override
    public Sendable processMail(Sendable mail) {
        return mail;
    }
}

