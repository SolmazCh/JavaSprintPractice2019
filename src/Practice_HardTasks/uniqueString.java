package Practice_HardTasks;

public class uniqueString {
    /*
    Write a program that can print out the unique values from  String Array
     */
    public static void main(String[] args) {
        String[] words = {"java", "python", "java","cool","comma"};

        for(int i=0; i<words.length;i++){
            int count=0;

            for(int k=0; k<words.length; k++){
                if(words[i]==words[k]){
                    count++;
                }
            }
            if(count==1){
                System.out.println(words[i]);
            }
        }









    }
}