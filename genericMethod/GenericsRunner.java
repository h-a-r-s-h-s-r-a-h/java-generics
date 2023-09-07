package genericMethod;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericsRunner {
    
    static <X> X doubleValue(X value){
        return value;
    }

    static <X extends List> void duplicates(X list){
        list.addAll(list);
    }

    public static void main(String[] args) {
        String value1 = doubleValue(new String());
        Integer number1 = doubleValue(Integer.valueOf(1));
        ArrayList list1 = doubleValue(new ArrayList());

        ArrayList<Integer> numbers = new ArrayList<>(List.of(1,2,3));
        duplicates(numbers);
        System.out.println(numbers);

        LinkedList<Integer> number11 = new LinkedList<>(List.of(1,2,3));
        duplicates(number11);
        System.out.println(number11);

    }
}
