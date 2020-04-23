package RepeatLoopAndArrayTasks;

public class MaxofArray {

    public static void main(String[] args) {

        int[] numbers = {1,2,9,4,-6,6,7,8,};

        int Maxnum = numbers[0];

        int Minnum = numbers[0];

        for(int i=0; i<numbers.length; i++) {

            if (numbers[i] > Maxnum) {

                Maxnum = numbers[i];

            }
            if (numbers[i]< Minnum) {
                Minnum = numbers[i];
            }

        }
            System.out.println(Maxnum);

            System.out.println(Minnum);










    }
}
