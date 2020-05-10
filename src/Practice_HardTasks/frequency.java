package Practice_HardTasks;

import java.util.Collections;

public class frequency {

    public static void main(String[] args) {

        String str = "solmazsolmaz solmaz";

        String str2 = "solmaz";

        int count=0;

        while(str.contains(str2)){
            count++;
            str=str.replaceFirst(str2,"");
        }

        System.out.println(count);




    }
}