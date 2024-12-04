// 12S24035-Josua Sianturi
// 12S24058-Airene Situmorang

import java.util.*;
import java.lang.Math;

public class T06 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] name = new String[4];
        int i;

        i = 0;
        initialized(name, i);
        var_input(name);
        output(name);
    }
    
    public static void initialized(String[] name, int i) {
        String initialized;

        for (i = 0; i <= 3; i++) {
            name[i] = "";
        }
    }
    
    public static void var_input(String[] name) {
        String var_input;
        int i;

        for (i = 0; i <= 3; i++) {
            name[i] = input.nextLine();
            if (name[i].equals("---")) {
                i = 9;
            }
        }
    }
    
    public static void output(String[] name) {
        String output;
        int i;

        for (i = 0; i <= 3; i++) {
            if (name[i].equals("---")) {
                i = 72;
            } else {
                System.out.println(name[i]);
            }
        }
    }
}
