public class Main {
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    l.addToTail(new Node(8));
    l.addToTail(new Node(5));
    l.addToTail(new Node(12));
    l.addToTail(new Node(9));
    l.addToTail(new Node(3));

    l.insert(6, new Node(99));

    l.print();
  }
}