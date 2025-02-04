class Node{
    int data ;
    Node next;
    Node(int data){
        this.data= data;
        next=null;
    }
}
class Singly{
    Node head;
    Singly(){
        head=null;
    }
    void insertr(int d){
        if(head== null)
            head= new Node(d);
        else{
            insertRec(d,head);
        }
    }
    void insertRec(int d, Node t){
        if(t.next== null){
            t.next= new Node(d);
            return;
        }
        insertRec(d,t.next);
    }
    void displayR(){
        if(head==null)
            System.out.println("list is Empty");
        else{
            displayRec(head);
        }
    }
    void displayRec(Node t){
        if(t.next==null){
            System.out.print(t.data);
            return;
        }
        System.out.print(t.data+"->");
        displayRec(t.next);
    }   // 12=>13=>14=>15




    void insert(int d){
        Node temp=  new Node(d);
        if(head==null)
            head= temp;
        else{
            Node t= head;
            while(t.next != null){
                t=t.next;
            }
            t.next= temp;
        }

    }
    void display(){
        if(head== null){
            System.out.print("List is empty");
        }
        else{
            Node t= head;
            while(t != null){
                System.out.print(t.data);
                if (t.next != null) System.out.print("->");

                t=t.next;
            }

        }
    }
}
public class InsertAtEnd
{
    public static void main(String[] args) {
        System.out.println("Hello");
        Singly obj= new Singly();
        obj.insertr(10);
        obj.insertr(11);
        obj.insertr(12);
        obj.insertr(13);
        obj.displayR();
    }
}