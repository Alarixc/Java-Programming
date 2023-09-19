package Run;
import java.util.Scanner;

public class DemoRunners {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you running machine, an election or an athlete?");
        String ans = sc.nextLine();
        if (ans.equals("machine")) {
            Runner m = new Machine();
            m.run();
        }
        if (ans.equals("athlete")) {
            Runner a = new Athlete();
            a.run();
        }

        if (ans.equals("election")) {
            Runner e = new PoliticalCandidate();
            e.run();
        }

    }
}

