import static java.util.stream.Collectors.reducing;

import java.util.stream.Stream;

class Solution {

    public int solution(int n) {
        return Stream.iterate(0, i -> i + 1)
                .limit(n + 1)
                .filter(i -> i % 2 == 0)
                .collect(reducing(0,i->i,(i,j)->i+j))
                .intValue();
    }
}
