import java.util.*;

class MyHashMap {

    class Node {
        int key, value;
        Node next;

        Node(int k, int v) {
            key = k;
            value = v;
        }
    }

    int size = 1000;
    Node[] bucket;

    MyHashMap() {
        bucket = new Node[size];
    }

    int hash(int key) {
        return key % size;
    }

    void put(int key, int value) {
        int i = hash(key);
        Node head = bucket[i];

        Node curr = head;
        while (curr != null) {
            if (curr.key == key) {
                curr.value = value;
                return;
            }
            curr = curr.next;
        }

        Node node = new Node(key, value);
        node.next = head;
        bucket[i] = node;
    }

    int get(int key) {
        int i = hash(key);
        Node curr = bucket[i];

        while (curr != null) {
            if (curr.key == key) {
                return curr.value;
            }
            curr = curr.next;
        }

        return -1;
    }

    void remove(int key) {
        int i = hash(key);
        Node curr = bucket[i], prev = null;

        while (curr != null) {
            if (curr.key == key) {
                if (prev == null) {
                    bucket[i] = curr.next;
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }
}

public class CustomHashMap {
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();

        map.put(1, 10);
        map.put(2, 20);
        System.out.println(map.get(1));
        map.remove(1);
        System.out.println(map.get(1));
    }
}