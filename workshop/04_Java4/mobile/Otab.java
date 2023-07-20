package mobile;

public class Otab extends Mobile{

	public Otab() {}

	public Otab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}

	@Override
	public int operate(int time) {
		int battery = getBatterySize() - time*12;
		setBatterySize(battery);
		return battery;
	}

	@Override
	public int charge(int time) {
		int battery = getBatterySize() + time*8;
		setBatterySize(battery);
		return battery;
	}
	
}
