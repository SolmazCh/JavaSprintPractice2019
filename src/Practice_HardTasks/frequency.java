package Practice_HardTasks;

public class frequency {

    public static void main(String[] args) {

        String str = "solmazsolmaz solmaz";

        String word="solmaz";


        int count=0;

        while(str.contains(word)){
            count++;
            str=str.replaceFirst(word,"");
        }


        System.out.println(count);







    }
}