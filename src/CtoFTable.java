public class CtoFTable {
    public static void main(String[] args) {
        String f = "fahrenheit";
        String c = "celsius";
        for (int i = 0;i<=18;i++){
            if(i <= f.length()){
                System.out.print(f + " | " + c);
                i += f.length() ;
            }
        }
        System.out.print("\n");
        for (int i =0;i<=23;i++){
            System.out.print("_");
        }
        for (int i = -100; i <=100;i++){
            System.out.print("\n");
            for (int row = 0; row <=20;row++) {
                int cSpace = 5 - (getLength(i)/2);
                int fSpace = 17 - (getLength(i)/2);
                if (row < cSpace) {
                    System.out.print(" ");
                } else if (row == cSpace) {
                    System.out.printf("%d",i);
                    row += getLength(i);
                } else if ( row < 12) {
                    System.out.print(" ");
                } else if (row == 12){
                    System.out.print("|");
                }
                if (row > 11 && row < fSpace){
                    System.out.print(" ");
                } else if (row == fSpace) {
                    int fLength = getLength(CtoF(i));
                    System.out.printf("%.2f",CtoF(i));
                    row += fLength;
                }
            }
        }
    }
    public static double CtoF(double celsius) {
        double fahrenheit = (celsius * 9/5) + 32;
        return  fahrenheit;
    }
    public static int getLength(int number) {
        return String.valueOf(number).length();
    }
    public static int getLength(double number) {
        return String.valueOf(number).length();
    }
}