public class doublyLL 
{
    class Node
    {
        int data;
        Node prev;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }

        Node head=null,tail=null;
        public void addFirst(int data)
        {
            Node newNode=new Node(data);
            if(head==null)
            {
                head=newNode;
                tail=newNode;
                return;
            }
            else 
            {
                newNode.next=head;
                head.prev=newNode;
                head=newNode;
                return;
            }

        }

        public void displayList()
        {
            Node t=head;
            while(t!=null)
            {
                System.out.print(t.data+"->");
                t=t.next;
            }
            System.out.println("");
        }

        public void addLast(int data)
        {
            Node newNode=new Node(data);
            if(head==null)
            {
                head=newNode;
                tail=newNode;
                return;
            }
            else
            {
                tail.next=newNode;
                newNode.prev=tail;
                tail=newNode;
                return;
            }
        }

        public void deleteFirst()
        {
            Node temp;
            if(head==null)
            {
                System.out.println("Sorry...Nothing is in the list");
            }
            else if(head==null)
            {
                head=null;
                tail=null;
                return;
            }
            else 
            {
                temp=head;
                head=temp.next;
                head.prev=null;
                temp.next=null;
                return;
            }
        }

        public void deleteLast()
        {
            Node temp;
            if(head==null)
            {
                System.out.println("Sorry...Nothing is in the list");
            }
            else if(head==tail) 
            {
                head=null;
                tail=null;
                return;
            }
            else 
            {
                Node t=head;
                while(t.next!=null)
                {
                    t=t.next;
                }
                tail=t.prev;
                tail.next=null;
                return;


            }
        }
        

    public static void main(String[] args) 
    {
        doublyLL list=new doublyLL();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        System.out.print("After adding from first : ");
        list.displayList();

        list.addLast(50);
        list.addLast(60);
        list.addLast(70);
        System.out.print("After adding from Last : ");
        list.displayList();

        list.deleteFirst();
        System.out.print("After deleting from first : ");
        list.displayList();

        list.deleteLast();
        System.out.print("After deleting from last : ");
        list.displayList();

    }
}
