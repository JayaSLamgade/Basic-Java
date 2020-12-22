package Master;

public class Fibonacci {
    public void sequence(int j){
        int a = 0; int b =  1;
        int result = 0;
        while(result<j){
            System.out.print(a+". ");
            int i = b + a;
            a = b;
            b = i;
            result = result+1;
        }
    }
    public static void main(String[] args) {
        Fibonacci fs = new Fibonacci();
        fs.sequence(10);

    }

}
