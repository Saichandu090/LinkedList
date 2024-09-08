public class MyStackSingly<Object>
{
    class Node
    {
        Object data;
        Node next;
        Node(Object data)
        {
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    Node tail;

    public void push(Object data)
    {
        Node n=new Node(data);
        if(head==null)
        {
            head=tail=n;
            return;
        }
        tail.next=n;
        tail=n;
    }

    public Object pop()
    {
        if(head==null)
            return (Object) "Stack is Empty!!";
        Node temp=head;
        Node prev=null;
        while(temp.next!=null)
        {
            prev=temp;
            temp=temp.next;
        }
        Object data=tail.data;
        tail=prev;
        prev.next=null;
        return data;
    }

    public Object peek()
    {
        if(head==null)
            return (Object) "Stack is Empty!!";
        return tail.data;
    }

    public boolean isEmpty()
    {
        if(head==null)
            return true;
        return false;
    }

    public int size()
    {
        return size(head);
    }

    public int size(Node start)
    {
        if(start==null)
            return 0;
        return 1+size(start.next);
    }

    public boolean contains(Object data)
    {
        return contains(data,head);
    }

    public boolean contains(Object data,Node start)
    {
        if(start==null)
            return false;
        if(start.data.equals(data))
            return true;
        return contains(data,start.next);
    }

    public void clear()
    {
        head=null;
    }

   @Override
    public String toString()
   {
       String st="[";
       Node temp=head;
       while(temp!=null)
       {
           st=st+temp.data;
           if(temp.next!=null)
               st=st+"->";
           temp=temp.next;
       }
       return st+"]";
   }
}
