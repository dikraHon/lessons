import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        reversalOfWord();
        stringConversion();
    }

/*Напишите программу, которая принимает строку и переставляет слова в обратном
порядке, используя только методы String и StringBuilder.*/

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

/* Реализуйте программу, которая преобразует строку в последовательность ASCII
кодов и строку кодов в текст, используя циклы и методы String.*/

    public static void stringConversion(){
        System.out.println("Enter text: ");
        String str = new Scanner(System.in).nextLine();
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        int i = 0, j;
        while(i < str.length()) {
            str1.append((int) str.charAt(i));
            j = str.charAt(i);
            str2.append((char) j);
            i++;
        }
        System.out.println("String: " + str +
                "\nconversion ascii: " + str1 +
                "\nconversion string: " + str2);
    }
}