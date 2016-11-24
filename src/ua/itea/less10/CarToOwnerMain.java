package ua.itea.less10;

public class CarToOwnerMain {

	public static void main(String[] args) {
		//Owner owner = new Owner("Vitaleg");
		Owner owner = new Owner("Vitaleg's wife");
		Car car = new Car("BMW","X5",owner);
		car.getInfo();
		
	}

}
