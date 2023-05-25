import java.util.Objects;
import java.util.Stack;

public class ValidParanthesis {
    public boolean isValid(Stack<String> stc) {
        if (stc.isEmpty()) {
            return false;
        }
        while (!stc.isEmpty()) {
            String curr = stc.pop();
            if (Objects.equals(curr, "(")) {
                if (Objects.equals(stc.peek(), ")")) {
                    stc.pop();
                }
                else {
                    return false;
                }
            } else if (Objects.equals(curr, "[")) {
                if (Objects.equals(stc.peek(), "]")) {
                    stc.pop();
                }
                else {
                    return false;
                }

            } else if (Objects.equals(curr, "{")) {
                if (Objects.equals(stc.peek(), "}")) {
                    stc.pop();
                }
                else {
                    return false;
                }
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ValidParanthesis validParanthesis = new ValidParanthesis();
        Stack<String> stc = new Stack<>();
        stc.push("]");
        stc.push("{");
        stc.push("(");
        stc.push(")");
        System.out.println(validParanthesis.isValid(stc));
    }
}

