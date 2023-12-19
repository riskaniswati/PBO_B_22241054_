package com.tutorial;


class User{
    private String username;
    private String password;

    User (String username, String password) {
        this.username = username;
        this.password = password;

    }


// Method getter 
public String getusername(){
    return this.username;}
public String getpassword(){
    return this.password;

}



// Method Setter untuk mengganti password
public void
    setpassword(String password)
    {
        this.password = password;

    }
}


public class Main {
    public static void main(String[] args) {
        //Instansiasi atau buat objek
        User Person_1 = new User("UNDIKMA", "Jaya-jaya");
        // get username
        System.out.println( Person_1.getusername());
        System.out.println(Person_1.getpassword());
        Person_1.setpassword("Sukses");

    
        System.out.println("Password baru: " + Person_1.getpassword());
    

    }
}
