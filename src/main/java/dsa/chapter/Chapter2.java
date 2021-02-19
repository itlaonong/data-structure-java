package dsa.chapter;

import dsa.Stack_Array;

public class Chapter2 {
    public static Integer[] reverse(Integer[] a) {
        Stack_Array S = new Stack_Array(a.length);
        Integer[] b = new Integer[a.length];
        for (int i = 0; i < a.length; i++) S.push(a[i]); //所有元素顺序入栈
        for (int i = 0; i < a.length; i++) b[i] = (Integer) (S.pop()); //逆序退栈
        return b;
    }

    /*
     * 阶乘函数
     */
    public static long factorial(Long n) {
        if (n <= 1) return 1;
        else return n * factorial(n - 1);
    }
}
