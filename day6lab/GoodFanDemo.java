package day6lab;

public class GoodFanDemo {
	State state=new SwitchOffState();
	public void pull() {
		state.changeFanState(this);
	}
}
abstract class State{
	public abstract void changeFanState(GoodFanDemo fan);
}
class SwitchOffState extends State{
	@Override
	public void changeFanState(GoodFanDemo fan) {
		System.out.println("switch on state.....");
		fan.state=new SwitchOnState();
	}
}
class SwitchOnState extends State{
	@Override
	public void changeFanState(GoodFanDemo fan) {
		System.out.println("medium speed state...");
		fan.state=new MediumSpeedState();
	}
}
class MediumSpeedState extends State{
	@Override
	public void changeFanState(GoodFanDemo fan) {
		// TODO Auto-generated method stub
		System.out.println("High speed state...");
		fan.state=new HighSpeedState();
		
	}
}
class HighSpeedState extends State{
	@Override
	public void changeFanState(GoodFanDemo fan) {
		System.out.println("switch off state...");
		fan.state=new SwitchOffState();
	}
}