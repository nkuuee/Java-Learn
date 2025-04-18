package Java_Core.Postal_System;

/*
Интерфейс, который задает класс, который может каким-либо образом обработать почтовый объект.
*/

public interface MailService {
    default Sendable processMail(Sendable mail) {
        return null;
    }
}
