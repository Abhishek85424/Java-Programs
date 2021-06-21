package com.collection;
class Node<T>
{
    Node<T> prev;
    T data;
    Node<T> next;
}
class MyList<T>
{
    Node<T> head=null;
    Node<T> last=null;
    public void add(T data)
    {
        Node<T> node = new Node<>();
        node.data = data;
        node.prev = null;
        node.next = null;
        if(head==null)
        {
            head = node;
            last = node;
        }
        else
        {
            last.next = node;
            last = node;
            last.prev = last;
        }
    }
    public void display()
    {
        Node<T> current = head;
        while (current!=null)
        {
            System.out.println(current.data);
            current = current.next;
        }
    }
    public Node<T> findMiddleNode()
    {
        Node<T> current = head;
        Node<T> slow = head;
        Node<T> fast = head;
        if(head == null)
            return null;
        while (slow !=null && fast.next !=null)
        {
            fast = fast.next;
            if (fast.next != null)
            {
                fast = fast.next;
                slow = slow.next;
            }

        }
        return slow;
    }
}
public class MiddleElementOfList {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
//        myList.add(1);
//        myList.add(2);
//        myList.add(3);
//        myList.add(4);
//        myList.add(5);
//        myList.add(6);
//        myList.add(7);
//        myList.add(8);

//        myList.display();
        Node<Integer> middleNode = myList.findMiddleNode();
        if(middleNode !=null)
            System.out.println(middleNode.data);
        else
            System.out.println("List is empty !!");
    }
}
