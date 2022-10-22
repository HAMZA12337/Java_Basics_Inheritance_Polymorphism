package metier;
public class Person {
    private String firstName;
    private  String lastName ;
    private String email ;
    private String tel;
    private int age;
// Constructor
    public Person(String firstName, String lastName, String email, String tel, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.tel = tel;
        this.age = age;
    }

 // Getters
  private String getFirstName() {
        return firstName;
    }

    private String getLastName() {
        return lastName;
    }

    private String getEmail() {
        return email;
    }

    private String getTel() {
        return tel;
    }

    private int getAge() {
        return age;
    }


    //Setters


    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    private void setTel(String tel) {
        this.tel = tel;
    }

    private void setAge(int age) {
        this.age = age;
    }



    // Display method

    public  void display(){

        System.out.println("  First Name :"+firstName+
                        "\n  Last Name :"+lastName+
                        "\n  Email :"+email+
                        "\n  phone number  :"+tel+
                        "\n  Age  :"+age
   );






    }






}
