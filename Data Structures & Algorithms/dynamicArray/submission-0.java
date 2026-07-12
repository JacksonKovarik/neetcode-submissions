class DynamicArray {

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.arr = new int[this.capacity];
    }

    public int get(int i) {
        return this.arr[i];
    }

    public void set(int i, int n) {
        this.arr[i] = n;
    }

    public void pushback(int n) {
        if(this.size == this.capacity){
            resize();
        }
        this.arr[this.size] = n;
        this.size++; 
        System.out.println(this.capacity); 
    }

    public int popback() {
        if(size > 0){
            int element = this.arr[size-1];
            this.arr[size-1] = 0;
            this.size--;
            return element;
        }else{
            return -1; 
        }
        
    }

    private void resize() {
        this.capacity *= 2;

        int[] newArr = new int[this.capacity];

        for(int i=0; i<size; i++){
            newArr[i] = this.arr[i];
        }

        this.arr = newArr;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }

    private int size=0;
    private int capacity;
    private int[] arr;
}
