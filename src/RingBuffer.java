public class RingBuffer<E> {
    private Object[] array;
    int size;
    int read;
    int write;

    public RingBuffer(int cappacity) {
        array = new Object[cappacity];
    }

    public void offer(E e) {

        this.array[write] = e;
        this.write++;

        if (this.write == array.length) {
            this.write = 0;
        }
        if (this.size == array.length) {
            this.read++;
            if (this.read == array.length)
                this.read = 0;
            return;
        }
        this.size++;
    }

    public E poll() {
        if (this.size > 0) {
            E element = (E) array[this.read];
            this.read++;
            if (this.read == array.length) {
                this.read = 0;
            }
            this.size--;
            return element;
        }

        return null;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public E peek() {
        if (isEmpty()) {
            return null;
        }
            return (E) array[this.read];
    }

    public void display() {
        if (this.read >= this.write && this.size != 0) {
            for (int i = this.read; i < this.array.length; i++) {
                System.out.print(array[i] + " ");
            }
        } else if (this.write >= this.read && this.size != 0) {
            for (int i = this.read; i < this.write; i++) {
                System.out.print(array[i] + " ");
            }
            }
        }


}
