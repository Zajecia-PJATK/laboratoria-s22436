
import java.util.ArrayList;
import java.util.Scanner;

class Main {

    static int max_rec (ArrayList<Integer> numbers){
        if(numbers.size() > 1){
            ArrayList<Integer> copyOfNumbers = new ArrayList<Integer>();
            // Copying the array so that we don't mutate the original one
            for(Integer number : numbers) copyOfNumbers.add(number);
            int smallerValueIndex = copyOfNumbers.get(0) >= copyOfNumbers.get(1) ? 1 : 0;
            copyOfNumbers.remove(smallerValueIndex);
            return max_rec(copyOfNumbers);
        }

        return numbers.get(0);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        String input = sc.nextLine();
        String[] sTab = input.split(" ");

        for(int i = 0; i < sTab.length; i++){
            numbers.add(Integer.parseInt(sTab[i]));
        }

        System.out.println(max_rec(numbers));
    }
}