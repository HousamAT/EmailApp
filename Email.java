import java.util.Scanner;
import java.util.Random;

public class Email{
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email; 
    private int mailboxCapacity = 200;

    //constructer with zero parameters 
    public Email(){
        this.firstName = getFirstName();
        this.lastName = getLastName(); 

        //ask for the department 
        this.department = getDepartment();

        //method to create a random passowrd
        this.password = makePassword(10);

        //generating the email for the user
        this.email = this.firstName.toLowerCase() + this.lastName.toLowerCase() 
        + "@"+ this.department.toLowerCase() +"." + "FANG.com";
        
       
    }

    //constructer with zero parameters
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        //ask for the department 
        this.department = getDepartment();

        //method to create a random passowrd
        this.password = makePassword(10);
        //System.out.println(this.password);

        //combine elments to generate email
        this.email = this.firstName.toLowerCase() + this.lastName.toLowerCase() 
        + "@"+ this.department.toLowerCase() +"." + "FANG.com"; 
        
    }

    private String getFirstName(){
        System.out.println("Please Enter your Fistname: ");
        Scanner firstName = new Scanner(System.in);
        return firstName.next();
    }

    private String getLastName(){
        System.out.println("Please Enter your Lastname: ");
        Scanner lastName = new Scanner(System.in);
        return lastName.next();

    }

    private String getDepartment(){
        System.out.println("enter your department name: ");
        Scanner department = new Scanner(System.in);
        return department.next();  
    }

    private String makePassword(int length){
        String passowrdSet = "ABCDEFGHIGKLMNOPQRST123456789@";
        Random random = new Random();
        int num; 
        char[] newPassword = new char[length]; 
        for (int i=0; i < length; i++){
            num = random.nextInt(passowrdSet.length()); 
            newPassword[i] = passowrdSet.charAt(num); 
        }

        return new String(newPassword); 
    }

    public String getEmail(){
        return this.email; 
    }

}