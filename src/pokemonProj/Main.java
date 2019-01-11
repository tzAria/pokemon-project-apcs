package pokemonProj;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		//create all pokemon: swinub, cleffa, azurill, pineco, pansear
		Pokemon swinub = new Pokemon(220, "Swinub", 50, 50, 40, 30, 30, 50, 250, false, false, false);
		Pokemon cleffa = new Pokemon(173, "Cleffa", 50, 25, 28, 45, 55, 15, 218, false, false, false);
		Pokemon azurill = new Pokemon(298, "Azurill", 50, 20, 40, 20, 40, 20, 190, false, false, false);
		Pokemon pineco = new Pokemon(204, "Pineco", 50, 65, 90, 35, 35, 15, 290, false, false, false);
		Pokemon pansear = new Pokemon(513, "Pansear", 50, 53, 48, 53, 48, 64, 316, false, false, false);
		ArrayList<Pokemon> pokemonList = new ArrayList<Pokemon>();
		ArrayList<Pokemon> activeList = new ArrayList<Pokemon>();
		ArrayList<Pokemon> faintList = new ArrayList<Pokemon>();
		pokemonList.add(swinub);
		pokemonList.add(cleffa);
		pokemonList.add(azurill);
		pokemonList.add(pineco);
		pokemonList.add(pansear);
		System.out.println("Battle start! For extra atmosphere please open this link in the background: https://www.youtube.com/watch?v=bIlomr9Guas");
		Scanner console = new Scanner(System.in);
		System.out.println("Which pokemon do you choose? Your choices are: "  + swinub.getName() + ", " + cleffa.getName() + ", " + azurill.getName() + ", " + pineco.getName() + ", " + pansear.getName());
		String playerPokemonChoice = console.nextLine();
		if(playerPokemonChoice.equals("Swinub") || playerPokemonChoice.equals("swinub")) {
			pokemonList.remove(swinub);
			activeList.add(swinub);
			swinub.setActive();
		}
		else if(playerPokemonChoice.equals("Cleffa") || playerPokemonChoice.equals("cleffa")) {
			pokemonList.remove(cleffa);
			activeList.add(cleffa);
			cleffa.setActive();
		}
		else if(playerPokemonChoice.equals("Azurill") || playerPokemonChoice.equals("azurill")) {
			pokemonList.remove(azurill);
			activeList.add(azurill);
			azurill.setActive();
		}
		else if(playerPokemonChoice.equals("Pineco") || playerPokemonChoice.equals("pineco")) {
			pokemonList.remove(pineco);
			activeList.add(pineco);
			pineco.setActive();
		}
		else if(playerPokemonChoice.equals("Pansear") || playerPokemonChoice.equals("pansear")) {
			pokemonList.remove(pansear);
			activeList.add(pansear);
			pansear.setActive();
		}
		int range = 4;     
	    int cpuChoiceIndex = (int)(Math.random() * range) + 0;
	    System.out.println(cpuChoiceIndex);
	    if(cpuChoiceIndex == 0) {
	    	pokemonList.get(0).setCPUActive();
	    	System.out.println("CPU has chosen " + pokemonList.get(0).getName());
	    	activeList.add(pokemonList.get(0));
	    	pokemonList.remove(0);
	    }
	    else if(cpuChoiceIndex == 1) {
	    	pokemonList.get(1).setCPUActive();
	    	System.out.println("CPU has chosen " + pokemonList.get(1).getName());
	    	activeList.add(pokemonList.get(1));
	    	pokemonList.remove(1);
	    }
	    else if (cpuChoiceIndex == 2) {
	    	pokemonList.get(2).setCPUActive();
	    	System.out.println("CPU has chosen " + pokemonList.get(2).getName());
	    	activeList.add(pokemonList.get(2));
	    	pokemonList.remove(2);
	    }
	    else if (cpuChoiceIndex == 3) {
	    	pokemonList.get(3).setCPUActive();
	    	System.out.println("CPU has chosen " + pokemonList.get(3).getName());
	    	activeList.add(pokemonList.get(3));
	    	pokemonList.remove(3);
	    }
	}
	public static void battle(ArrayList<Pokemon> activeList) {
		while(activeList.size() == 2) {
		int range = 11;
		int specialNumber = (int)(Math.random() * range) + 0;
		System.out.println(specialNumber);
		if (specialNumber == 10) {
			
		}
		else {
			if (activeList.get(0).speed > activeList.get(1).speed) {
				int damageDone = activeList.get(0).giveDamage(activeList.get(0).attack, activeList.get(0).def, activeList.get(0).totalStats);
				activeList.get(1).takeDamage(damageDone, activeList.get(1).hp);
				if (activeList.get(1).hp == 0) {
					activeList.remove(1);
				}
				else {
					int damageDone2 = activeList.get(1).giveDamage(activeList.get(1).attack, activeList.get(1).def, activeList.get(1).totalStats);
					activeList.get(0).takeDamage(damageDone2, activeList.get(1).hp);
					if (activeList.get(0).hp == 0) {
						activeList.remove(0);
					}
				}
			}
			else if ( activeList.get(0).speed < activeList.get(1).speed) {
				int damageDone2 = activeList.get(1).giveDamage(activeList.get(1).attack, activeList.get(1).def, activeList.get(1).totalStats);
				activeList.get(0).takeDamage(damageDone2, activeList.get(1).hp);
				if (activeList.get(0).hp == 0) {
					activeList.remove(0);
			}
				else {
					int damageDone = activeList.get(0).giveDamage(activeList.get(0).attack, activeList.get(0).def, activeList.get(0).totalStats);
					activeList.get(1).takeDamage(damageDone, activeList.get(1).hp);
					if (activeList.get(1).hp == 0) {
						activeList.remove(1);
					}
				}
		}
	}
}
}
}
