package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem5.student.Student;

public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue queue = new MyPriorityQueue();
        queue.enqueue(new Student(9, "Chaitanya"));
        queue.display();
        queue.enqueue(new Student(26, "Tushar"));
        queue.display();
        queue.enqueue(new Student(15, "Mayank"));
        queue.display();
        queue.enqueue(new Student(22, "Shivam"));
        queue.display();
        queue.enqueue(new Student(16, "Paras"));
        queue.display();
        System.out.println(queue.poll().getStudent() + " polled");
        queue.display();
        System.out.println(queue.poll().getStudent() + " polled");
        queue.display();
        System.out.println(queue.poll().getStudent() + " polled");
        queue.display();
        System.out.println(queue.poll().getStudent() + " polled");
        queue.display();
        System.out.println("Que Size: " + queue.getSize());

    }
}