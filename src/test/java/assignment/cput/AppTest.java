package assignment.cput;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {
    
    private User user1;
    private User user2;
    private User user3;
    
    
    @Test
    public void createUser() {

        user1 = new User();
        user1.setName("Anwar");
        user1.setSurname("Bandar");
        user1.setStudentNumber(123456);


        user2 = new User();
        user2.setName("Mohammed");
        user2.setSurname("Ali");
        user2.setStudentNumber(123456);


        user3 = user1;


        System.out.println(user1.getName());
        user3.setName("Armad");
        System.out.println(user1.getName());


        System.out.println(user1.hashCode());
        System.out.println(user3.hashCode());

        System.out.println(user3.toString());
        System.out.println(user1.toString());

        Assert.assertEquals(user1, user3);

    }

    @Test
    public void anotherTest(){
        String numb1 = "line";

        String num2 = numb1;

        System.out.println(numb1.hashCode());
        num2 = "another line";
        System.out.println(num2.hashCode());

        Assert.assertNotEquals(numb1, num2);
        fail();

    }

    @Test
    public void testEquality() {
        user2 = user1;

        Assert.assertEquals("User1 is not equal to User2 ",user1,user2);
        System.out.println(user1 + "\n" + user2);

    }

    @Test (timeout = 200)
    public void testIdentityWithTimeout(){
        while (user2 == user1);
    }
}