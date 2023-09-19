import java.util.*;
public class guessCharacter {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<String>();
        l.add("A");
        l.add("B");
        l.add("C");
        Scanner in = new Scanner(System.in);
        String ch;
        int count = 0;
        while (!l.isEmpty()) {
            System.out.print("Guess the character: ");
            ch = in.nextLine();
            if (ch.equals(l.get(0))) {
                l.remove(0);
                System.out.println("Correct");
            } else {
                System.out.println("Incorrect");
            }
            count++;
        }
        System.out.println("You guessed all the characters in " + count + " tries");
        in.close();
    }
}
