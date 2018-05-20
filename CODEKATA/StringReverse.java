import java.util.Scanner;
 
class StringReverse
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        String[] mystr=str.split(" ");
        String reverse= "";
        for(int j=0; j<mystr.length;j++)
        {
        	String w=mystr[j];
        	String reverseWord= "";
        for(int i = w.length() - 1; i >= 0; i--)
        {
            reverseWord = reverseWord + w.charAt(i);
        }
        reverse=reverse+reverseWord+" ";
        }
        System.out.println(reverse);
    }
}
