import java.util.Stack;

public class MinStack {
    Stack<Integer> stc;
    public MinStack() {
         stc = new Stack<>();
    }
    public void push(int val) {
        if(stc.isEmpty()) {
            stc.push(val);
            return;
        }
        int a = stc.peek();
        if(val <= a) {
            stc.push(val);
        }
        else {
           stc.pop();
           stc.push(val);
           stc.push(a);
        }
    }
    public void pop() {
        if(stc.isEmpty()) {
            return;
        }
        stc.pop();
    }
    public int top() {
        if(stc.isEmpty()) {
            return 0;
        }
        return stc.peek();
    }
    public int getMin() {
        if(stc.isEmpty()) {
            return 0;
        }
        return stc.peek();
    }

    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(-2);
        obj.push(0);
        obj.push(-3);
        System.out.println(obj.getMin());
        obj.pop();
        System.out.println(obj.top());
        System.out.println(obj.getMin());
    }
}
