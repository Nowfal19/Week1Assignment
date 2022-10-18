package week3.day1;

public class MyVehicle {
public static void main(String[] args) {
	Car c = new Car();
    c.applyBrake();
    c.onAC();
   
    
    Bmw b = new Bmw();
    b.autoPark();
    
    Bajaj ba = new Bajaj();
    ba.autoMeter();
    
    Auto a = new Auto();
    a.handStarter();
    
    Audi au = new Audi();
    au.hybridFuelTech();
    
    System.out.println("----------------------------------------------------------------");
    au.applyBrake();
    c.applyBrake();
    
    
}
}
