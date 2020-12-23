package Master;

//Reversing String without using reverse() method

public class ReverseString {

    public void reversed(String name){
        char[] convert = name.toCharArray();
        for(int i =convert.length-1; i>=0; i--){
            System.out.print(convert[i]);
        }

    }

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        rs.reversed("Jaya");

    }

}
