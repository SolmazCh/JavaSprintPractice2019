package day23_Methods;

import java.util.Arrays;

public class min_num {
    public static void main(String[] args) {
        Minnum();
        minnum();

    }

    public static  void Minnum() {
        double[] numbers = {2, 5, 6.6, 77.8, 23,0.5, 56, 54};

        Arrays.sort(numbers);

        System.out.println(numbers[0]);
    }


    public static void minnum() {
        double[] number = {1, 2, 3, 6, 8, 6, 0, 60, 56, -2,87};

        double minnum =number[0];

        for (double eachnum : number){
            if(eachnum<minnum){
                minnum=eachnum;
            }
        }

        System.out.println(minnum);
    }
}
