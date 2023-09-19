import java.io.*;

public class My_project {
    public static void main(String[] args) {

        String inputFile = "test.txt";
        String outputFile = "output.txt";

        try {

            FileReader fileReader = new FileReader(inputFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter(outputFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                line = line.replaceAll("\\b\\d{1,2}:\\d{2}\\b", "");
                bufferedWriter.write(line);
                //bufferedWriter.newLine();
            }

            bufferedReader.close();
            bufferedWriter.close();
            fileReader.close();
            fileWriter.close();

            System.out.println("Timestamps removed and output written to " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
