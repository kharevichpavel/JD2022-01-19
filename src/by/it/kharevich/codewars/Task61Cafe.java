package by.it.kharevich.codewars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task61Cafe {
    public static String getOrder(String input) {
        String[] menu = {"Burger","Fries","Chicken","Pizza","Sandwich","Onionrings","Milkshake","Coke"};
        String order = "";
        for (int i = 0; i < menu.length; i++) {
            Pattern pattern = Pattern.compile(menu[i], Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                order += menu[i] + " ";
            }
        }
        return order.trim();
    }

    public static void main(String[] args) {
        System.out.println(getOrder("milkshakepizzachickenfriescokeburgerpizzasandwichmilkshakepizza"));

    }
}
