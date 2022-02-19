import java.util.Scanner;
import java.util.SplittableRandom;
import java.util.regex.Pattern;



public class Main {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    static char operation;
    static String z;
    static String zz;
    static int emty;
    static char[] arr;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        z = scanner.nextLine();
        zz = z.replaceAll("\"", "");

        String[] myArray = zz.split("[+-/*]");


        switch (operAtion()) {
            case '+':
                String g;
                g = myArray[0] + myArray[1];
                System.out.println(ANSI_BLUE + "\"" + g + "\"");
                break;
            case '*':

                String ww = zz.substring(zz.lastIndexOf('*')+1);
                int www = Integer.parseInt(ww);
                if(www > 10){
                    System.out.println(ANSI_RED + "error....");
                }else {
                    String sss = myArray[0].repeat(www);
                    int ssss = sss.length();
                    if(ssss < 40){
                        System.out.println(ANSI_BLUE +"\"" + sss + "\"");
                    }else {
                        System.out.println(ANSI_BLUE +"\"" + sss + "..." + "\"");
                    }

                }
                break;
            case '-':
                String x = zz.substring(zz.lastIndexOf('-')+1);
                String h = zz.replaceAll(x, " ").replace('-', ' ');
                String hhh = h.replaceAll(" ", "");
                System.out.println(ANSI_BLUE +"\"" + hhh + "\"");
                break;
            case '/':
                int hh = makMad();
                String y = zz.substring(zz.lastIndexOf('/')+1);
                int i = Integer.parseInt(y);
                int p = (hh-2)/i;
                String ee = zz.substring(0, p);
                String qq = ee.split("/")[0];
                System.out.print(ANSI_BLUE + "\"" + qq + "\"" );
                break;
        }
    }
    public static int operAtion(){
        arr = new char[20];
        for(int i = 0; i <zz.length(); i++) {
            arr[i] = zz.charAt(i);
            if (arr[i] == '+'){
                operation = '+';
            }
            if (arr[i] == '-'){
                operation = '-';
            }
            if (arr[i] == '/'){
                operation = '/';
            }
            if (arr[i] == '*'){
                operation = '*';
            }

        }
        return operation;
    }

    public static int makMad(){
        if (arr[0] != 0) {
            emty = 1;
        }
        if (arr[1] != 0) {
            emty = 2;
        }
        if (arr[2] != 0) {
            emty = 3;
        }
        if (arr[3] != 0) {
            emty = 4;
        }
        if (arr[4] != 0) {
            emty = 5;
        }
        if (arr[5] != 0) {
            emty = 6;
        }
        if (arr[6] != 0) {
            emty = 7;
        }
        if (arr[7] != 0) {
            emty = 8;
        }
        if (arr[8] != 0) {
            emty = 9;
        }
        if (arr[9] != 0) {
            emty = 10;
        }
        if (arr[10] != 0) {
            emty = 11;
        }
        return emty;
    }


}
