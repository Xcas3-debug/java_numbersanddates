package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Birthdays {

    public static void main(String[] args) {

        int day = 16;
        int month = 10;
        int year = 1999;

        System.out.println(collectBirthdays(year, month, day));

    }

    public static String collectBirthdays(int year, int month, int day) {
        LocalDate brithday = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy - EE").localizedBy(Locale.US);
        String massage = "";
        for(int i = 0; ; i++) {
            if (today.isBefore(brithday)) {
                break;
            }
            String text = i + " - ";
            massage = massage + text + formatter.format(brithday) + System.lineSeparator();
            brithday = brithday.plusYears(1);
        }

        return massage;
    }

}
