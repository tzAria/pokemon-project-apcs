package pokemonProj;
import java.util.*;
public class Pokemon {
	public int id;
	public String name;
	public int hp;
	public int attack;
	public int def;
	public int spAtt;
	public int spDef;
	public int speed;
	public int totalStats;
	public boolean isFaint;
	public boolean isActive;
	public boolean isCPU;
	public Pokemon(int id, String name, int hp, int attack, int def, int spAtt, int spDef, int speed, int totalStats, boolean isFaint, boolean isActive, boolean isCPU) {
		this.id = id;
		this.name = name;
		this.hp = hp;
		this.attack = attack;
		this.def = def;
		this.spAtt = spAtt;
		this.spDef = spDef;
		this.speed = speed;
		this.totalStats = totalStats;
		this.isFaint = isFaint;
		this.isActive = isActive;
		this.isCPU = isCPU;
	}
	public String getName() {
		return name;
	}
	public int giveDamage(int attack, int defense, int totalStats) {
		double n = (Math.random() * 1.85 + 0.85);
		int damage = (int) ((((attack / defense) * totalStats) / (250) + 2) * n);
		return damage;
	}
	public int giveSpecialDamage(int spAtt, int spDef, int totalStats) {
		double n = (Math.random() * 1.85 + 0.85);
		int specDamage = (int) ((((spAtt / spDef) * totalStats) / (250) + 5) * n);
		return specDamage;
	}
	public int[] changeStatsNormal(int hp, int attack, int defense) {
		int[] statsAfter = {hp += 2, attack += 2, defense += 2};
		return statsAfter;
	}
	public int[] changeStatsSpecialSubtraction(int spAtt, int spDef) {
		int[] specStatsAfter = {spAtt -= 2, spDef -= 2};
		return specStatsAfter;
	}
	public int changeStatsSpecialAddition(int hp) {
		int hpAfter = hp += 4;
		return hpAfter;
	}
	public int takeDamage(int damage, int hp) {
		int hpAfter = hp - damage;
		if (hpAfter < 0) {
			hpAfter = 0;
		}
		return hpAfter;
	}
	public String useMove(String name) {
		if (name.equals("Swinub")) {
			return "Ice Beam";
		}
		else if (name.equals("Cleffa")) {
			return "Moonblast";
		}
		else if (name.equals("Azurill")) {
			return "Water Gun";
		}
		else if (name.equals("Pineco")) {
			return "Razor Leaf";
		}
		else if (name.equals("Pansear")) {
			return "Ember";
		}
		else {
			return "404";
		}
	}
	public void setActive() {
		isActive = true;
	}
	public void setCPUActive() {
		isCPU = true;
	}
	public void setInActive() {
		isActive = false;
	}
}
