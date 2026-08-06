class MyLinkedList {

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    Node sentinel;
    int size;

    public MyLinkedList() {
        sentinel = new Node(-1);   // Dummy node
        size = 0;
    }

    public int get(int index) {

        if (index < 0 || index >= size)
            return -1;

        Node curr = sentinel;

        for (int i = 0; i <= index; i++) {
            curr = curr.next;
        }

        return curr.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {

        if (index < 0 || index > size)
            return;

        Node curr = sentinel;

        // Reach predecessor
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        Node node = new Node(val);

        node.next = curr.next;
        curr.next = node;

        size++;
    }

    public void deleteAtIndex(int index) {

        if (index < 0 || index >= size)
            return;

        Node curr = sentinel;

        // Reach predecessor
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        curr.next = curr.next.next;

        size--;
    }
}
