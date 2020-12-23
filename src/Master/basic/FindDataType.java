package Master.basic;

// in below example it is showing how to print data type in Generic
public class FindDataType<T> {
    T number;
    public void show(){
        System.out.println(number.getClass().getName());

    }
    public static void main(String[] args) {
        //By writing <String> we are letting java know that we need only string data type and this is know as generics.
        FindDataType<String> obj = new FindDataType<>();
        //FindDataType obj = new FindDataType(); //in this statement we not specifying any data type so it will take any data type you've mention.
        obj.number="Jaya";
        obj.show();
    }

}
