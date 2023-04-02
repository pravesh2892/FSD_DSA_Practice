package practice;

public class minvalue {
    public static void main(String[] args) {
        int[]arr = {16,28,30,40,50,60,80,90};
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);
//        System.out.println(minValue(arr));
//        System.out.println(maxVlue(arr));
//    }
//    public  static  int minValue(int[]arr){
//        int left=0;
//        int right=arr.length-1;
//        while(left<right){
//            int mid = left+(right-left)/2; //40  28 16
//            if(arr[mid]>arr[right]){// 40>90  ;  28>40 16
//                left= mid+1;
//
//            }else{
//                right= mid;   // right=3 righ=1
//
//            }
//        }
//        return arr[left];
//    }
//public  static  int maxVlue(int[]arr){    //{16,28,30,40,50,60,80,90};
//    int left=0;
//    int right=arr.length-1;
//    while(left<right){
//        int mid = left+(right-left)/2;
//        if(arr[mid]<arr[right]){
//            left= mid+1;
//
//        }else{
//            right= mid;
//
//        }
//    }
//    return arr[left];
}
}
