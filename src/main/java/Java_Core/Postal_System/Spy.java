package Java_Core.Postal_System;

public class Spy implements MailService {
    @Override
    public Sendable processMail(Sendable mail) {
        return mail;
    }
}

