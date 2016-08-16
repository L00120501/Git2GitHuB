package lyitlabs.dao;

public class Person {
       private String FirstName;
       private String LastName;
       private int age;
public Person() {
       }
       public Person(String firstName, String lastName, int age) {
    	      super();
    	      FirstName = firstName;
    	      LastName = lastName;
    	      this.age = age;
    	      
       }
              public String getFirstName() {
              return FirstName;
              
       }
       public void setFirstName(String firstName) {
    	      FirstName = firstName;
       }
       public String getLastName() {
    	      return LastName;
    	      
       }
       public void setLastName(String lastName) {
    	      LastName = lastName;
       }
       public int getAge() {
    	      return age;  
       }
       public void setAge(int age) {
             this.age = age;
       }      		 
}     