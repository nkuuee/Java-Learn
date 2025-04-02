package Java_Core.Theme_2;

import java.sql.SQLOutput;

public class Task_10 {

    private String printTextPerRole(String[] roles, String[] textLines) {

        StringBuilder builder = new StringBuilder();

        for (String role : roles) {
            builder.append(role).append(":\n");

            for (int i = 0; i < textLines.length; i++) {
                String[] textRefactoring = textLines[i].split(": ", 2);

                if (role.equals(textRefactoring[0])) {
                    builder.append(i + 1).append(")")
                            .append(' ')
                            .append(textRefactoring[1])
                            .append('\n');
                }

            }
            builder.append('\n');
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        String[] roles = {"Городничий",
                "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};

        String[] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        
        Task_10 tk = new Task_10();
        System.out.println(tk.printTextPerRole(roles, textLines));
    }
}
