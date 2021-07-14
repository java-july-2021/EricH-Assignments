import java.util.Arrays;
import java.util.ArrayList;

public class Basics {
    public static void count(){
        for(int x = 0; x <= 255; x++){
            System.out.println(x);
        }
    }

    public static void countOdd(){
        for(int x = 0; x <= 255; x++){
			if (x % 2 == 1)
				System.out.println(x);	
	    }
    }

    public static void sum(){
        int sum = 0;
		for(int x = 0; x <= 255; x++){
			sum = x + sum;
			System.out.println("New Number: " + x + " Sum: " + sum);
	    }
    }
    public static void iterate(int[] x){
        for (int i = 0; i < x.length; i++){
			System.out.println(x[i]);
		}
    }

    public static void max(int[] arr){
        int max = arr[0];
        for (int x = 0; x <= arr.length -1; x++){
            if (arr[x] > max){
                max = arr[x];
            }
        }
        System.out.println(max);
    }

    public static void average(int [] arr){
        int sum = 0;
        int avg = 0;
        for (int x = 0; x < arr.length; x++){
            sum = sum + arr[x];
        }
        avg = sum / arr.length;
        System.out.println(avg);
    }

    public static void oddNumbers(){
        ArrayList<Object> y = new ArrayList<Object>();
        for (int x = 0; x <= 255; x++){
            if (x % 2 == 1){
                y.add(x);
            }
        }
        System.out.println(y);
    }

    public static void greaterThan(int[] arr, int y){
        int greater = 0;
        for (int x = 0; x < arr.length; x++){
            if (arr[x] > y){
                greater ++;
            }
        }
        System.out.println(greater);
    }

    public static void square(int[] y){
        for (int x = 0; x < y.length; x++){
            y[x] = y[x] * y[x];
        }
        System.out.println(Arrays.toString(y));
    }

    public static void negNumber(int[] z){
        for (int x = 0; x < z.length; x ++){
            if (z[x] < 0){
                z[x] = 0;
            }
        }
        System.out.println(Arrays.toString(z));
    }

    public static void maxMinAvg(int[] arr){
        int [] newArr = new int[3];
        int max = 0;
        int min = 0;
        int sum = 0;
        int avg = 0;
        for (int x = 1; x < arr.length; x++){
            if (max < arr[x]){
                max = arr[x];
            }
            newArr[0] = max;
            if (min > arr[x]){
                min = arr[x];
            }
            newArr[1] = min;
            sum = sum + arr[x];
        }
        avg = sum / arr.length;
        newArr[2] = avg;
        System.out.println(Arrays.toString(newArr));
    }

    public static void shiftValues(int[] arr){
        for (int x = 1; x < arr.length; x++){
            arr[x-1] = arr[x];
        }
        arr[arr.length - 1] = 0;
        System.out.println(Arrays.toString(arr));
    }
}
