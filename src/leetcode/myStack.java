package leetcode;

import java.util.LinkedList;

/**
 * @author renkai
 *         created on 2018/2/1.
 */
public class myStack {
    static LinkedList<Integer> q1 = new LinkedList<>();
    static LinkedList<Integer> q2 = new LinkedList<>();
    static boolean empty() {
        return q1.isEmpty() & q2.isEmpty();
    }
    static void push(int x) {
        if(empty()) {
            q1.offer(x);
        } else {
            if(q1.size()!=0) {
                q2.offer(x);
                int size = q1.size();
                while(size>0) {
                    q2.offer(q1.poll());
                    size--;
                }
            } else if(q2.size() > 0) {
                q1.offer(x);
                int size = q2.size();
                while(size>0){
                    q1.offer(q2.poll());
                    size--;
                }
            }
        }
    }
    static void pop() {
        if(q1.size()>0) {
            q1.pop();
        } else if(q2.size()>0) {
            q2.poll();
        }
    }
    static Integer top() {
        if(q1.size() >0) {
            return q1.peek();
        } else if (q2.size()>0) {
            return q2.peek();
        }
        return 0;
    }

}
