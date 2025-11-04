import java.util.Scanner;
public class Reggie {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String ssn = SafeInput.getRegExString(in, "Please enter your ssn: ", "^\\d{3}-\\d{2}-\\d{4}$");
        String ucStudentMNumber = SafeInput.getRegExString(in, "Please enter your UC student M number: ", "^(M|m)\\d{5}$");
        String menuChoice = SafeInput.getRegExString(in, "Please enter one of the following choices. O/o (Open), S/s (Save), V/v (View), or Q/q (Quit): ", "^[OoSsVvQq]$");
    }
}