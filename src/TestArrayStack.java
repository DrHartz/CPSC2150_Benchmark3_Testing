import org.junit.Test;

import java.lang.reflect.Array;

import static org.junit.Assert.*;

public class TestArrayStack {

    //IMPORTANT: This file MUST compile! If it does not compile, you will receive a -20 deduction for this assignment.

    @Test
    public void testConstructor_default(int capacity) {
        ArrayStack<String> obs = new ArrayStack<>();
        String obsString = obs.toString();
        String exp = "";

        assertEquals(exp, obsString);
    }
    @Test
    public void testPeek_Array_size()
    {
        ArrayStack<String> obs = new ArrayStack<>();
        obs.push("cat");
        obs.push("dog");


        String obsString = obs.peek();

        String exp = "dog";

        assertTrue(obsString.equals(exp)); //check the output works

        obsString = obs.toString();
        exp = "cat dog ";

        assertEquals(exp, obsString);
    }

    @Test
    public void testPop_Size1() {
        ArrayStack<String> obs = new ArrayStack<>();
        obs.push("cat");//adds elements for removal
        obs.push("dog");//adds elements for removal

        obs.pop();//removes top element

        String obsString = obs.pop();
        String exp = "cat";
        assertTrue(obsString.equals(exp));
        obsString = obs.toString();
        exp = "cat ";

        assertEquals(exp, obsString);

    }
    @Test
    public void testClear_List() {
        ArrayStack<String> obs = new ArrayStack<>();
        obs.push("cat");
        obs.push("dog");

        obs.clear();
        String obsString = obs.clear();
        String exp = "";
        assertTrue(obsString.equals(exp));

    }
}
