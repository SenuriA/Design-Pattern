
public class JamboPackage extends Package {
	@Override
	protected void createPackage() {
		PizzaTypes.add(new CheeseLoversPizzaType());
		PizzaTypes.add(new SausageDelightPizzaType());
		PizzaTypes.add(new DevilledChickenPizzaType());
	}	
	
}
