
import java.util.*;

public class Pokemon {
	private String name;
	private float weight;
	private float stepLength;
	private int step;
//	private float gainingWeightStep;
	private int energy;
	private String[] types;

	public Pokemon(String name,
		       float weight,
		       float stepLength,
		       String[] types){
		this.name = name;
		this.weight = weight;
		this.stepLength = stepLength;
		energy = 100;
//		this.gainingWeightStep = gainingWeightStep;
		step = 0;

		if(types == null)
			this.types = new String[] {"normal","no element"};
		else
			this.types = types;
	}
	public String getName() {
		return name;
	}

	public void walk(){
		if(energy>5) {
			step += 1;
			weight -= 0.5;
		}else {
			System.out.println(name + "needs more energy to walk.");
		}
		
	}
	public void run() {
		if(energy>20) {
			step += 25;
			weight -= 5;
		}else {
			System.out.println(name + "needs more energy to run.");
		}
		
	}

	public void eat(String item){
		if(item.equals("chocolate")) {
			System.out.println(name + " ate chocolate.");
			energy +=15;
			weight += 2;
		}else if(item.equals("cheese")) {
			System.out.println(name + " ate cheese.");
			energy += 30;
			weight +=2;
		}
		
	}
	public void exercise() {
		while(energy>40) {
			run();
		}
	}
	public void showWeight() {
		System.out.println(name + "'s weight is "+ weight);
	}
	
	public void showType() {
		System.out.println(name + "'s type is "+ types[0] +" and element is "+ types[1]);
	}

	public void print(){
		System.out.println("Pokemon name: " + name);
 		System.out.print("        Type: ");
		for(String type: types){
			System.out.print(type+",");
		}
		System.out.println();
		System.out.println("      Weight: " + weight);
		System.out.println(" Step length: " + stepLength);
		System.out.println("  Today Step: " + step);
		System.out.println("      Energy: " + energy);
		System.out.println("------------------------------------------");
	}

}
