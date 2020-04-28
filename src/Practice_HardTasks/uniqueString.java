package Practice_HardTasks;

public class uniqueString {

    public static void main(String[] args) {

        String[] words = {"java", "python", "java","cool","comma"};


        for(String each1:words) {
            int count = 0;
            for (String each2 : words) {
                if (each1==each2){
                    count++;
                }
            }
            if(count==1){
                System.out.println(each1);
            }
        }




    }
}