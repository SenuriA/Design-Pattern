
public class PatientTelescopic2 {
	 String patientName;
	 Boolean flue;
	 String BloodGroup;
	 String BloodPressure;
	public PatientTelescopic2(String patientName, Boolean flue, String bloodGroup, String bloodPressure) {
		
		this.patientName = patientName;
		this.flue = flue;
		BloodGroup = bloodGroup;
		BloodPressure = bloodPressure;
	}
	public PatientTelescopic2(String patientName, Boolean flue, String bloodGroup) {
		
		this( patientName,flue,bloodGroup,null);
	}
	public PatientTelescopic2(String patientName, Boolean flue) {
		
		this(patientName, flue,null);
	}
	public PatientTelescopic2(String patientName) {
		
		this( patientName,null);
	}
	@Override
	public String toString() {
		return "PatientTelescopic2 [patientName=" + patientName + ", flue=" + flue + ", BloodGroup=" + BloodGroup
				+ ", BloodPressure=" + BloodPressure + "]";
	}
	
	
	
	
	 
	 

}
