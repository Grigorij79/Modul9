public class MyHashMap<K, V> {
    Node<K, V> head;
    int size = 0;

    public MyHashMap() {
        this.head = null;
    }

    public int size() {
        return size;
    }

    class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    void put(K key, V value) {
        Node newNode = new Node(key, value);
        Node currentNode = head;
        if (head == null) {
            head = newNode;
            size++;
        } else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
            size++;
        }
    }

    void remove(K key) {
        Node currentNode = head;
        Node previousNode = null;
        while (currentNode.next != null) {
           if (currentNode.key.equals(key)) {
                if (currentNode == head) {
                    head = currentNode.next;
                    size--;
                } else {
                    previousNode.next = currentNode.next;
                    size--;
                }
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
    }
    public void clear (){
        Node currentNode = head;
        while (currentNode.next != null) {
            Node next = currentNode.next;
            currentNode.value = null;
            currentNode.key = null;
            currentNode.next = null;
            currentNode = next;
        }
        head =  null;
        size = 0;
    }

Node <K , V> node (K key){
Node  x = head;
   a: for (int i = 0; i < size; i++) {
        if (x.key.equals(key)) {
           break a;
        }
        x = x.next;
    }
    return x;
}
    V get (K key) {
         return node(key).value;
    }

        public void print () {
            Node currentNode = head;
            if (head != null) {
                System.out.print(" key =  " + head.key);
                System.out.println(" value = " + head.value);
            }
            while (currentNode.next != null) {
                currentNode = currentNode.next;
                System.out.print(" key =  " + currentNode.key);
                System.out.println(" value = " + currentNode.value);
            }
        }

}
