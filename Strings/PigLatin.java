import java.util.Scanner;

public class PigLatin {
    public static String toString(char[] str)
    {
        String string = new String(str);
        return string;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your word:");
        String word = sc.nextLine();
        char ch[] = new char[word.length()];
        char ch1[] = new char[word.length()];
        char ch2[] = new char[word.length()];
        int j = 0, z = 0,x=0,u=0;
        for(int i=0;i<word.length();i++){
            ch[i] = word.charAt(i);
        }
        for(int i=0;i<word.length();i++) {
            if(ch[i]=='y' && i!=0){
                break;
            }
            if (ch[i] != 'a' && ch[i] != 'e' && ch[i] != 'i' && ch[i] != 'o' && ch[i] != 'u') {
                ch1[j] = ch[i];
                j++;
                ch[i] = ' ';
            }
            if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || (ch[i]=='y' && i!=0)){
                break;
            }
        }
        for(int i=0;i<word.length();i++){
            if(ch[i]!=' '){
                ch2[x]=ch[i];
                x++;
            }

        }
        for(int i=0;i<word.length();i++){
            if(i>=x){
                ch2[i]=ch1[u];
                u++;
            }

        }

        System.out.println("Pig Latin version of entered word:");
        System.out.println(toString(ch2) + "ay");

    }
}