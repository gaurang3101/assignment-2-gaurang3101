package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem5.student.Student;

public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue queue = new MyPriorityQueue();
        queue.enqueue(new Student(8, "Adam"));
        queue.display();
        queue.enqueue(new Student(3, "Abhi"));
        queue.display();
        queue.enqueue(new Student(1, "Amol"));
        queue.display();
        queue.enqueue(new Student(2, "Max"));
        queue.display();
        queue.enqueue(new Student(5, "Amit"));
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