import java.util.Stack;

public class CareTaker {

	Stack <FullWaterTank.TankMemento> history=new Stack<>();
	
	public void save (FullWaterTank tank) {
		history.push(tank.save());
	}
	
	public void revert (FullWaterTank tank) {
		if(!history.isEmpty())
			tank.revert(history.pop());
		else
			System.out.println("Cannot waist water");
			
	}
}
