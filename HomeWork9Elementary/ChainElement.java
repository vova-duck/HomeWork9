package HomeWork9Elementary;

public class ChainElement {
    String data;
    ChainElement next;
    ChainElement previous;


    public ChainElement(String data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }
    public void printLink (){
        System.out.println("[" + data + "]");
    }
}
