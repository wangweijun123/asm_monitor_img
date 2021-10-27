package com.darren.optimize.day04;

import org.junit.Test;

import static java.lang.System.out;
import static org.junit.Assert.*;

/**
 * 访问者模式
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class VisitorTest {
    @Test
    public void test() {
        final Student student = new Student(10);
        Visitor visitor = new Visitor() {
            @Override
            public void visitor(Student obj) {
                // 把你对象给我，我这个访问者来使用
                obj.age = 100;
                out.println(student.age);
            }
        };
        student.accept(visitor);
    }
}