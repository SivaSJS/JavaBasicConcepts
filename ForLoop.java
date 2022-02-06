package com.company;

public class ForLoop {
    public static void main(String[] args) {
        int val[] = {1,2,3,4,5};
        int total = 0;
        for(int i = 0; i < val.length; i++){
            total+=val[i];
        }
        System.out.println(total);
    }
}
