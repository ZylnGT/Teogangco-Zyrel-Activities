public class Student{
   private String firstName;
   private String middleName;
   private String lastName;
   private String suffix;



public Student() {
  this.firstName = "";
  this.middleName = "";
  this.lastName = "";
  this.suffix = "";
}


//getters
public String getfirstName(){
   return firstName;
}
public String getmiddleName(){
   return middleName;
}
public String getlastName(){
   return lastName;
}
public String getsuffix(){
   return suffix;
}

// setters
public void setfirstName(String firstName){
   this.firstName = firstName;
}
public void setmiddleName(String middleName){
   this.middleName = middleName;
}
public void setlastName(String lastName){
   this.lastName = lastName;
}
public void setsuffix(String suffix){
   this.suffix = suffix;
}
}