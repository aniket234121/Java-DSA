package dsa.LinkedLIst;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;
    public LinkedList() {
        this.size=0;
    }
    public static class Node{
        private int value;
        Node next;
        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next)
        {
            this.value=value;
            this.next=next;
        }
        public int getValue()
        {
            return this.value;
        }
    }
    public Node getHead(){
        Node temp=head;
        return temp;
    }
    public void setHead(Node temp){
        this.head=temp;
    }
    public void insertFirst(int data) {
        Node node=new Node(data);
        node.next=head;
        head=node;
        if(tail==null)
        {tail=head;}

        size+=1;
    }
    public void insertAt(int data,int index) {
        if(index==0)
        {insertFirst(data);}
        else if(index==size)
        {
            insertLast(data);
        }
        Node temp=head;

        for(int i=1;i<index;i++)
        {
            temp=temp.next;
        }
        Node node=new Node(data,temp.next);
        temp.next=node;
        size+=1;
    }
    public void insertLast(int data) {
        if(tail==null)
        {
            insertFirst(data);
            return;
        }
        Node node=new Node(data);
        tail.next=node;
        tail=node;
        size+=1;
    }
    public int deleteFirst() {
        int data=head.value;
        head=head.next;
        if(head==null)
        {
            tail=null;
        }
        size-=1;
        return data;
    }
    public int deleteAt(int index){
        Node temp=head;
        if(index==0)
        {
            return deleteFirst();
        }
        if(index==size-1)
        {
            return deleteLast();
        }
        if(index>size-1)
        {
            return -1;
        }
        for(int i=1;i<index;i++)
        {
            temp=temp.next;
        }
        Node Todel=temp.next;
        int value= Todel.value;
        temp.next=Todel.next;
//        Todel.next=null;
        size-=1;
        return value;
    }
    public int deleteLast(){
        Node temp=head;
        int data=tail.value;
        if(size<=1)
        {
            return deleteFirst();
        }
        while(temp.next!=tail)
        {
            temp=temp.next;
        }
        tail=temp;
        tail.next=null;
        size-=1;
        return data;
    }
    public void display(){
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }


}
