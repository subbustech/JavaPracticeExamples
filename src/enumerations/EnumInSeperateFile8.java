package enumerations;

public enum EnumInSeperateFile8 {
	SPRINT(10), WINTER(20), SUMMER(30), FALL(40);
	
	public int value;
	private EnumInSeperateFile8(int value){
		this.value = value;
	}
}
