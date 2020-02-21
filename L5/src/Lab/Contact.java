package Lab;

import java.nio.charset.Charset;

public class Contact {
private	String personName;
private String personId;
private int age;
private String mobileNumber;
private char gender;
public String getPersonName() {
	return personName;
}
public void setPersonName(String personName) {
	this.personName = personName;
}
public String getPersonId() {
	return personId;
}
public void setPersonId(String personId) {
	this.personId = personId;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public char getGender() {
	return gender;
}
public void setGender(char c) {
	this.gender = c;
}
public Contact() {
	super();
	// TODO Auto-generated constructor stub
} 
public void showInfo() {
	System.out.println(personName+":"+personId+":"+age+":"+mobileNumber+":"+gender);
}

}
