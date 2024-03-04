import java.util.Random;

public class CountLetters {

    public static void main(String[] args) {
        char[] chars = randomLowerCaseLetters();
        System.out.println("The lowercase letters are: \n");
        displayArray(chars);
        int[] counts = countLetters(chars);

        System.out.println();
        System.out.println("The occurrences of each letter are: ");
        displayCounts(counts);
    }

    public static char[] randomLowerCaseLetters() {
        Random random = new Random();
        char[] chars = new char[100];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (random.nextInt(26) + 'a');
        }
        return chars;
    }

    public static void displayArray(char[] chars){
        for (int i = 0; i < chars.length; i++){
            if((i + 1) % 20 == 0){
                System.out.println(chars[i]);
            }else{
                System.out.print(chars[i] + " ");
            }
        }
    }

    public static int[] countLetters(char[] chars){
        int[] counts = new int[26];
        for (char c : chars) {
            counts[c - 'a']++;
        }
        return counts;
    }

    public static void displayCounts(int[] counts){
        for (int i = 0; i < counts.length; i++) {
             if ((i + 1) % 10 == 0)
                 System.out.println(counts[i] + " " + (char)(i + 'a'));
             else
                System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
             }
         }

}


