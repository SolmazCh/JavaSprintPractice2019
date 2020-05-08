package Practice_HardTasks;

public class frequency2 {
    public static void main(String[] args) {

        String str = "AABCCC"; // A2B1C3
        String result="";
        String nonDup="";

        for(int i=0; i<str.length(); i++){
            if(!nonDup.contains(str.charAt(i)+"")){
                nonDup+=str.charAt(i);
            }
        }
        System.out.println(nonDup);

        for(int i=0; i<nonDup.length();i++){
            int count=0;

            for(int k=0; k<str.length(); k++){
                if(nonDup.charAt(i)==str.charAt(k)){
                    count++;
                }
            }
            result+=nonDup.charAt(i)+""+count;
        }

        System.out.println(result);










    }
}