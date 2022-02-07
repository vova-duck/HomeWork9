package HomeWork9Elementary;

import HW9Elementary.Link;

import java.util.Collection;

public class CustomLinkedList  implements CustomCollection {
    private ChainElement head;
    private ChainElement tail;
    private int size;

    public CustomLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }


    @Override
    public boolean add(String value) {
        if (size != 0) {
            ChainElement firstElement = new ChainElement(value);
            this.tail.next = firstElement;
            firstElement.previous = this.tail;
            this.tail = firstElement;
        } else {
            tail = new ChainElement(value);
            head = tail;
        }
        size++;
        return true;
    }

    @Override
    public boolean addAll(String[] stringArray) {
        for (int i = 0; i < stringArray.length; i++) {
            add(stringArray[i]);

        }
        return true;
    }

    @Override
    public boolean addAll(CustomLinkedList linkedList) {
        for (int i = 0; i < linkedList.size; i++) {
            add(linkedList.get(i));

        }

        return true;
    }

    @Override
    public boolean delete(int index) {
        if (index == 0) {
            ChainElement link = this.head;
            this.head = link.next;
            this.head.previous = null;
            link.next = null;
            link.data = null;
        } else if (size == index + 1 ) {
            ChainElement link = this.tail;
            this.tail = link.previous;
            this.tail.next = null;
            link.previous = null;
            link.data = null;
        } else {
            ChainElement link = head;
            for (int i = 0; i < index; i++) {
                link = link.next;
            }
            link.previous.next = link.next;
            link.next.previous = link.previous;
        }
        size--;
        return true;
    }

    @Override
    public boolean delete(String value) {
        ChainElement element = head;
        int index = 0;
        while (!element.data.equals(value)){
            index++;
            element = element.next;
        }
        delete(index);

        return true;
    }


    @Override
    public String get(int index) {
        ChainElement current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;
    }

    @Override
    public boolean contains(String value) {
        if (head.equals(value)) {
            return true;
        }
        if (tail.equals(value)){
            return true;
        }

        ChainElement element = head;
        while (element.next != null) {
                element = element.next;
                if (element.data.equals(value)) {
                    return true;
            }
        }
        return false;
    }

    @Override
    public boolean clear() {
        this.head = null;
        this.tail = null;
        size = 0;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean trim() {
        return false;
    }

    @Override
    public boolean compare(CustomLinkedList linkedList) {
        if (size != linkedList.size()){
            return false;
        }
        ChainElement element = head;
        int index = 0;
            while (element.data.equals(linkedList.get(index))) {
                while (element.next != null) {
                element = element.next;
                index++;
            }
            return true;
        }
            return false;
        }

        public void printList(){
        ChainElement current = head;
        while (current!= null){
            current.printLink();
            current = current.next;
        }
            System.out.println(" ");
        }
    }
