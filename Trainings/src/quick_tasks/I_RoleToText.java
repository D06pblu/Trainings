package quick_tasks;

public class I_RoleToText {
    static String[] roles = {
            "Городничий",
            "Аммос Федорович",
            "Артемий Филиппович",
            "Лука Лукич",
            "Демис Карибидис",
            "Лука",
            "Генерал"    };
    static String[] textLines = {
            "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
            "Аммос Федорович: Как ревизор?",
            "Артемий Филиппович: Как ревизор?",
            "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
            "Аммос Федорович: Вот те на!",
            "Артемий Филиппович: Вот не было заботы, так подай!",
            "Лука Лукич: Господи боже! еще и с секретным предписаньем!",
            "Лука: сэмпл текс Лука:",
            "Лука Лукич: Лука: Господи боже!  еще и с секретным предписаньем",
            "  "    };

    public static String printTextToRole(String[] roles, String[] textLines){
        StringBuilder result = new StringBuilder("");

        for (String role : roles) {
            int lineCounter = 0;
            boolean isFirstRole = true;
            for (String text : textLines) {
                lineCounter++;
                if (text.contains(role + ":") && isFirstRole) {
                    result.append("\n")
                            .append(role)
                            .append(":\n")
                            .append(lineCounter)
                            .append(") ")
                            .append(new StringBuilder(text).substring(role.length() + 1, text.length()))
                            .append("\n");
                    isFirstRole=false;
                }
                else if (text.contains(role + ":")) {
                    result.append(lineCounter)
                            .append(") ")
                            .append(new StringBuilder(text).substring(role.length()+1, text.length()))
                            .append("\n");
                }
            }
        }
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        System.out.println(printTextToRole(roles, textLines));
    }
}
