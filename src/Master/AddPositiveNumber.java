package Master;

/* This will add positive numbers one by like:
    List of number: 1, 1, -8, 2, -9, 1
    Solving method: 1, 1+1=2, 2+2 = 4, 4+1 = 5
    Output= 1,2,4,5.
 */

public class AddPositiveNumber {

    public void add(int [] a){

        int result = 0;

        for(int i=0; i<a.length; i++){
            if(a[i]>0){
                result = result + a[i];
                System.out.println(result);
            }
        }
    }

    public static void main(String[] args) {
        int[] list = new int[] {3,2,-4,7,-9,1};
        AddPositiveNumber num = new AddPositiveNumber();
        num.add(list);
    }
}
