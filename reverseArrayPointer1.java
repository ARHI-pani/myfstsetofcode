package array;
public class reverseArrayPointer1 {
    public static void main(String [] args){
        int[] arr = {1,3,4,2,6};
        int n = arr.length;
        int l = 0 ,r = n-1 ;
        while(l<r){
            int copy = arr[l];
            arr[l] = arr[r];
            arr[r] = copy;
            l++;
            r--;
        }
         for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
    }
}
}
