public class MainQueueSingly
{
    public static void main(String[] args) {

        MyQueueSingly<String > ms=new MyQueueSingly<String>();
        System.out.println(ms.isEmpty());
        System.out.println("Size is : "+ms.size());
        ms.enQueue("Sai");
        ms.enQueue("Jenny");
        System.out.println(ms.isEmpty());
        ms.enQueue("Rahil");
        ms.enQueue("Chandu");
        ms.enQueue("Deepak");
        System.out.println(ms);
        System.out.println(ms.contains("deepak"));//It is Case Sensitive
        System.out.println("Size is : "+ms.size());
        System.out.println(ms.peek());
        System.out.println(ms.deQueue());
        System.out.println(ms.deQueue());
        System.out.println(ms);
        System.out.println(ms.deQueue());
        System.out.println(ms);
        System.out.println("Size is : "+ms.size());
        System.out.println(ms.peek());
        ms.clear();
        System.out.println(ms);
        System.out.println(ms.size());
    }
}
