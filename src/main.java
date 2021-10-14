public class main {
    public static void main(String[] args) {

        RingBuffer queue = new RingBuffer(3);
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        queue.poll();
        queue.poll();
        queue.poll();




       System.out.println("READ: " + queue.read);
       System.out.println("WRITE: " + queue.write);
       System.out.println("SIZE: " + queue.size);
//        System.out.println(queue.isEmpty());
        System.out.println(queue.peek());

        queue.display();


    }
}
