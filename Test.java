package SelfStudy;
import java.util.*;

public class Test {

    public void Test() {

    }

    @org.junit.Test
    public void main() {
        List<String> nameList = new LinkedList<String>();
        List<Integer> ageList = new ArrayList<Integer>();
        List myList = new ArrayList();
        nameList.add("Joe");
        nameList.add("Joel");
        ageList.add(34);
        ageList.add(30);
        myList.add("String1");
        myList.add(9);

        myList.add("String2");
        myList.add(6);


        System.out.println("Generic list...");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        System.out.println("\nName \t Age");
        for (int i = 0; i < nameList.size(); i++) {
            System.out.println(nameList.get(i) + "\t" + ageList.get(i));
        }

     /*   System.out.println("Get Name and Age...");
        for (int i = 0; i < ageList.size(); i++) {
            System.out.println(ageList.get(i));
        }
    */

    }
}
