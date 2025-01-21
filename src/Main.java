import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        reversalOfWord();
    }
    public static void reversalOfWord(){
        System.out.println("Enter your message: ");
        String str = new Scanner(System.in).nextLine();
        StringBuilder stringReverse = new StringBuilder();
        str += " ";
        int i = 0;
        String stroka = "";
        while (i < str.length() ){
            if (str.charAt(i) == ' '){
                stringReverse.insert(0, stroka + " ");
                stroka = "";
                i++;
                continue;
            }
            stroka = stroka + str.charAt(i);
            i++;
        }
        System.out.println(stringReverse);
    }
}