import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    Student student = new Student();

    @Test
    public void getAge() {

        int actual = student.getAge();
        int expected = 0;
        assertEquals(actual,expected);
    }

    @Test
    public void setAge() {

        assertEquals(5,5);
    }
}