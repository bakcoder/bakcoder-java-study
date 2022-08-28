package algorithm.problemSolvingStrategies.bruteForce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// n개의 원소 중 m개를 고르는 모든 조합을 찾는 알고리즘
public class NPick {
    public static void main(String[] args) {
        int num = 9;
        List<Integer> picked = new ArrayList<>();
        int toPick = 3;

        NPick npick = new NPick();
        npick.pick(num, picked, toPick);
    }

    public void pick(int num, List<Integer> picked, int toPick) {
        if(toPick == 0) {
            printPicked(picked);
        } else {
            int minVal = picked.size() == 0 ? 0 : picked.get(picked.size()-1) + 1;
            for(int i=minVal ; i<num ; i++) {
                picked.add(i);
                pick(num, picked, toPick-1);
                picked.remove(picked.size()-1);
            }
        }
    }

    public void printPicked(List<Integer> picked) {
        System.out.println(Arrays.toString(picked.stream().toArray()));
    }

}
