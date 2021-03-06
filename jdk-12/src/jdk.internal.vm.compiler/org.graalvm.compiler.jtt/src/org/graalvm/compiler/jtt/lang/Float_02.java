/*
 * Copyright (c) 2010, 2018, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */


package org.graalvm.compiler.jtt.lang;

import org.junit.Test;

import org.graalvm.compiler.jtt.JTTTest;

/*
 */
public class Float_02 extends JTTTest {

    public static boolean test(float f) {
        return f != 1.0f;
    }

    @Test
    public void run0() throws Throwable {
        runTest("test", 1.0f);
    }

    @Test
    public void run1() throws Throwable {
        runTest("test", 2.0f);
    }

    @Test
    public void run2() throws Throwable {
        runTest("test", 0.5f);
    }

    @Test
    public void run3() throws Throwable {
        runTest("test", java.lang.Float.NaN);
    }

}
