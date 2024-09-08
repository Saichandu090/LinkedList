public class MainSingly
{
    public static void main(String[] args) {

        SinglyLinkedList<Integer> st=new SinglyLinkedList<Integer>();
        System.out.println("Size is : "+st.size());
        System.out.println(st.delete(0));
        st.add(52);
        System.out.println(st.delete(0));
        st.add(63);
       // System.out.println(st.deleteFirst());
        st.add(85);
        st.add(96);
        st.add(66); //Works as 'addLast' as well
        System.out.println(st);
        st.reverse();
        System.out.println(st);
        st.display();
        System.out.println("==========");
        st.displayReverse();
        System.out.println(st.linearSearch(700));
        st.add(56);
        st.add(95);
        System.out.println(st);
        st.add(100,7);
        System.out.println(st);
    }
}
