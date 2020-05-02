package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lambda_Expressions {
    public static void main(String[] args) {

        Predicate<Integer> oddNumber = x -> x%2 !=0;
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list.removeIf(oddNumber);


        System.out.println(list);
        System.out.println("======================================");

        Predicate<Integer> lessThan5= z -> z<5;

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list2.removeIf(lessThan5);
        System.out.println(list2);

        System.out.println("======================================");
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Myrtaza", "Muxtar", "Boris","Bilal"));

        Predicate<String> removeM = m -> !m.startsWith("M");

        names.removeIf(removeM);
        System.out.println(names);

        System.out.println("===============================================");

        ArrayList<String> nameList = new ArrayList<>();
        nameList.addAll(Arrays.asList("Muhtar","Asiya","Solmaz","Davud"));

        Predicate<String > nameStarMandA = l -> l.startsWith("M") || l.startsWith("A");

        nameList.removeIf(nameStarMandA);

        System.out.println(nameList);

        System.out.println("===============================================");
                                          // c >=48 && c<=57;
        Predicate<Character> digits = c -> Character.isDigit(c);

        ArrayList<Character> chars = new ArrayList<>(Arrays.asList('A','B','3','4','5','@','Z'));

        chars.removeIf(digits);
        System.out.println(chars);

        System.out.println("=========================================================");

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        nums.removeIf(p-> p>5);
        System.out.println(nums);


        System.out.println("========================================================");


        ArrayList<Character> ch = new ArrayList<>(Arrays.asList('A','B','3','4','5','@','Z','#'));

        ch.removeIf(t-> !Character.isDigit(t) && !Character.isAlphabetic(t));
        System.out.println(ch);

        System.out.println("===========================================================");

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        arr.removeIf(l->l%3==0 || l%5==0);
        System.out.println(arr);



    }
}
