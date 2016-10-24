
package a724problem;
import java.util.*;
class A724Problem {

    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        ArrayList<String>days=new ArrayList<String>();
        String f=in.next();
        String s=in.next();
        days.add("monday");
        days.add("tuesday");
        days.add("wednesday");
        days.add("thursday");
        days.add("friday");
        days.add("saturday");
        days.add("sunday");
        int fD=days.indexOf(f);
        int sD=days.indexOf(s);
        if(fD==sD ||(fD+2)%7==sD || (fD+3)%7==sD  )
            System.out.println("YES");
        else  System.out.println("NO");
                
    }
    
}
