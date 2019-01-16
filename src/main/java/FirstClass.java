import javax.jws.soap.SOAPBinding;

public class FirstClass {

    public static void main(String[] args){
       User user = new User();
       User secondUser = new User();

       String string = "Changed text";
       String secondString = "Mobile ninjas rules!";

       user.setName(string);
       secondUser.setName(secondString);

       System.out.println(user.getName());
       System.out.println(secondUser.getName());
       System.out.println(User.role);
    }
}
