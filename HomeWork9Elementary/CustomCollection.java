package HomeWork9Elementary;

import java.util.Collection;

public interface CustomCollection {

    boolean add(String value);

    boolean addAll(String[] stringArr);

    boolean addAll(CustomLinkedList linkedList);

    boolean delete (int index);

    boolean delete (String str);

    String get(int index);

    boolean contains(String str);

    boolean clear();

    int size();

    boolean trim();

    boolean compare(CustomLinkedList linkedList);

}
