package Java_Core.Postal_System;

public class Package {
    private final String content;
    private final int price;

    public Package(String content, int price) {
        this.content = content;
        this.price = price;
    }

    public String getContent() {
        return content;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Package)) return false;

        Package aPackage = (Package) o;

        if (price != aPackage.price) return false;
        return content.equals(aPackage.content);
    }

    @Override
    public int hashCode() {
        int result = content.hashCode();
        result = 31 * result + price;
        return result;
    }
}
