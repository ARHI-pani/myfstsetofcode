package array;
public class checkArrayShorted {
    public static void main(String [] args){
        int[] arr = {1,8,3,4,5};
        boolean shorted = true ;
        for (int i = 0 ; i < arr.length -1; i++){

            if ( arr[i]>arr[i+1]){
                shorted = false ;
            }
        }System. out.println(shorted);
    }
}
