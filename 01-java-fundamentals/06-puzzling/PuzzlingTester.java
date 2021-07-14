import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;

public class PuzzlingTester {
    public static void main(String[] args){
        Puzzling puzzel = new Puzzling();

        int [] arr1 = {3,5,1,2,7,9,8,13,25,32};
        puzzel.sum(arr1);

        String [] name = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        puzzel.names(name);

        puzzel.alphabet();
        puzzel.random();
        puzzel.randomSort();
        puzzel.randomString();

    }
}