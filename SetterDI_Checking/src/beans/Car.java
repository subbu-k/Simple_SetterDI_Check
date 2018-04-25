package beans;

public class Car {
	
	private String carcarname;
	private Engine engine;
	
	
	public void setcarcarname(String carcarname) {
		this.carcarname = carcarname;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void printData() {
		System.out.println(engine.getModelYear()+":"+carcarname);
	}

}
