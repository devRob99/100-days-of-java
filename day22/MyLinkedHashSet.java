package day22;

public class MyLinkedHashSet<T>
{
    T value;
    Node next;
    Node prev;

    Node(T value)
    {
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}
