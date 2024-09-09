package com.ridesharing;

public class Client {
	 public static void main(String[] args) {
	        
	        UserAuthentication userAuth = UserAuthentication.getInstance();
	        userAuth.authenticateUser("Sahi");

	        
	        Vehicle car = Vehicle.createVehicle("Car");
	        car.ride();

	        Vehicle bike = Vehicle.createVehicle("Scooty");
	        bike.ride();

	        
	        PaymentMethod creditCard = PaymentMethod.createPaymentMethod("Credit Card");
	        creditCard.pay(200);

	        PaymentMethod payTM = PaymentMethod.createPaymentMethod("PayTM");
	        payTM.pay(150);
	    }

}
