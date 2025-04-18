package Java_Core.Postal_System;

public class MailPackage extends AbstractSendable {
    private final Package content;

    public MailPackage(String from, String to, Package content) {
        super(from, to);
        this.content = content;
    }

    public Package getContent() {
        return content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MailPackage)) return false;
        if (!super.equals(o)) return false;

        MailPackage that = (MailPackage) o;

        return content.equals(that.content);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + content.hashCode();
        return result;
    }
}
