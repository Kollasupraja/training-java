import java.util.ArrayList;
import java.util.Scanner;

public class Pb1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner();
        double phNum;
        String name;
        ArrayList<pb> cnts = new ArrayList<>();
        cnts.add(new pb("supraja",9584958));
        cnts.add(new pb("meghna",9865456));
        cnts.add(new pb("prasu",86755465));
        cnts.add(new pb("srija",678755549));
        cnts.set(2,(new pb("reddy",87665544)));
        cnts.remove(3);
        for(pb pbhk : Pb1){
            System.out.println(pbhk);
        }
        System.out.println("Enter the contact number need to be view");
        Long number = sc.nextLong();
        boolean flag = false;
        for(pb pbhk1 : Pb1){
            if (pbhk1.getPhoneNum().equals(number)){
                cnts.add(new pb(pbhk1.getPhoneBk(), pbhk1.getPhoneNum()));
                flag = true;
            }
        }
        if(flag){
            System.out.println(Pb1);
        }
    }
}