package RepeatFromBeginning;

public class numdaysofmonth {

    public static void main(String[] args) {

        /* 2. write a program that can find the number of days in a month
	 	(Assume that Feb has 28 days)

	 		byte month =  3

			28 days: 2
			30 days: 4,6,9,11
			31 days: 1,3,5,7,8,10,12

*/
        byte month =2;

        if(month==2){
            System.out.println("28 days");
        }else if(month==4 || month==6 || month==9 || month==11){
            System.out.println("30 days");
        }else if(month ==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
            System.out.println("31 days");
        }else{
            System.out.println("Invalid number");
        }












    }
}
