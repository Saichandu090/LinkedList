public class SinglyLinkedList<Object>
{
    class Node
    {
        Object data;
        Node next;
        Node(Object data)
        {
            this.data=data;
        }
    }
    Node head;

    public void addFirst(Object data)
    {
        Node n=new Node(data);
        n.next=head;
        head=n;
    }

    public void add(Object data,int index)
    {
        Node n=new Node(data);
        if(index==0)
            addFirst(data);
        Node temp=head;
        while(temp!=null&&index>1)
        {
            temp=temp.next;
            index--;
        }
        if(temp!=null)
        {
            n.next = temp.next;
            temp.next = n;
        }
        else
            System.out.println("Index not in range!!");
    }

    public void addLast(Object data)
    {
        Node n=new Node(data);
        if(head==null)
        {
            addFirst(data);
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=n;
    }

    public void add(Object data)
    {
        Node n=new Node(data);
        if(head==null)
        {
            head=n;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=n;
    }

    public Object deleteFirst()
    {
        if(head==null)
            return (Object) "List is Empty!!";
        Object data=head.data;
        head=head.next;
        return data;
    }

    public Object deleteLast()
    {
        if(head==null)
            return (Object) "List is Empty!!";
        Node temp=head;
        Node prev=null;
        while(temp.next!=null)
        {
            prev=temp;
            temp=temp.next;
        }
        Object data=temp.data;
        if(prev!=null) {
            prev.next = null;
        }
        else {
            head = null;
        }
        return data;
    }

    public Object delete(int index)
    {
        if(index==0)
        {
           return deleteFirst();
        }
        Node temp=head;
        Node prev=null;
        while(temp!=null&&index>0)
        {
            prev=temp;
            if (temp.next!=null)
                 temp=temp.next;
            else
            {
                 return (Object)"Index out of Range";
            }
            index--;
        }
        Object data=temp.data;
        if (prev != null)
            prev.next = temp.next;
        temp.next=null;
        return data;
    }

    public void display()
    {
        display(head);
    }

    public void display(Node start)
    {
        if (start==null)
            return;
        System.out.println(start.data);
        display(start.next);
    }

    public void displayReverse()
    {
        displayReverse(head);
    }

    public void displayReverse(Node start)
    {
        if(start.next!=null)
            displayReverse(start.next);
        System.out.println(start.data);
    }

    public void reverse()
    {
        if(head==null)
        {
            System.out.println("List is Empty!!");
            return;
        }
        Node temp=head;
        Node curr=null;
        Node prev=null;
        while(temp!=null)
        {
            curr=temp.next;
            temp.next=prev;
            prev=temp;
            temp=curr;
        }
        head=prev;
    }

    public boolean binarySearch(Object data)
    {
        return binarySearch(data,head);
    }

    public boolean binarySearch(Object data,Node start)
    {
        if(start==null)
            return false;
        if(start.data.equals(data))
            return true;
        return binarySearch(data,start.next);
    }

    public boolean linearSearch(Object data)
    {
       return linearSearch(data,head);
    }

    public boolean linearSearch(Object data,Node start)
    {
        if(start==null)
            return false;
        if(start.data.equals(data))
            return true;
        return linearSearch(data,start.next);
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

    public int size()
    {
        return size(head);
    }
    public int size(Node temp)
    {
        if(temp==null)
            return 0;
        return 1+size(temp.next);
    }
}
