import java.util.ArrayList;
import java.util.List;
public abstract class Package {
	protected List<PizzaTypes> PizzaTypes=new ArrayList<>();
	 public Package() {
		 createPackage();
	 }
	 
	 protected abstract void createPackage();
	 @Override
	 public String toString() {
		 return "package { "+" pizza types "+PizzaTypes+"}";
	 }
	 

}
