public class Person {

    // Instance Variables
    private String firstName;
    private String[] middleNames;
    private String userName;

    // Methods

    //getter method
    public String getFirstName(){
            return firstName;
   }
    public String getMiddleNames(){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < middleNames.length; i++) {
            sb.append(middleNames[i]+ " ");            
        }
    String middleNames = sb.toString();
    return middleNames;
    }
    public String getUserName(){
            return userName;
   }

    //setter method
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setMiddleNames(String middleNames){
        this.middleNames = middleNames.split(" "); //split use with array
    }
    public void setUserName(String userName){
        this.userName = userName;
    }

    
   
    }

