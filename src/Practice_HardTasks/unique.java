package Practice_HardTasks;

public class unique {

    public static void main(String[] args) {

      String str ="AABCC";

      String result ="";  //B

        for(int i=0; i<str.length(); i++){
            int count=0;

            for(int k=0; k<str.length(); k++){

                if(str.charAt(i)==str.charAt(k)){
                    count++;
                }
            }
            if(count==1){
                result+=str.charAt(i);
            }
        }


        System.out.println(result);











    }
}
