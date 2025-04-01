package Java_Core.Theme_2;

import java.sql.SQLOutput;

public class Task_10 {

    private String printTextPerRole(String[] roles, String[] textLines) {

        StringBuilder builder = new StringBuilder();

        for (String role : roles) {
            builder.append(role).append(":\n");

            for (String text : textLines) {
                String textRefactoring = text.split(": ")[0];

                if (role.startsWith(textRefactoring)) {
                    builder.append(text.substring(textRefactoring.length() + 2))
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
