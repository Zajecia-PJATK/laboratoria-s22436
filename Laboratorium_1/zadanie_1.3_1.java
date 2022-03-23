
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;

        s = sc.nextLine();

        if(s.length() < 26){
            System.out.println("false");
        }

        s = s.toUpperCase();
        int[] alf = new int[26];

        for(int i = 0; i<26; i++){
            alf[i] = 0;
        }

        for(int i = 0; i < s.length(); i++){
            int alfNumber = ((int) s.charAt(i)) - 65;

            if(!(alfNumber < 0 || alfNumber > 25)){
                alf[alfNumber] = 1;
            }
        }

        boolean isPanagram = true;

        for(int i = 0; i<26; i++){
            if(alf[i] != 1){
                isPanagram = false;
            }
        }

        if(isPanagram){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}