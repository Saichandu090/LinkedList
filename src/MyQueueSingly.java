public class MyQueueSingly<T>
{
    SinglyLinkedList<T> sl=new SinglyLinkedList<T>();

    public void enQueue(T data)
    {
       sl.add(data);
    }

    public T deQueue()
    {
       return sl.deleteFirst();
    }

    public T peek()
    {
       return sl.firstElement();
    }

    public boolean isEmpty()
    {
       return sl.isEmpty();
    }

    public int size()
    {
        return sl.size();
    }

    public void clear()
    {
        sl.clear();
    }

    public boolean contains(T data)
    {
        return sl.contains(data);
    }

    @Override
    public String toString()
    {
       return sl.toString();
    }
}
