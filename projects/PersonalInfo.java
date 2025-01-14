//Assignment # 10 Question 1 

public class PersonalInfo {

    private String name;
    private String address;
    private int age;
    private String phoneNumber;

  
    public PersonalInfo(String name, String address, int age, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

 

    public static void main(String[] args) {

        PersonalInfo myInfo = new PersonalInfo("Savara Khan", "222 blank street ", 22, "631-888-1111");
        PersonalInfo friend1Info = new PersonalInfo("Jade Ace", "333 happy street",21, "631-222-3333");
        PersonalInfo friend2Info = new PersonalInfo("Sam Ran", "444 black street", 24, "631-555-7777");

    
        System.out.println("My Info:");
        displayInfo(myInfo);

        System.out.println("\nFriend1 Info:");
        displayInfo(friend1Info);

        System.out.println("\nFriend2 Info:");
        displayInfo(friend2Info);
    }
    
    public static void displayInfo(PersonalInfo info) {
        System.out.println("Name: " + info.getName());
        System.out.println("Address: " + info.getAddress());
        System.out.println("Age: " + info.getAge());
        System.out.println("Phone Number: " + info.getPhoneNumber());
    }
}
