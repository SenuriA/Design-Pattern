
public class PatientTelescopic1 {
 String patientName;
 Boolean flue;
 String BloodGroup;
 String BloodPressure;
public PatientTelescopic1(String patientName) {
	
	this.patientName = patientName;
}
public PatientTelescopic1(String patientName, Boolean flue) {
	
	this (patientName);
	this.flue = flue;
}
public PatientTelescopic1(String patientName, Boolean flue, String bloodGroup) {
	
	this(patientName,flue);
	BloodGroup = bloodGroup;
}
public PatientTelescopic1(String patientName, Boolean flue, String bloodGroup, String bloodPressure) {
	this( patientName,flue,bloodGroup);
	BloodPressure = bloodPressure;
}
@Override
public String toString() {
	return "PatientTelescopic1 [patientName=" + patientName + ", flue=" + flue + ", BloodGroup=" + BloodGroup
			+ ", BloodPressure=" + BloodPressure + "]";
}







 
 
 
 
}
