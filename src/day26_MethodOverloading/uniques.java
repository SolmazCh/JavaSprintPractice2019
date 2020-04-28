package day26_MethodOverloading;

public class uniques {

    /*
    2. use the above method to create another called uniques that accepts a string parameter
             and returns it's unique characters as String
			Ex: uniques("ABBC"); 		==> "AC"
				uniques("Cybertek");  	==> "cybrtk"
     */


        public static void main(String[] args) {
        String str = "ABB";


        String result = "";
        for(int i=0; i<str.length(); i++) {
            int num = frequency(str, str.charAt(i));
            if (num == 1) {
                result += str.charAt(i);
            }
        }

        System.out.println(result);
        }


        public static int frequency(String str, char ch){
            char[] arr =  str.toCharArray();  // [A,A,A]
            int count =0;
            for( char each: arr){
                if(each==ch){
                    count++;
                }
            }
            return count;
        }


        public static String uniques(String str){
            String result = "";
            for(int i=0; i<str.length(); i++) {
                int num = frequency(str, str.charAt(i));
                if (num == 1) {
                    result += str.charAt(i);
                }
            }
            return result;
        }
}
