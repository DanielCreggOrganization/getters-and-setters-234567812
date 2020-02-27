public class Main {
    
    // Main method
    public static void main(String[] args) {
      
       Person personObject = new Person();
       personObject.setFirstName("Kasia ");
       System.out.print(personObject.getFirstName());
 
       Person personObject2 = new Person();
       personObject2.setMiddleNames("Middle Name ");
       System.out.print(personObject2.getMiddleNames());

       Person personObject3 = new Person();
       personObject3.setUserName("KasiaKrakowska ");
       System.out.print(personObject3.getUserName());

}
}