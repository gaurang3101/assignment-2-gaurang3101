package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;

import java.util.Random;

//executable class
public class MyMain {
    public static void main(String[] args) {
        Random rand = new Random();
        MyCircularQueue queue = new MyCircularQueue();
        queue.enqueue(new Student(11, "Gaurang", 2, rand.nextInt(2) + 1));
        queue.display();
        queue.enqueue(new Student(7, "Aryan", 4, rand.nextInt(2) + 1));
        queue.display();
        queue.enqueue(new Student(9, "Chaitanya", 0, rand.nextInt(2) + 1));
        queue.display();
        queue.enqueue(new Student(4, "Nitin", 1, rand.nextInt(2) + 1));
        queue.display();
        queue.enqueue(new Student(5, "Lucky", 8, rand.nextInt(2) + 1));
        queue.display();
        while (queue.processStudentsList() != false) {
        }
        queue.display();
    }
}