package mobile;

public class Ltab extends Mobile{
	
	public Ltab() {}
	
	public Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}

	@Override
	public int operate(int time) {
		int battery = getBatterySize() - time*10;
		setBatterySize(battery);
		return battery;
	}

	@Override
	public int charge(int time) {
		int battery = getBatterySize() + time*10;
		setBatterySize(battery);
		return battery;
		}
	
}
