public class Test {

    public static void main(String[] args) {
        //
        System.out.println("      **** Тест MyArrayList *****");
        MyArrayList myArrayList = new MyArrayList();
       myArrayList.add(1);
       myArrayList.add(2.03);
        myArrayList.add("aaaa");
       myArrayList.add("3222");
        myArrayList.add("ddddd");
        System.out.println(myArrayList);
       System.out.println("myArrayList.size() = " + myArrayList.size());
        System.out.println("myArrayList.get(1) = " +myArrayList.get(1));
        System.out.println("myArrayList.remove(3) =" + myArrayList.remove(3));
        System.out.println(myArrayList);
        System.out.println("myArrayList.size() = " + myArrayList.size());
        myArrayList.clear();
        System.out.println("myArrayList.size() = " + myArrayList.size());
        //
        System.out.println("      ****** Тест MyLinkedList ******");
        MyLinkedList myLinkedList = new MyLinkedList<>();
        myLinkedList.add("22");
        myLinkedList.add(456.0);
        myLinkedList.add("asdf");
        myLinkedList.add(456.0);
        myLinkedList.add(8);
        System.out.println("myLinkedList.size() =" + myLinkedList.size());
        for (int i = 0; i < myLinkedList.size(); i++) {
            System.out.print(myLinkedList.get(i));
            System.out.print("  ");
                    }
        System.out.println("  ");
        System.out.println ("myLinkedList.remove(2) = " + myLinkedList.remove(2));
        for (int i = 0; i < myLinkedList.size(); i++) {
            System.out.print(myLinkedList.get(i));
            System.out.print("  ");
        }
        System.out.println("  ");
      myLinkedList.clear();
        System.out.println("myLinkedList.size() = " + myLinkedList.size());
        //
        System.out.println("     ****** Тест MyQueue  *******");
        MyQueue myQueuet = new MyQueue();
        myQueuet.add(111);
        myQueuet.add(2.03);
        myQueuet.add("aaaa");
        myQueuet.add("3");
        myQueuet.add("ddddd");
        System.out.println(myQueuet);
        System.out.println("myQueuet.size() = " + myQueuet.size());
        System.out.println("myQueuet.peec() = " + myQueuet.peec());
        System.out.println("myQueuet.poll() = " + myQueuet.poll());
        System.out.println("myQueuet.poll() = " + myQueuet.poll());
        System.out.println(myQueuet);
        System.out.println("myQueuet.size() = " + myQueuet.size());
        myQueuet.clear();
        System.out.println("myQueuet.size() = " + myQueuet.size());
//
        System.out.println("    ****** Тест myStack  *******");
        MyStack myStack = new MyStack();
        myStack.push(111);
        myStack.push(2.03);
        myStack.push("aaaa");
        myStack.push("3");
        myStack.push("ddddd");
        System.out.println("myStack = " + myStack);
        System.out.println("myStack.size() = " + myStack.size());
        System.out.println("myStack.peek() = " + myStack.peek());
        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println("myStack = " + myStack);
//
        System.out.println("      ****** Тест myHashMap  *******");
        MyHashMap myHashMap = new MyHashMap();
        myHashMap.put(5, "ddd");
        myHashMap.put(3, 45);
        myHashMap.put(42, 345);
        myHashMap.put(8, 45);
        myHashMap.put(44444, "ccccc");
        myHashMap.put(3, 45);
        myHashMap.print();
        System.out.println(myHashMap.get(44444));
        System.out.println("myHashMap.size() = " + myHashMap.size());
        myHashMap.remove(44444);
        myHashMap.print();
        System.out.println("myHashMap.size() = " + myHashMap.size());
        myHashMap.clear();
        System.out.println("myHashMap.size() = " + myHashMap.size());
        System.out.println(myHashMap.head);
    }
}









