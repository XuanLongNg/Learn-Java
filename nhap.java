import java.util.*;

class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
        left = null;
        right = null;
    }
    // public Node getNode(){
    // return
    // }
}

class BinarySearchTree {
    Node node;
    int size;

    public BinarySearchTree() {
        node = null;
        size = 0;
    }

    public BinarySearchTree(Node node, int size) {
        this.node = node;
        this.size = size;
    }

    public Node add(Node lct, int value) {
        if (lct == null) {
            return new Node(value);
        } else {
            if (value < lct.value)
                lct.left = add(lct.left, value);
            else if (value > lct.value)
                lct.right = add(lct.right, value);
            else
                return lct;
        }
        return lct;
    }

    void PrintLNR(Node k) {
        if (k == null)
            return;
        PrintLNR(k.left);
        System.out.print(k.value + " ");
        PrintLNR(k.right);
    }

    void PrintLRN(Node k) {
        if (k == null)
            return;
        PrintLNR(k.left);
        PrintLNR(k.right);
        System.out.print(k.value + " ");
    }

    void PrintNLR(Node k) {
        if (k == null)
            return;
        System.out.print(k.value + " ");
        PrintLNR(k.left);
        PrintLNR(k.right);
    }
}
// class Double_Linked_List {
// private Node node;
// private int size;

// public Double_Linked_List() {
// node = null;
// size = 0;
// }

// public void add(int x) {
// Node ans = new Node(x);
// if (node == null) {
// node = ans;
// } else {
// Node tmp = node;
// while (tmp.next != null) {
// tmp = tmp.next;
// }
// tmp.next = ans;
// ans.pre = tmp;
// }
// }

// public void remove(int lct) {
// Node tmp = node;
// for (int i = 0; i < lct - 1; i++) {
// tmp = tmp.next;
// }
// Node tmp1 = tmp.next.next;
// tmp.next = tmp1;
// tmp1.pre = tmp;
// }

// public void Print() {
// while (node != null) {
// System.out.print(node.value + " ");
// node = node.next;
// }
// System.out.println();
// }
// }
// class LinkedList {
// private Node node;
// private int size;

// public LinkedList() {
// node = null;
// size = 0;
// }

// public LinkedList(Node node, int size) {
// this.node = node;
// this.size = size;
// }

// public Node getHead() {
// return node;
// }

// public void add(int x) {
// Node ans = new Node(x);
// if (node == null) {
// node = ans;
// } else {
// Node tmp = node;
// while (tmp.next != null) {
// tmp = tmp.next;
// }
// tmp.next = ans;
// }
// }

// public void pop() {
// Node tmp = node;
// while (tmp.next.next != null)
// tmp = tmp.next;
// tmp.next = null;
// }

// public void Print() {
// while (node != null) {
// System.out.print(node.value + " ");
// node = node.next;
// }
// System.out.println();
// }
// }

public class nhap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // String datatype = input.nextLine();
        int n = Integer.valueOf(input.nextLine());
        BinarySearchTree k = new BinarySearchTree();
        for (int i = 0; i < n; i++) {
            k.node = k.add(k.node, Integer.valueOf(input.nextLine()));
        }
        // k.remove(2);
        k.PrintLNR(k.node);
        System.out.println();
        k.PrintLRN(k.node);
        System.out.println();
        k.PrintNLR(k.node);
        // Node<Integer> node = new Node(n);
        // System.out.println(node);
    }
}