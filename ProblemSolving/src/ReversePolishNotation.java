import java.util.Objects;
import java.util.Stack;

public class ReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stc = new Stack<>();
        for(String s : tokens) {
            if(Objects.equals(s, "+")) {
                int a = stc.pop();
                int b = stc.pop();
                stc.push(a+b);
            }
            else if(Objects.equals(s, "-")) {
                int a = stc.pop();
                int b = stc.pop();
                stc.push(a-b);
            }
            else if(Objects.equals(s, "*")) {
                int a = stc.pop();
                int b = stc.pop();
                stc.push(a*b);
            }
            else if(Objects.equals(s, "/")) {
                int a = stc.pop();
                int b = stc.pop();
                stc.push(a/b);
            }
            else {
                stc.push(Integer.parseInt(s));
            }
        }
        return  stc.pop();
    }

    public static void main(String[] args) {
        String[] tokens = {"2","1","+","3","*"};
        ReversePolishNotation rpn = new ReversePolishNotation();
        int result = rpn.evalRPN(tokens);
        System.out.println(result);
    }
}
