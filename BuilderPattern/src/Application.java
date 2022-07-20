
public class Application {
	
	public static void main (String[] args) {
		PatientTelescopic1 patientTelescope1=new PatientTelescopic1("Ramya");
		System.out.println(patientTelescope1);
		
		
		PatientTelescopic2 patientTelescope2=new PatientTelescopic2("Samya");
		System.out.println(patientTelescope2);
		
		Patient.Builder builder=new Patient.Builder("Saman");
		Patient patient =builder.BloodGroup("A+").BloodPressure("120pp").build();
		System.out.println(patient);
	}

}
