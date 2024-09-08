public class MyQueueSingly<Object>
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
    Node front;

    public void enQueue(Object data)
    {
        Node n=new Node(data);
        if(head==null)
        {
            head=front=n;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=n;
    }

    public Object deQueue()
    {
        if(head==null)
            return (Object) "Queue is Empty!!";
        Object data=front.data;
        head=head.next;
        front.next=null;
        front=head;
        return data;
    }

    public Object peek()
    {
        if(head==null)
            return (Object) "Queue is Empty!!";
        return head.data; //return head.data;
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

    public void clear()
    {
        head=null;
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
            return true; //Case Sensitive
        return contains(data,start.next);
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
