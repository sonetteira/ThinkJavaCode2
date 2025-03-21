import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(List.of(1, 2, 3)));
        matrix.add(new ArrayList<>(List.of(4, 5, 6)));
        matrix.add(new ArrayList<>(List.of(7, 8, 9)));

        Node<String> stringNode = new Node<>("Hello");
        stringNode.setNext(new Node<>("World"));
        stringNode.print();

        Node<ArrayList<Integer>> arrayListNode = new Node<>(new ArrayList<>(List.of(1, 2, 3)));
        arrayListNode.print();

        Node<Pet> petNode = new Node<>(new Pet("Cali"));
        petNode.setNext(new Node<>(new Pet("Jewel")));
        petNode.print();

        // all good
        Sortable<Integer> sortable = new Sortable<>(
            new Integer[]{3, 2, 1});
        sortable.sort();
        sortable.print();

        // bound mismatch error
        Sortable<Pet> sortablePets;
        sortablePets = new Sortable<>(new Pet[]{
            new Pet("Cali"), new Pet("Jewel")});
        sortablePets.sort();
    }
}

class Node<T> {
    /* parameterized type T is a 
       placeholder for the actual type
     */
    private T data;
    private Node<T> next;

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getNext() {
        return next;
    }

    public void print() {
        System.out.print(data);
        if(next != null) {
            System.out.print(" -> ");
            next.print();
        } else {
            System.out.println();
        }
    }
}

class Pet {
    public String name;

    public Pet(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Sortable<E extends Comparable> {
    private E[] elements;

    public Sortable(E[] elements) {
        this.elements = elements;
    }

    public void sort() {
        Arrays.sort(elements);
    }

    public void print() {
        for(E element : elements) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}