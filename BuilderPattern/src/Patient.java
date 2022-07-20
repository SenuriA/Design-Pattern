
public class Patient {
	 private final String  patientName;
	 private final Boolean flue;
	 private final String BloodGroup;
	 private final String BloodPressure;
	 
	 public Patient (Builder builder) {
		 this.patientName=builder.patientName;
		 this.flue=builder.flue;
		 this.BloodGroup=builder.BloodGroup;
		 this.BloodPressure=builder.BloodPressure;
	 }
	 
	 static class Builder{
		private String patientName;
		private Boolean flue;
		private String BloodGroup;
		private  String BloodPressure;
		 public Patient build() {
			 return new Patient(this);
		 }
		 
		 public Builder(String patientName) {
			 this.patientName=patientName;
		 }
		 public Builder flue(Boolean flue) {
			 this.flue=flue;
			 return this;
		 }
		 
		 public Builder BloodGroup(String BloodGroup) {
			this.BloodGroup=BloodGroup;
			return this;
		 }
		  public Builder BloodPressure(String BloodPressure) {
			  this.BloodPressure=BloodPressure;
			  return this;
			  
		  }

	
		  
	 }

	@Override
	public String toString() {
		return "Patient [patientName=" + patientName + ", flue=" + flue + ", BloodGroup=" + BloodGroup
				+ ", BloodPressure=" + BloodPressure + "]";
	}

	
	 
	 

}
