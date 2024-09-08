public class MainSingly
{
    public static void main(String[] args) {

        SinglyLinkedList<Integer> st=new SinglyLinkedList<Integer>();
        System.out.println("Size is : "+st.size());
        System.out.println(st.delete(0));
        st.add(522);
        System.out.println(st.delete(0));
        st.add(6332);
       // System.out.println(st.deleteFirst());
        st.add(85);
        st.add(960);
        st.add(660);
        st.add(709);
        System.out.println(st);
       // st.reverse();
        System.out.println(st);
        System.out.println("==========");
        System.out.println(st.linearSearch(709));
        System.out.println(st.binarySearch(6332));
    }
}
