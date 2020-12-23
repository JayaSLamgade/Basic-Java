package Master;

public class Palindrome extends ReverseString {

    public void check(String word){

        if (word.equals(new StringBuffer(word).reverse().toString())){
           System.out.println("Palindrome");
       }else {
            System.out.println("Not Palindrome");
        }
    }

    public static void main(String[] args) {
        Palindrome pal = new Palindrome();
        pal.check("Jaya");
    }
}
