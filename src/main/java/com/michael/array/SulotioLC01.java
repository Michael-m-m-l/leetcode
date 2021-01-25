package com.michael.array;


import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class SulotioLC01 {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            int sum1 = 0;
            for (int j = nums.length-1; j >0 ; j--) {
                sum1 = sum1 + nums[j];
                if (sum == sum1) {
                    return i+1;
                }
                if (i==j){
                    continue;
                }
            }
        }
        return -1;
    }

    @Test
    public void test() {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int i = pivotIndex(nums);
        log.info("" + i);
    }

    @Data
    class num{
        public num(int index) {
            this.index = index;
        }

        int index;
        num next;
    }

    @Test
    public void test11(){
        List<num> arrayList = new ArrayList<>();

        for (int i = 0; i <10 ; i++) {
            arrayList.add(new num(i));
        }

        num root = arrayList.get(0);
        for (int i = 1; i < arrayList.size() ; i++) {
            arrayList.get(i).setNext(root);
            root = arrayList.get(i);
        }

        log.info("");
    }
}
