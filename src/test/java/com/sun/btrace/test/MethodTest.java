package com.sun.btrace.test;

import com.sun.btrace.annotations.*;

import static com.sun.btrace.BTraceUtils.*;

@BTrace
public class MethodTest {

    @OnMethod(clazz = "java.lang.Thread", method = "<init>")
    public static void onMethodEntry(@Self Thread t) {
        println("Thread <init>");
    }

}
