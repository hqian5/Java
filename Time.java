package zoo;

public abstract class Time {
	public abstract int getMinutes();
	public int getSeconds() {
		return getMinutes() * 60;
	}
}
