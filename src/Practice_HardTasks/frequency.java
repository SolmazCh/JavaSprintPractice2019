package Practice_HardTasks;

import java.util.Collections;

public class frequency {

    public static void main(String[] args) {

        String str = "solmazsolmaz solmaz";

        String target ="solmaz";


        int count=0;

        while(str.contains(target)){
            count++;
            str=str.replaceFirst(target,"");
        }

        System.out.println(count);

    }
}