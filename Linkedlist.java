public class Linkedlist {

    Node head;

    public void insert(int data){
        Node node=new Node();
        node.data=data;
        node.next=null;

        if(head==null){
            head=node;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;

            /*while(head.next!=null){
                head=head.next;
            }
            head.next=node;*/
        }// if-else end

    }//---> insert() end

    public void display(){
        Node node=head;
        while(node.next!=null){
            System.out.println(node.data);
            node=node.next;
        }
        System.out.println(node.data);

    }//---> display() end

    public static void main(String args[]){
    
        Linkedlist ex=new Linkedlist();

        ex.insert(3);
        ex.insert(7);
        ex.insert(9);

        ex.display();
    }//---> main() end

}//---> class end
