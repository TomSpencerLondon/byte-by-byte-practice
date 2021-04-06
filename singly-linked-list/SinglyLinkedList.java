// Given a singly linked list, write a function
// to find the nth-to-last element of the list.
// list = 1 -> 2 -> 3 -> 4 -> 5
//
// n = 1, output = 4
// n = 2, output = 3
// n = 3, output = 2
//
// etc.
//
//
public class SinglyLinkedList {
    static class Node {
        private Node next;
        private int value;

        private Node(Node next, int value) {
            this.next = next;
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }
    
    public static Node nthToLast(Node node, int n) {
        Node curr = node;
        Node follower = node;

        for (int i = 0; i < n; i++){
            if (curr == null) {
                return null;
            }
            curr = curr.next;
        }

        while(curr.next != null) {
            curr = curr.next;
            follower = follower.next;
        }

        return follower;
    }

    public static void main(String[] args){
        System.out.println(nthToLast(new Node(new Node(new Node(new Node(new Node(null, 5), 4), 3), 2), 1), 2).getValue());
    }
}
