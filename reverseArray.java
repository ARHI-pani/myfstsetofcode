package array;

public class reverseArray {
    public static void main (String[]args){
    
    int[] arr = {1,2,3,4,5};
     int n = arr.length;
    int[] copy = new int[n];
   
    for (int i = 0 ; i < n ; i++){
        copy[n-i-1]=arr[i];
    }
    for (int i = 0 ; i < n ; i++){
        arr[i] = copy[i];
    }
    for (int i = 0 ; i <n ; i++){
        System.out.print(arr[i]+" ");
    }
    }
}
