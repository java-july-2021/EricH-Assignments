import java.util.Arrays;
import java.util.ArrayList;

public class BasicsTester {
    public static void main(String[] args){
        Basics basic = new Basics();

    basic.count();
    basic.countOdd();
    basic.sum();
    
    int [] arr1 = {1,3,5,7,9,13};
    basic.iterate(arr1);

    int [] arr2 = {-3, -5, -7};
    basic.max(arr2);

    int [] arr3 = {2,10,3};
    basic.average(arr3);

    basic.oddNumbers();

    int [] arr4 = {1, 3, 5, 7};
    basic.greaterThan(arr4, 3);

    int [] arr5 = {1, 5, 10, -2};
    basic.square(arr5);

    int [] arr6 = {1, 5, 10, -2};
    basic.negNumber(arr6);

    int [] arr7 = {1, 5, 10, -2};
    basic.maxMinAvg(arr7);

    int [] arr8 = {1, 5, 10, 7, -2};
    basic.shiftValues(arr8);

    }
}