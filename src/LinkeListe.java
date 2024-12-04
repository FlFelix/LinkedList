public class LinkeListe<T> {

    T dataType;
    Node head;

    public void add(T data){
        Node newNode = new Node<>(data);
        if (head == null){
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void remove(T data){
        if (head == null) return;

        if (head.data == data){
            head = head.next;
            return;
        }

        Node current = head;
        while(current.next != null && current.next.data != data){
            current = current.next;
        }

        if (current.next != null){
            current.next = current.next.next;
        }
    }

    public void printListe(){
        Node current = head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println();
    }

    public int getNodeCount(){
        Node current = head;
        int counter = 1;
        while(current.next != null){
            current = current.next;
            counter++;
        }
        return counter;
    }

    public Node getNodeAt(int counter){
        Node current = head;
        for (int i = 1; i <= counter; i++){
            if (current.next == null){return null}
            else{
            current = current.next != null ? current.next : null;
            }
        }
        return current;
    }

    public T getObjectAt(Node current){
        return (T) current.data;
    }
}
