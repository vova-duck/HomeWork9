package HomeWork9Elementary;



public class Test {
    public static void main(String[] args) {

       CustomLinkedList list = new CustomLinkedList();
        String[] strings = {"vjva","sfdd", "efs", "wdwa"};
        String[] strings1 = {"vjv2a","sfdd", "efs", "wdwa"};
       list.addAll(strings);
        list.printList();
        CustomLinkedList list1 = new CustomLinkedList();
        list1.addAll(strings1);
        System.out.println(list.compare(list1));

        //list.add("asd");
        System.out.println(list.size());
        System.out.println(list1.size());
        System.out.println(list.compare(list1));
        System.out.println(list.size());
        list.add("fef");
        list.printList();
        list.delete("fef");
        list.printList();
        System.out.println(list.contains("fef"));


    }
}
