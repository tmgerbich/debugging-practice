import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {

//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(1,2,3,4,5);
//        System.out.println(numbers);

        //running this gives: java: no suitable method found for add(int,int,int,int,int)
        //could do each one numbers.add(#) individually but looked up how to do it in one step instead

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(average(numbers));
        //at first this could not be run but hovering the error realized i needed to add static since it is in the static main method

        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(1, 2, 3, null, 5));
//        System.out.println(average(numbers));
        // Line 20: NullPointerException occurs here because the arraylist contains a null value
        numbers2.set(3, 4);
        System.out.println(numbers2);
        System.out.println(average(numbers2));
        //Fixed it by putting an integer in at that index

//        System.out.println(numbers.get(5));
        //Line 25: IndexOutOfBounds Exception occurs here because there is no value in the arraylist at index 5
        //fixed it by putting a value there

        numbers2.add(6);
        System.out.println(numbers2.get(5));
        System.out.println(wrongaverage(numbers));
        //this has a logic error because the loop adding up the total of the numbers stops before the last number in the index
        //set a breakpoint at line 51 and stepped through the loop, noticed it exits the loop when sum is 10, which is less than the total sum
        //replaced the loop with a correct loop that goes through all the elements in the array
        System.out.println(wrongaverage(numbers));

    }

    public static double average (ArrayList<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        double avg = (double) sum / numbers.size();
        return avg;
    }

    public static double wrongaverage (ArrayList<Integer> numbers) {
        int sum = 0;
//        for (int i = 0; i < numbers.size()-1; i++) {
//            sum += numbers.get(i);
//        }
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        double avg = (double) sum / numbers.size();
        return avg;
    }





}
