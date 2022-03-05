package by.it.burov.jd02_05;

import by.it.burov.jd02_05.resources.contains.Messages;
import by.it.burov.jd02_05.resources.contains.User;

import java.util.Locale;

public class TaskA {


    public static void main(String[] args) {
        ResourceManager resourceManager = ResourceManager.INSTANCE;
        if (args.length == 2) {
            Locale locale = new Locale(args[0], args[1]);
            resourceManager.set(locale);
        }
        System.out.printf("%s\n%s\n%s %s %s\n",
                resourceManager.get(Messages.GREETINGS),
                resourceManager.get(Messages.QUESTION),
                resourceManager.get(User.INFO),
                resourceManager.get(User.FIRSTNAME),
                resourceManager.get(User.LASTNAME));
    }
}
