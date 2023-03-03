public class DoublyLinkedListTester {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list=new DoublyLinkedList<>();
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        System.out.println(list.middle());
        DoublyLinkedList<Integer> list2=new DoublyLinkedList<>();
        list2.addFirst(5);
        list2.addLast(6);
        list2.addLast(7);
        list.con(list2);
        System.out.println(list.size());
        while (!list.isEmpty())
        {
            System.out.print(list.removeFirst()+" ");

        }
    }

}
