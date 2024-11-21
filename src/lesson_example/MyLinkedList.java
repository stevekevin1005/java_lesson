package lesson_example;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class MyLinkedList {
    private Node head;

    public MyLinkedList() {
        this.head = null;
    }

    // 添加元素到尾部
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // 刪除指定元素
    public boolean remove(int data) {
        if (head == null) {
            return false;
        }
        if (head.data == data) {
            head = head.next;
            return true;
        }
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
            return true;
        }
        return false;
    }

    // 查找元素
    public boolean contains(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // 顯示鏈結串列中的元素
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        // 添加元素
        System.out.println("Adding elements:");
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.display();  // 預期輸出：1 -> 2 -> 3 -> 4 -> null

        // 查找元素
        System.out.println("Contains 3? " + list.contains(3)); // 預期輸出：true
        System.out.println("Contains 5? " + list.contains(5)); // 預期輸出：false

        // 刪除元素
        System.out.println("Removing element 2:");
        list.remove(2);
        list.display();  // 預期輸出：1 -> 3 -> 4 -> null

        System.out.println("Removing element 5 (not in list):");
        list.remove(5);   // 預期輸出：無變化
        list.display();   // 預期輸出：1 -> 3 -> 4 -> null

        // 再次查找已刪除的元素
        System.out.println("Contains 2? " + list.contains(2)); // 預期輸出：false
    }
}
