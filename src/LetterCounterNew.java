import java.util.*;

public class LetterCounterNew {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a phrase: ");
        String phrase = input.nextLine();

        phrase = phrase.replaceAll("\\s+","");

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < phrase.length(); i++) {
            char letter = phrase.charAt(i);
            Integer counter = map.get(letter);
            if (counter != null) {
                map.put(letter, counter + 1);
            }
            else {
                map.put(letter, 1);
            }
        }
        for (int i = 0; i < phrase.length(); i++) {
            System.out.print(phrase.charAt(i) + "-" + map.get(phrase.charAt(i))+ ", ");
        }
    }

}