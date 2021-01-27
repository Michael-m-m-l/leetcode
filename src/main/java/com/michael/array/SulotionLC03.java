package com.michael.array;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class SulotionLC03 {
    public int[][] merge(int[][] intervals) {
        int[][] intsnew = new int[intervals.length][intervals[0].length];
        int j=0;
        intsnew[0][1] = intervals[0][1];
        intsnew[0][0] = intervals[0][0];
        for (int i = 0; i < intervals.length ; i++) {
            if (intsnew[j][1] >= intervals[i][0]) {
                intsnew[j][1] = intervals[i][1];
                intsnew[j][0] = intervals[i][0];
            } else {
                intsnew[j][1] = intervals[i][1];
                intsnew[j][0] = intervals[i][0];
                j++;
            }
        }
        return intsnew;
    }

    @Test
    public void test(){
        int [][] intervals ={{1,3},{2,6},{8,10},{15,18}};
        int[][] merge = merge(intervals);
        log.info("");
    }
}
