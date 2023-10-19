import java.util.Arrays;

public class InsertionSort
{
	public static void main(String[] args) {
	    int arr[] = {23,15,17,29,11,1,30,2};
	    int j = 0;
	    for(int i = 1;i < arr.length ; i++)
	    {
	        int key = arr[i];
	        for(j = i - 1; j>=0 && key<arr[j];j--)
	            arr[j + 1] = arr[j];
	        arr[j+1] = key;
	    }
	    System.out.println(Arrays.toString(arr));
	}
}



/**************************************************
output traced completely for the execution which was done online.

key = 15
Entered and swapping 15 with 23
setting 23 to 15
[15, 23, 17, 29, 11, 1, 30, 2]



key = 17
Entered and swapping 17 with 23
setting 23 to 17
[15, 17, 23, 29, 11, 1, 30, 2]



key = 29
setting 29 to 29
[15, 17, 23, 29, 11, 1, 30, 2]



key = 11
Entered and swapping 11 with 29
Entered and swapping 29 with 23
Entered and swapping 23 with 17
Entered and swapping 17 with 15
setting 15 to 11
[11, 15, 17, 23, 29, 1, 30, 2]



key = 1
Entered and swapping 1 with 29
Entered and swapping 29 with 23
Entered and swapping 23 with 17
Entered and swapping 17 with 15
Entered and swapping 15 with 11
setting 11 to 1
[1, 11, 15, 17, 23, 29, 30, 2]



key = 30
setting 30 to 30
[1, 11, 15, 17, 23, 29, 30, 2]



key = 2
Entered and swapping 2 with 30
Entered and swapping 30 with 29
Entered and swapping 29 with 23
Entered and swapping 23 with 17
Entered and swapping 17 with 15
Entered and swapping 15 with 11
setting 11 to 2
[1, 2, 11, 15, 17, 23, 29, 30]



[1, 2, 11, 15, 17, 23, 29, 30]
*******************************************************/