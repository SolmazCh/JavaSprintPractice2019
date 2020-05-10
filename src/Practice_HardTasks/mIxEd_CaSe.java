package Practice_HardTasks;

public class mIxEd_CaSe {
    public static void main(String[] args) {

        String str = "apple";
        String result="";
        for(int i=0; i<str.length(); i++){
            if(i%2==0){
            result+=str.substring(i,i+1).toUpperCase();
            }else{
              result+=str.substring(i,i+1).toLowerCase();
            }
        }


        System.out.println(result);



    }
}