package Master.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        List<Information> info = Arrays.asList(
                new Information("Harry", "Potter", 30),
                new Information("John", "Snow", 28),
                new Information("Ron", "Wesley", 29),
                new Information("Arya", "Stak", 20),
                new Information("James", "Bond", 35)
        );
        Collections.sort(info, new Comparator<Information>() {
            @Override
            public int compare(Information o1, Information o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        printAll(info);
    }

    private static void printAll(List<Information> people){
        for (Information in: people) {
            System.out.println(in);
        }
    }

}
