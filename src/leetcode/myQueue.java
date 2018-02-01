package leetcode;

import java.util.Stack;

/**
 * @author renkai
 *         created on 2018/2/1.
 */
public class myQueue {
    static Stack<Integer> temp = new Stack<>();
    static Stack<Integer> value = new Stack<>();
    static boolean empty() {
        return temp.isEmpty() & value.isEmpty();
    }
    static void push(int x) {
        if(empty()) {
            value.push(x);
        } else {
            while (!value.isEmpty()) {
                temp.push(value.pop());
            }
            value.push(x);
            while (!temp.isEmpty()) {
                value.push(temp.pop());
            }
        }
    }
    static void pop(){
        value.pop();
    }
    static int peek(){
        return value.peek();
    }
}
