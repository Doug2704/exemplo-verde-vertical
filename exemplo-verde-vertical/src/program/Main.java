package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import domain.Plant;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	Plant p1 = new Plant("p1", 24.0, 80.0);
	Plant p2 = new Plant("p2", 20.0, 60.0);
	Plant p3 = new Plant("p3", 14.0, 40.0);
	Plant p4 = new Plant("p4", 10.0, 60.0);
	Plant p5 = new Plant("p5", 24.0, 90.0);
	Plant p6 = new Plant("p6", 54.0, 100.0);

	List<Plant> plants = new ArrayList<>();
	plants.add(p1);
	plants.add(p2);
	plants.add(p3);
	plants.add(p4);
	plants.add(p5);
	plants.add(p6);

	System.out.print("Temperatura do dia: ");
	double temperature = sc.nextDouble();
	System.out.print("Humidade do solo: ");
	double humidity = sc.nextDouble();

	for (Plant plant : plants) {
	    if ((humidity - 20) > plant.getHumidity() || (temperature + 20) < plant.getTemperature()) {
		System.out.println(plant.getName() + " está em estado crítico");
	    } else if ((humidity - 10) > plant.getHumidity() || (temperature + 10) < plant.getTemperature()) {
		System.out.println(plant.getName() + " está em alerta");
	    } else {
		System.out.println(plant.getName() + " está saudável");

	    }
	}
	sc.close();
    }
}
