package br.ufc.poo.misto.modelo;

public class Tamagoshi {
	
	private	int energy, hungry, clean;
	private	int diamonds;
	private	int age;
	private	boolean alive;
	private int energyMax;
	private int hungryMax;
	private int cleanMax;
	
	public int getEnergy() {
		return this.energy;
	}
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	public int getHungry() {
		return this.hungry;
	}
	public void setHungry(int hungry) {
		this.hungry = hungry;
	}
	public int getClean() {
		return this.clean;
	}
	public void setClean(int clean) {
		this.clean = clean;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getDiamonds() {
		return this.diamonds;
	}
	public void setDiamonds(int diamonds) {
		this.diamonds = diamonds;
	}
	public boolean getAlive() {
		return this.alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
	public Tamagoshi() {
		this.energyMax = 20;
		this.hungryMax = 10;
		this.cleanMax = 15;
	}
	
	public void inicializar() {
		this.energy = energyMax;
		setEnergy(energy);
		this.clean = cleanMax;
		setClean(clean);
		this.hungry = hungryMax;
		setHungry(hungry);
		
	}
	
	public void eat() {
		this.energy -= 1;
		setEnergy(energy);
		this.hungry += 4;
		setHungry(hungry);
		this.clean -= 2;
		setClean(clean);
		this.diamonds += 0;
		setDiamonds(diamonds);
		this.age += 1;
		setAge(age);
		
		if(hungry >= hungryMax)
			this.hungry = hungryMax;
		
		if( energy <= 0 && clean <= 0 && hungry <= 0 ) {
			this.energy = 0;
			this.clean = 0;
			this.hungry = 0;
			this.alive = false;
			setAlive(alive);
			System.out.println(this.toString());
			System.out.println("Morreu, que peninha");
			System.exit(0);
		}
		if( energy <= 0 && clean <= 0 ) {
			this.energy = 0;
			this.clean = 0;
			this.alive = false;
			setAlive(alive);
			System.out.println(this.toString());
			System.out.println("Morreu, que peninha");
			System.exit(0);
		}
		if( energy <= 0 && hungry <= 0 ) {
			this.energy = 0;
			this.hungry = 0;
			this.alive = false;
			setAlive(alive);
			System.out.println(this.toString());
			System.out.println("Morreu, que peninha");
			System.exit(0);
		}
		if( clean <= 0 && hungry <= 0 ) {
			this.hungry = 0;
			this.clean = 0;
			this.alive = false;
			setAlive(alive);
			System.out.println(this.toString());
			System.out.println("Morreu, que peninha");
			System.exit(0);
		}
		if( energy <= 0 ) {
			this.energy = 0;
			this.alive = false;
			setAlive(alive);
			System.out.println(this.toString());
			System.out.println("Morreu, que peninha");
			System.exit(0);
		}
		if( clean <= 0 ) {
			this.clean = 0;
			this.alive = false;
			setAlive(alive);
			System.out.println(this.toString());
			System.out.println("Morreu, que peninha");
			System.exit(0);
		}
		if( hungry <= 0 ) {
			this.hungry = 0;
			this.alive = false;
			setAlive(alive);
			System.out.println(this.toString());
			System.out.println("Morreu, que peninha");
			System.exit(0);
		}
	}
	public void shower() {
		this.energy -= 3;
		setEnergy(energy);
		this.hungry -= 1;
		setHungry(hungry);
		this.clean = this.cleanMax;
		setClean(clean);
		this.diamonds += 0;
		setDiamonds(diamonds);
		this.age += 2;
		setAge(age);
		
		if( energy <= 0 && clean <= 0 && hungry <= 0 ) {
			this.energy = 0;
			this.clean = 0;
			this.hungry = 0;
			this.alive = false;
			setAlive(alive);
			System.out.println(this.toString());
			System.out.println("Morreu, que peninha");
			System.exit(0);
		}
		if( energy <= 0 && clean <= 0 ) {
			this.energy = 0;
			this.clean = 0;
			this.alive = false;
			setAlive(alive);
			System.out.println(this.toString());
			System.out.println("Morreu, que peninha");
			System.exit(0);
		}
		if( energy <= 0 && hungry <= 0 ) {
			this.energy = 0;
			this.hungry = 0;
			this.alive = false;
			setAlive(alive);
			System.out.println(this.toString());
			System.out.println("Morreu, que peninha");
			System.exit(0);
		}
		if( clean <= 0 && hungry <= 0 ) {
			this.hungry = 0;
			this.clean = 0;
			this.alive = false;
			setAlive(alive);
			System.out.println(this.toString());
			System.out.println("Morreu, que peninha");
			System.exit(0);
		}
		if( energy <= 0 ) {
			this.energy = 0;
			this.alive = false;
			setAlive(alive);
			System.out.println(this.toString());
			System.out.println("Morreu, que peninha");
			System.exit(0);
		}
		if( clean <= 0 ) {
			this.clean = 0;
			this.alive = false;
			setAlive(alive);
			System.out.println(this.toString());
			System.out.println("Morreu, que peninha");
			System.exit(0);
		}
		if( hungry <= 0 ) {
			this.hungry = 0;
			this.alive = false;
			setAlive(alive);
			System.out.println(this.toString());
			System.out.println("Morreu, que peninha");
			System.exit(0);
		}
	}
	public void play() {
		this.energy -= 2;
		setEnergy(energy);
		this.hungry -= 1;
		setHungry(hungry);
		this.clean -= 3;
		setClean(clean);
		this.diamonds += 1;
		setDiamonds(diamonds);
		this.age += 1;
		setAge(age);
		
		if( energy <= 0 && clean <= 0 && hungry <= 0 ) {
			this.energy = 0;
			this.clean = 0;
			this.hungry = 0;
			this.alive = false;
			setAlive(alive);
			System.out.println(this.toString());
			System.out.println("Morreu, que peninha");
			System.exit(0);
		}
		if( energy <= 0 && clean <= 0 ) {
			this.energy = 0;
			this.clean = 0;
			this.alive = false;
			setAlive(alive);
			System.out.println(this.toString());
			System.out.println("Morreu, que peninha");
			System.exit(0);
		}
		if( energy <= 0 && hungry <= 0 ) {
			this.energy = 0;
			this.hungry = 0;
			this.alive = false;
			setAlive(alive);
			System.out.println(this.toString());
			System.out.println("Morreu, que peninha");
			System.exit(0);
		}
		if( clean <= 0 && hungry <= 0 ) {
			this.hungry = 0;
			this.clean = 0;
			this.alive = false;
			setAlive(alive);
			System.out.println(this.toString());
			System.out.println("Morreu, que peninha");
			System.exit(0);
		}
		if( energy <= 0 ) {
			this.energy = 0;
			this.alive = false;
			setAlive(alive);
			System.out.println(this.toString());
			System.out.println("Morreu, que peninha");
			System.exit(0);
		}
		if( clean <= 0 ) {
			this.clean = 0;
			this.alive = false;
			setAlive(alive);
			System.out.println(this.toString());
			System.out.println("Morreu, que peninha");
			System.exit(0);
		}
		if( hungry <= 0 ) {
			this.hungry = 0;
			this.alive = false;
			setAlive(alive);
			System.out.println(this.toString());
			System.out.println("Morreu, que peninha");
			System.exit(0);
		}
	}
	public void sleep() {
		int turno = 0;
		turno = energyMax - energy;	
		this.energy = this.energyMax;
		setEnergy(energy);
		this.age += turno;
		setAge(age);
	}
	public String toString() {
		String atributo;
		
		atributo = "Energy: "+this.energy+" | ";
		atributo += "Clean: "+this.clean+" | ";
		atributo += "Hungry: "+this.hungry+" | ";
		atributo += "Diamonds: "+this.diamonds+" | ";
		atributo += "Age: "+this.age+"\n";
		
		return atributo;
	}
}
