class Deque {
    private int[] arr;

    private int head;
    private int tail;
    private int count;

    public Deque() {
        arr = new int[10];
        tail = 5;
        head = 5;
        count = 0;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void append(int value) {
        if (tail+1 == arr.length) {
            this.resizeArr();
        }

        if (head == tail && arr[tail] == 0) {
            arr[tail] = value;
        } else {
            tail++;
            arr[tail] = value;
        }
        count++;
    }

    public void appendleft(int value) {
        if (head == 0) {
            this.resizeArr();
        }

        if (head == tail && arr[head] == 0) {
            arr[head] = value;
        } else {
            head--;
            arr[head] = value;
        }
        count++;
    }

    public int pop() {
        if (count == 0) {
            return -1;
        }
        int val = arr[tail];
        // arr[tail] = 0;
        tail--;
        count--;
        return val;
    }

    public int popleft() {
        if (count == 0) {
            return -1;
        }
        int val = arr[head];
        head++;
        count--;
        return val;
    }

    private void resizeArr() {
        int[] newArr = new int[this.arr.length*2];
        int halfArr = this.arr.length/2;

        for (int i=0; i<halfArr; i++) {
            newArr[i] = 0;
        }
        for (int i=0; i<arr.length; i++) {
            newArr[i+halfArr] = arr[i];
        }
        for (int i=arr.length+halfArr-1; i<newArr.length; i++) {
            newArr[i] = 0;
        }

        head += halfArr;
        tail += halfArr;
        arr = newArr;
    }
}
