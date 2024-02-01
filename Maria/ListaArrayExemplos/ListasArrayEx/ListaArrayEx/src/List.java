public class List<T> {
    Node<T> node;

    public List(T node) {
        this.node = new Node<>(node);
    }

    public void add(T value) {
        Node<T> temp = this.node; //ponteiro //endereço da 1 estacia do node
        for (; ; ) {
            if (temp.next == null) { //posição atual
                temp.next = new Node<>(value);
                break;
            }
            temp = temp.next;
        }
    }

    public void getIndex(int index) {
        Node<T> temp = this.node; //ponteiro //endereço da 1 estacia do node
        for (int i = 0; i <= index; i++) {
            if (i == index) { //posição atual
                System.out.println(temp.value);
                break;
            }
            temp = temp.next;
        }
    }

    public void addValue(T value, int index) {
        Node<T> temp = this.node; //ponteiro //endereço da 1 estacia do node
        for (int i = 0; i <= index; i++) {
            if (i == index) { //posição atual
                temp.value = value;
                break;
            }
            temp = temp.next;
        }
    }

    public void deleteIndex(int index) {
        // para tratar da posição 0
        if (index == 0) {
            if (node != null) {
                node = node.next;
            }
            return;
        }
        // para fazer a troca dos Nodes
        Node<T> temp = this.node;
        Node<T> previous = null;
        int currentIndex = 0;

        while (temp != null && currentIndex < index) {
            previous = temp;
            temp = temp.next;
            currentIndex++;
        }
        previous.next = temp.next;
    }
}
