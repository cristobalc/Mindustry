package io.anuke.mindustry.type;

public class Mech extends Upgrade {
	public boolean flying;
	public float mass = 1f;

	public Mech(String name, boolean flying){
		super(name);
		this.flying = flying;
	}
}
