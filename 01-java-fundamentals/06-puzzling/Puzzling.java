import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;

public class Puzzling {
    
    public static void sum(int[] arr){
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        int sum = 0;
        for (int x = 0; x <= arr.length-1; x++){
            sum += arr[x];
            if (arr[x] > 10){
                newArr.add(arr[x]);
            }
        }
        System.out.println(sum);
        System.out.println(newArr);
    }

    public static void names (String[] arr){
        ArrayList<String> newArr = new ArrayList<String>();
        ArrayList<String> shuffleList = new ArrayList<String>();
        ArrayList<String> smallList = new ArrayList<String>();

        for (int x = 0; x < arr.length; x++){
            newArr.add(arr[x]);
            shuffleList.add(arr[x]);
        }
        System.out.println(newArr);
        Collections.shuffle(shuffleList);
        System.out.println(shuffleList);

        // for (int x = 0; x < arr.length; x++){
        //     if (smallList.get(x).length() < 5){
        //     }       
        //     System.out.println(smallList);
        // }   
    }
    

    public static void alphabet(){
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for(char x = 'a'; x <= 'z'; x++){
            alphabet.add(x);
        }
        System.out.println(alphabet);
        Collections.shuffle(alphabet);
        System.out.println(alphabet);
        System.out.println(alphabet.get(0));
        System.out.println(alphabet.get(25));
    }

    // Generate and return an array with 10 random numbers between 55-100.

    public static void random(){
        Random r = new Random();
        int[] randomNum = new int [10];
        for (int x = 0; x < randomNum.length; x++){
            randomNum[x] = r.nextInt(45) + 55;
        }
        System.out.println(Arrays.toString(randomNum));
    }

    // Generate and return an array with 10 random numbers between 55-100 and have it be sorted (showing the smallest number in the beginning). Display all the numbers in the array. Next, display the minimum value in the array as well as the maximum value.

    public static Object[] randomSort(){
        Random r = new Random();
        int[] randomNum = new int [10];
        ArrayList<Integer> sortList = new ArrayList<Integer>();
        for (int x = 0; x < randomNum.length; x++){
            randomNum[x] = r.nextInt(45) + 55;
            sortList.add(randomNum[x]);
        }
        Collections.sort(sortList);
        System.out.println(sortList);
        

        int max = sortList.get(0);
        for (int x = 0; x < sortList.size(); x++){
            if (max < sortList.get(x)){
                max = sortList.get(x);
            }
        }
        System.out.println("max = " + max);

        int min = sortList.get(0);
        for (int x = 0; x < sortList.size(); x++){
            if (min > sortList.get(x)){
                min = sortList.get(x);
            }
        }
        System.out.println("min = " + min);
        return sortList.toArray();
    }

    // Create a random string that is 5 characters long.

    public static void randomString(){
        ArrayList<Character> alphabet = new ArrayList<Character>();
        String[] randomString = new String [5];
        for (char x = 'a'; x <= 'z'; x++){
            alphabet.add(x);
        }
        System.out.println(Arrays.toString(randomString));
    }


    // Generate an array with 10 random strings that are each 5 characters long

}
