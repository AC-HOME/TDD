package com.ac.test;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @ClassName fizzbuzz
 * @Description fizzbuzz
 * @Author zhuangding
 * @Date 2019/08/27 00:12
 **/

public class FizzbuzzTest {

    @Test
    public void show_normal_when_say_expect_which_divisible_by_3_or_5_or_3_and_5(){
        long number = showNormal(1);
        assertEquals(1,number);
    }
}
