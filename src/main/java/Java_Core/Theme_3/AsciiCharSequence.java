package Java_Core.Theme_3;

import java.util.Arrays;

public class AsciiCharSequence implements CharSequence {
    byte[] symbols;

    public AsciiCharSequence(byte[] symbols) {
        this.symbols = symbols;
    }

    @Override
    public int length() {
        return symbols.length;
    }

    @Override
    public char charAt(int index) {
        return (char) symbols[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange(symbols, start, end));
    }

    @Override
    public String toString() {
        return new String(symbols);
    }


    public static void main(String[] args) {
        byte[] symbols = {'H', 'j', 's', 's', 'f'};
        AsciiCharSequence sequence = new AsciiCharSequence(symbols);

        System.out.println(sequence.length());
        System.out.println(sequence.charAt(1));
        System.out.println(sequence.subSequence(0, 3));
        System.out.println(sequence.toString());

        /*
        for (byte b: symbols) {
            System.out.println(b + "");
        }
        Мне просто было интересно, как он выводит цифры
         */
    }
}

