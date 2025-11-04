import java.util.Scanner;

public class BirthDateTime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean leapYear = false;

        int birthYear = SafeInput.getRangedInt(in, "Please enter a year between 1950 and 2015: ", 1950, 2015);

        if ((birthYear % 4 == 0 && birthYear % 100 != 0) || (birthYear % 400 == 0)) {
            leapYear = true;
        }

        int birthMonth = SafeInput.getRangedInt(in, "Please enter a month between 1 and 12: ", 1, 12);

        int birthDay = 0;
        switch (birthMonth) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                birthDay = SafeInput.getRangedInt(in, "Please enter a day between 1 and 31: ", 1, 31);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                birthDay = SafeInput.getRangedInt(in, "Please enter a day between 1 and 30: ", 1, 30);
                break;
            case 2:
                if (leapYear) {
                    birthDay = SafeInput.getRangedInt(in, "Please enter a day between 1 and 29: ", 1, 29);
                } else {
                    birthDay = SafeInput.getRangedInt(in, "Please enter a day between 1 and 28: ", 1, 28);
                }
                break;
        }

        int birthHour = SafeInput.getRangedInt(in, "Please enter an hour between 0 and 23: ", 0, 23);

        int birthMinute = SafeInput.getRangedInt(in, "Please enter a minute between 0 and 59: ", 0, 59);

        System.out.printf("You were born on %02d/%02d/%04d at %02d:%02d%n", birthMonth, birthDay, birthYear, birthHour, birthMinute);
    }
}