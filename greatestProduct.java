import java.util.*;
public class Main
{
    public static void reverse(int[] array)
    {
  
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }
    }
    
    
	public static void main(String[] args) {
	    System.out.println("enter the number of elements: ");
	    Scanner s = new Scanner(System.in);
	    final int size = s.nextInt();
	    //if the number of elements is less than three, then greatest of the product of "three" numbers cant be performed.
	    if(size < 3){
	        System.out.println("number of elements should be greater than or equal to three!");
	    }
		int[] arr =  new int[size];
		
		for(int i = 0; i < size; i++){
		    arr[i] = s.nextInt();
		}
		
		Arrays.sort(arr);
		if(arr[0] < 0 && arr[1] < 0){
		    System.out.println(arr[0] * arr[1] * arr[arr.length - 1]);
		}else{
		    reverse(arr);
		    System.out.println(arr[0] * arr[1] * arr[2]);
		}
	}
}
