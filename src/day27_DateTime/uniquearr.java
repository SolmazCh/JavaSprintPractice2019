package day27_DateTime;

public class uniquearr {

    public static void main(String[] args) {

        int[] arr ={1,2,2,3,4,4,};

        String[] arr2 =new String[arr.length];

        for(int i=0; i<arr2.length; i++){
            arr2[i]=""+arr[i];
        }


       String result ="";
        for(int k=0; k<arr2.length; k++){
            int count = 0;
            for (int i = 0; i < arr2.length; i++) {

                if (arr2[k].charAt(k) == arr2[i].charAt(i)) {
                    count++;
                    arr2[i].replaceFirst(arr2[k], "");
                }
            }
                if(count==1){
                    result+=""+arr2[k];

            }
        }


        System.out.println(result);



    }
}
