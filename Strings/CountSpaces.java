
public class CountSpaces {
    public static void main(String args[]){
            String quote = "Rise and shine and get your work done!";
            int n = 0;
            for(int i=0;i<quote.length();i++){
                char ch = quote.charAt(i);
                if(ch==' '){
                    n++;
                }
            }
            System.out.println("The number of spaces in the quote is " + n);
    }
}
