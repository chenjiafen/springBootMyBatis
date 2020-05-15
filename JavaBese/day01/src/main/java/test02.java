public class test02 {
    public static void main(String[] args){
        int[] arr={1,5,7,4,9,10,};
        int max=arr[0];
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]>max){
//                max=arr[i];
//
//            }
//
//        }
        for (int i : arr) {
            if(i>max){
               max=i;
            }
        }
        System.out.println(max);
    }


}
