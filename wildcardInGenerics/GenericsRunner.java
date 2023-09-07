package wildcardInGenerics;

import java.util.List;

public class GenericsRunner {

    static <X> X doubleValue(X value){
        return value;
    }

    static double sumOfNumberList(List<? extends Number> numbers){
        double sum = 0.0;
        for(Number number:numbers){
            sum+=number.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfNumberList(List.of(1,2,3,4,5)));
        System.out.println(sumOfNumberList(List.of(1.1,2.1,3.1,4.1,5.1)));
        System.out.println(sumOfNumberList(List.of(1l,2l,3l,4l,5l)));
        
    }
}
