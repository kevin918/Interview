package backtracking;

import java.util.ArrayList;
import java.util.List;

public class subset9 {
    List<List<Character>> subsets(List<Character> set) {
        if (set == null) {
            return null;
        }
        List<List<Character>> result = new ArrayList<>();
        for (int i = 0; i<set.size(); i++) {
            List<List<Character>> temp = new ArrayList<>();
            for (List<Character> a : result) {
                temp.add(new ArrayList<>(a));
            }
            for (List<Character> a : temp) {
                a.add(set.get(i));
            }
            List<Character> s = new ArrayList<>();
            s.add(set.get(i));
            temp.add(s);
            result.addAll(temp);
        }
        result.add(new ArrayList<>());
        return result;
    }
}
