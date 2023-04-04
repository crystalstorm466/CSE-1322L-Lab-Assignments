package Lab12;

import java.util.ArrayList;

public class BlueRayDisk {

    public String title;
    public String director;
    public int yearOfRelease;
    public double cost;

    public BlueRayDisk() {
        this.title = null;
        this.director = null;
        this.yearOfRelease = 0;
        this.cost = 0;
    }
    public BlueRayDisk(String title, String director, int year, double cost) {
        this.title = title;
        this.director = director;
        this.yearOfRelease = year;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return ("$" + this.cost + " Year of Release " + this.yearOfRelease + ", " + this.director);
    }

}

 class Node {

     public BlueRayDisk data;
     public Node next;

     public Node(BlueRayDisk data) {
         this.data = data;
         this.next = null;
     }
 }
 class BlueRayCollection {
    private Node head;
    private ArrayList<BlueRayDisk> disks;

    public BlueRayCollection() {
        this.head = null;
        disks = new ArrayList<BlueRayDisk>();
    }

    //public void addDisk(String title, String director, int year, double cost) { disks.add(new BlueRayDisk(title, director, year, cost)); }
    public void add(String title, String director, int year, double cost) {
        BlueRayDisk newDisk = new BlueRayDisk(title, director, year, cost);
        Node newNode = new Node(newDisk);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }


    public void showAll() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data.toString());
            current = current.next;
        }
    }

}