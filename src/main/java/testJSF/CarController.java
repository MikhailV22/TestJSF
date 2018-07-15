package testJSF;

import java.io.Serializable;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import Entity.Car;

@Named
@SessionScoped

public class CarController implements Serializable{
	private ArrayList<Car> cars = new ArrayList<>();
	
	public void generateCars() {
		cars.add(new Car(Long.valueOf(1),"TOYOTA","CAMRY", Integer.valueOf(2010),"white"));
		cars.add(new Car(Long.valueOf(2),"TOYOTA","COROLLA", Integer.valueOf(2013),"Red"));
		cars.add(new Car(Long.valueOf(3),"HONDA","CIVIC", Integer.valueOf(2009),"blue"));
		cars.add(new Car(Long.valueOf(4),"HONDA","ACCORD", Integer.valueOf(2015),"silver"));
		cars.add(new Car(Long.valueOf(5),"MAZDA","3", Integer.valueOf(2005)," red "));  // with lowercase and spaces
		
	}
	
	@PostConstruct
	private void init() {
		generateCars();
	}

	public ArrayList<Car> getCars() {
		return cars;
	}

	public void setCars(ArrayList<Car> cars) {
		this.cars = cars;
	}
	
	

}
