package returningElementByIndexNo;

public class GenericsRunner {
    public static void main(String[] args) {
        MyCustomList<String> list1 = new MyCustomList<>();
        list1.addElement("Element 1");
        list1.addElement("Elememt 2");
        System.out.println(list1.getElement(0));

        MyCustomList<Integer> list2 = new MyCustomList<>();
        list2.addElement(2);
        list2.addElement(5);
        System.out.println(list2.getElement(0));  
        
    }
}
