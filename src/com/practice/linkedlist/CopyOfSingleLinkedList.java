package com.practice.linkedlist;

/**
 * @author Prasenjit Kumar Das
 */
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

class CopyOfSingleLinkedList {
    public void copyRandomList(Node head) {
        if (head == null) {
            return;
        }
        // Creating a new weaved list of original and copied nodes.
        Node ptr = head;
        while (ptr != null) {
            Node newNode = new Node(ptr.val);
            newNode.next = ptr.next;
            ptr.next = newNode;
            ptr = newNode.next;
        }
        // Setting the random pointers for the newly added nodes.
        ptr = head;
        while (ptr != null) {
            ptr.next.random = (ptr.random != null) ? ptr.random.next : null;
            ptr = ptr.next.next;
        }
        // Unweaving the original and copied linked lists.
        Node orig = head;
        Node copy = head.next;
        while (copy.next != null) {
            orig.next = orig.next.next;
            copy.next = copy.next.next;
            orig = orig.next;
            copy = copy.next;
        }
        orig.next = null;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.random = head.next.next;
        head.next.random = head;
        head.next.next.random = head.next.next.next.next;
        head.next.next.next.random = head.next.next.next.next;
        head.next.next.next.next.random = head.next;

        CopyOfSingleLinkedList copyOfSingleLinkedList = new CopyOfSingleLinkedList();
        copyOfSingleLinkedList.copyRandomList(head);
        // Use the modified linked list with random pointers
    }
}

