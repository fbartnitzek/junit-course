package ch10.x02MockitoMockingClasses;

public class Ferrari implements Car{

	@Override
	public boolean needsFuel() {
		return true;
	}

	@Override
	public double getEngineTemperature() {
		return 42;
	}

	@Override
	public void driveTo(String destination) {
		System.out.println("drives to italy...");
	}

}
