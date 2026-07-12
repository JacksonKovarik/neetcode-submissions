class Deque {
    private int[] arr;

    private int head;
    private int tail;
    private int count;

    public Deque() {
        arr = new int[10];
        tail = 0;
        head = 0;
        count = 0;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void append(int value) {
        if ((tail + 1) % arr.length == head) {
            this.resizeArr();
        }
        if (tail == 0 && arr[tail] == 0) {
            arr[tail] = value;
        } else {
            tail++;
            arr[tail] = value;
        }
        
        count++;
    }

    public void appendleft(int value) {
        if ((head-1) % arr.length == tail) {
            this.resizeArr();
        }

        if (head == 0 && arr[head] == 0) {
            arr[head] = value;
        } else {
            head = (head-1+arr.length) % arr.length;
            arr[head] = value;
        }
        count++;
    }

    public int pop() {
        if (count == 0) {
            return -1;
        }
        int val = arr[(tail+arr.length)%arr.length];
        tail = (tail+arr.length-1)%arr.length;
        count--;
        return val;
    }

    public int popleft() {
        if (count == 0) {
            return -1;
        }
        int val = arr[head];
        head = (head+1) % arr.length;
        count--;
        return val;
    }

    private void resizeArr() {
        int[] newArr = new int[this.arr.length*2];
        int halfArr = this.arr.length/2;

        for (int i=0; i<arr.length; i++) {
            newArr[i] = arr[(head+i) % arr.length];
        }

        head = 0;
        tail = arr.length-1;
        arr = newArr;
    }

    // private void resize() {
    //     int[] newArr = new int[this.arr.length*2];
    //     int halfArr = this.arr.length/2;

    //     for (int i=0; i<halfArr; i++) {
    //         newArr[i] = 0;
    //     }
    //     int h = head;
    //     for (int i=0; i<arr.length; i++) {
    //         newArr[i+halfArr] = arr[h];
    //         h++;
    //     }

    //     for (int i=arr.length+halfArr-1; i<newArr.length; i++) {
    //         newArr[i] = 0;
    //     }

    //     head = head > 0 ? head + halfArr : halfArr;
    //     tail = tail < arr.length ? tail + halfArr : arr.length+halfArr;
    //     arr = newArr;
    // }
}
