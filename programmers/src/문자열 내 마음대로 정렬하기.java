import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public List<String> solution(String[] strings, int n) {
        return Arrays.stream(strings).sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                char ch1 = o1.charAt(n);
                char ch2 = o2.charAt(n);
                if (ch1 == ch2) {
                    return o1.compareTo(o2);
                } else {
                    return ch1 - ch2;
                }
            }
        }).collect(Collectors.toList());
    }
}
