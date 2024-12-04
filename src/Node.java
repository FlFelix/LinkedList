public class Node<T> {

    T data;
    Node<T> next;

    Node(){}

    Node (T data) {
        this.data = data;
        this.next = null;
    }

    public void setData(T data){
        this.data = data;
    }

    public T getData() {
        return data;
    }
}