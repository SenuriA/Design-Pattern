
public class Application {
Registry registry= new Registry();
Houses house=(Houses)registry.getResidential(ResidentialType.House);
System.out.println(house);
house.setType("Semi-detached");
System.out.println(house);
Houses house2=(Houses)registry.getResidential(ResidentialType.House);
System.out.println(house2);

}
