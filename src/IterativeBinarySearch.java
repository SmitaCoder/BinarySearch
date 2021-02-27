public class IterativeBinarySearch {

    public static void main(String args[]){
         int[] intArray = {-22,-15,1,7,20,35,55};
             System.out.println("Key found at position : " + BinarySearch(intArray, 7));
    }

    public static int BinarySearch(int[] input, int key){
        int start =0;
        int end=input.length;
        while(start < end){
            int mid = (start+end)/2;
            if(input[mid]==key){
                return mid;
            }
            else if(input[mid]>key){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
    return -1;
    }
}
