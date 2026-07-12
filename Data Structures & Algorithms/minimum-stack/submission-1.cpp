class MinStack {
private:
    std::stack<int> stack;
    std::stack<int> miniStack;
public:
    MinStack() {}
    
    void push(int val) {
        stack.push(val);
        if(miniStack.empty() || miniStack.top() > val){
            miniStack.push(val);
        }else{
            miniStack.push(miniStack.top());
        }
    }
    
    void pop() {
        stack.pop();
        miniStack.pop();
    }
    
    int top() {
        return stack.top();
    }
    
    int getMin() {
        return miniStack.top();
    }
};
