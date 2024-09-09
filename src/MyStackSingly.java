public class MyStackSingly<T>
{
    SinglyLinkedList<T> sl=new SinglyLinkedList<T>();

    public void push(T data)
    {
       sl.add(data);
    }

    public T pop()
    {
       return sl.deleteLast();
    }

    public T peek()
    {
        return sl.lastElement();
    }

    public boolean isEmpty()
    {
        return sl.isEmpty();
    }

    public int size()
    {
        return sl.size();
    }

    public boolean contains(T data)
    {
        return sl.contains(data);
    }

    public void clear()
    {
       sl.clear();
    }

   @Override
    public String toString()
   {
      return sl.toString();
   }
}
