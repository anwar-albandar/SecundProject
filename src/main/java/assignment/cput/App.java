package assignment.cput;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


    }

    public void createUser()
    {
        User user = new User();
        user.setName("Anwar");
        user.setSurname("Bandar");
        user.setStudentNumber(123456);
        System.out.println(user.toString());

    }

}
