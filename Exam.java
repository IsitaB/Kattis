import java.util.*;

public class Exam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        String you = scan.next();
        String fr = scan.next();    

        int same =0;
        for(int i=0; i<fr.length(); i++) {
            if(you.substring(i, i+1).equals(fr.substring(i, i+1)))
                same = same+1;
        }
        if(same>t)
            System.out.println(t+fr.length()-same);
        if(same<t)
            System.out.println(same+(fr.length()-same)-(t-same));
        if(same==t)
            System.out.println(fr.length());
        scan.close();
    }
}
