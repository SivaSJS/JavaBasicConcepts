package com.codebyme;

public class WrapperClass {
    int value = 2;
     Integer v = Integer.valueOf(value); // boxing
    int val  = v.intValue();// unboxing
    Integer v1 = 3; // auto-boxing
    int val1 = v1; // auto-unboxing
    
}
