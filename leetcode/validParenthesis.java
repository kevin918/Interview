import java.util.Stack;

public class validParenthesis {
    static boolean valid(String input) {
        Stack s = new Stack();
        for (char c : input.toCharArray()) {
            if(c=='(') {
                s.push(')');
            } else if (c == '{') {
                s.push('}');
            } else if (c == '[') {
                s.push(']');
            } else if (s.isEmpty() || !s.pop().equals(c)) {
                return false;
            }
        }
        return s.isEmpty();
    }
    public static void main(String[] str) {
        String test = "[[{{}}]]";
        System.out.println("result: " + valid(test));
    }
}
