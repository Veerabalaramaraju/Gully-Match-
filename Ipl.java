import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

class Ipl {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<>();
        a.add("CSK");
        a.add("MI");
        a.add("RCB");
        a.add("RR");
        a.add("SRH");
        ArrayList<String> b = new ArrayList<>();
        HashSet<String> c = new HashSet<>();
        b = a;
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                c.add(a.get(i) + " v " + b.get(j));
            }
        }
        System.out.println(c);
    }
}