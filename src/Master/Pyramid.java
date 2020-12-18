package Master;

public class Pyramid {
    public void display(int ij){
        int i, j;
        for (i=0; i<ij; i++){
            for (j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pyramid py = new Pyramid();
        int ij = 5;
        py.display(ij);
    }
}
