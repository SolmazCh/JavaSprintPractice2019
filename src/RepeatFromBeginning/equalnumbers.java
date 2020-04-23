package RepeatFromBeginning;

public class equalnumbers {

    public static void main(String[] args) {

        /* 1.  write a program that can check the equality of the three given numberrs
 			declare 3 numbers n1, n2, n3
  			if n1 and n2 are equal  => n1&n2 are equal
   			if n2 and n3 are equal ==> n2&n3 are equal
   			if n3 and n1 are qual ==>n3&n1 are equal
			if all equal ==> all equal
			if none of them are euqal ==> none of them are equal
*/

        int n1 = 40;
        int n2 =30;
        int n3 = 0;
           String equal = " ";

        if(n1==n2 && n1!=n3){
            equal = "n1 and n2 are equal";
        }else if(n2==n3 && n2!=n1){
            equal = "n2 and n3 are equal";
        }else if(n3==n1 && n3!=n2){
            equal = "n1 and n3 are equal";
        }else if(n1==n2 && n1==n3){
            equal = "All are equal";
        }else{
            equal= "None of them are equal";
        }

        System.out.println(equal);











    }
}
