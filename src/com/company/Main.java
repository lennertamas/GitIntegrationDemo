package com.company;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Hello");

	    Zoo zoo = new Zoo();

	    zoo.animals.add(new Zebra(4));
	    zoo.animals.add(new Zebra(6));
	    zoo.animals.add(new Snake());

	    zoo.showAnimals();
    }
}
