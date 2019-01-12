package pokemonProj;
import java.io.File;
import java.util.*;

import javafx.application.Application;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.embed.swing.JFXPanel;
public class Main {

	
	public static void main(String[] args) {
		final JFXPanel fxPanel = new JFXPanel();
		String battleTheme = "battleTheme.mp3";
		Media hit = new Media(new File(battleTheme).toURI().toString());
		MediaPlayer mediaPlayer = new MediaPlayer(hit);
		mediaPlayer.play();
		
		//create all pokemon: swinub, cleffa, azurill, pineco, pansear
		Pokemon swinub = new Pokemon(220, "Swinub", 50, 50, 40, 30, 30, 50, 250, false, false, false);
		Pokemon cleffa = new Pokemon(173, "Cleffa", 50, 25, 28, 45, 55, 15, 218, false, false, false);
		Pokemon azurill = new Pokemon(298, "Azurill", 50, 20, 40, 20, 40, 20, 190, false, false, false);
		Pokemon pineco = new Pokemon(204, "Pineco", 50, 65, 90, 35, 35, 15, 290, false, false, false);
		Pokemon pansear = new Pokemon(513, "Pansear", 50, 53, 48, 53, 48, 64, 316, false, false, false);
		ArrayList<Pokemon> pokemonList = new ArrayList<Pokemon>();
		ArrayList<Pokemon> activeList = new ArrayList<Pokemon>();
		pokemonList.add(swinub);
		pokemonList.add(cleffa);
		pokemonList.add(azurill);
		pokemonList.add(pineco);
		pokemonList.add(pansear);
		System.out.println("                                  ,'\\\r\n" + 
				"    _.----.        ____         ,'  _\\   ___    ___     ____\r\n" + 
				"_,-'       `.     |    |  /`.   \\,-'    |   \\  /   |   |    \\  |`.\r\n" + 
				"\\      __    \\    '-.  | /   `.  ___    |    \\/    |   '-.   \\ |  |\r\n" + 
				" \\.    \\ \\   |  __  |  |/    ,','_  `.  |          | __  |    \\|  |\r\n" + 
				"   \\    \\/   /,' _`.|      ,' / / / /   |          ,' _`.|     |  |\r\n" + 
				"    \\     ,-'/  /   \\    ,'   | \\/ / ,`.|         /  /   \\  |     |\r\n" + 
				"     \\    \\ |   \\_/  |   `-.  \\    `'  /|  |    ||   \\_/  | |\\    |\r\n" + 
				"      \\    \\ \\      /       `-.`.___,-' |  |\\  /| \\      /  | |   |\r\n" + 
				"       \\    \\ `.__,'|  |`-._    `|      |__| \\/ |  `.__,'|  | |   |\r\n" + 
				"        \\_.-'       |__|    `-._ |              '-.|     '-.| |   |\r\n" + 
				"                                `'                            '-._|\r\n" +
				"                              APCS VERSION                               ");
		System.out.println();
		System.out.println("Battle start! For extra atmosphere please open this link in the background: https://www.youtube.com/watch?v=bIlomr9Guas");
		Scanner console = new Scanner(System.in);
		System.out.println("Which pokemon do you choose? Your choices are (case sensitive!): "  + swinub.getName() + ", " + cleffa.getName() + ", " + azurill.getName() + ", " + pineco.getName() + ", " + pansear.getName());
		String playerPokemonChoice = console.nextLine();
		if(playerPokemonChoice.equals("Swinub")) {
			pokemonList.remove(swinub);
			activeList.add(swinub);
			swinub.setActive();
		}
		else if(playerPokemonChoice.equals("Cleffa")) {
			pokemonList.remove(cleffa);
			activeList.add(cleffa);
			cleffa.setActive();
		}
		else if(playerPokemonChoice.equals("Azurill")) {
			pokemonList.remove(azurill);
			activeList.add(azurill);
			azurill.setActive();
		}
		else if(playerPokemonChoice.equals("Pineco")) {
			pokemonList.remove(pineco);
			activeList.add(pineco);
			pineco.setActive();
		}
		else if(playerPokemonChoice.equals("Pansear")) {
			pokemonList.remove(pansear);
			activeList.add(pansear);
			pansear.setActive();
		}
		int range = 4;     
	    int cpuChoiceIndex = (int)(Math.random() * range) + 0;
	    if(cpuChoiceIndex == 0) {
	    	pokemonList.get(0).setCPUActive();
	    	System.out.println("CPU has chosen " + pokemonList.get(0).getName());
	    	activeList.add(pokemonList.get(0));
	    	pokemonList.remove(0);
	    }
	    else if (cpuChoiceIndex == 1) {
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
	    battle(activeList);
	    if(activeList.get(0).isCPU) {
	    	System.out.println("Your Pokemon fainted! Pick another! Your choices are (case sensitive!): " + pokemonList.get(0).name + ", " + pokemonList.get(1).name + ", " + pokemonList.get(2).name);
	    	Scanner console2 = new Scanner(System.in);
	    	String playerPokemonChoice2 = console.nextLine();
	    	if (playerPokemonChoice2.equals(pokemonList.get(0).getName())) {
	    		activeList.add(pokemonList.get(0));
	    		pokemonList.remove(0);
	    	}
	    	else if (playerPokemonChoice2.equals(pokemonList.get(1).getName())) {
	    		activeList.add(pokemonList.get(1));
	    		pokemonList.remove(1);
	    	}
	    	else if (playerPokemonChoice2.equals(pokemonList.get(2).getName())) {
	    		activeList.add(pokemonList.get(2));
	    		pokemonList.remove(2);
	    	}
	    	battle(activeList);
	    }
	    else {
	    	System.out.println("\r\n" + 
	    			"   _____  _____   _    _    ______        _____  _   _  _______  ______  _____  \r\n" + 
	    			"  / ____||  __ \\ | |  | |  |  ____|/\\    |_   _|| \\ | ||__   __||  ____||  __ \\ \r\n" + 
	    			" | |     | |__) || |  | |  | |__  /  \\     | |  |  \\| |   | |   | |__   | |  | |\r\n" + 
	    			" | |     |  ___/ | |  | |  |  __|/ /\\ \\    | |  | . ` |   | |   |  __|  | |  | |\r\n" + 
	    			" | |____ | |     | |__| |  | |  / ____ \\  _| |_ | |\\  |   | |   | |____ | |__| |\r\n" + 
	    			"  \\_____||_|      \\____/   |_| /_/    \\_\\|_____||_| \\_|   |_|   |______||_____/ \r\n" + 
	    			"                                                                                \r\n" + 
	    			"                                                                                \r\n" + 
	    			"");
	    	range = 3;     
		    cpuChoiceIndex = (int)(Math.random() * range) + 0;
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
		    battle(activeList);
	    }
		    if(activeList.get(0).isCPU) {
		    	System.out.println("Your Pokemon fainted! Pick another! Your choices are (case sensitive!): " + pokemonList.get(0).name + ", " + pokemonList.get(1).name + ", " + pokemonList.get(2).name);
		    	Scanner console3 = new Scanner(System.in);
		    	String playerPokemonChoice3 = console.nextLine();
		    	if (playerPokemonChoice3.equals(pokemonList.get(0).getName())) {
		    		activeList.add(pokemonList.get(0));
		    		pokemonList.remove(0);
		    	}
		    	else if (playerPokemonChoice3.equals(pokemonList.get(1).getName())) {
		    		activeList.add(pokemonList.get(1));
		    		pokemonList.remove(1);
		    	}
		    	battle(activeList);
		    }
		    else if(activeList.get(0).isActive) {
		    	System.out.println("\r\n" + 
		    			"   _____  _____   _    _    ______        _____  _   _  _______  ______  _____  \r\n" + 
		    			"  / ____||  __ \\ | |  | |  |  ____|/\\    |_   _|| \\ | ||__   __||  ____||  __ \\ \r\n" + 
		    			" | |     | |__) || |  | |  | |__  /  \\     | |  |  \\| |   | |   | |__   | |  | |\r\n" + 
		    			" | |     |  ___/ | |  | |  |  __|/ /\\ \\    | |  | . ` |   | |   |  __|  | |  | |\r\n" + 
		    			" | |____ | |     | |__| |  | |  / ____ \\  _| |_ | |\\  |   | |   | |____ | |__| |\r\n" + 
		    			"  \\_____||_|      \\____/   |_| /_/    \\_\\|_____||_| \\_|   |_|   |______||_____/ \r\n" + 
		    			"                                                                                \r\n" + 
		    			"                                                                                \r\n" + 
		    			"");
		    	range = 2;     
			    cpuChoiceIndex = (int)(Math.random() * range) + 0;
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
			    battle(activeList);
		    }
		    if(activeList.get(0).isCPU) {
		    	System.out.println("Your Pokemon fainted! You sent out " + pokemonList.get(0).getName() + "!");
		    	activeList.add(pokemonList.get(0));
	    		pokemonList.remove(0);
		    }
		    else if(activeList.get(0).isActive) {
		    	System.out.println("\r\n" + 
		    			"   _____  _____   _    _    ______        _____  _   _  _______  ______  _____  \r\n" + 
		    			"  / ____||  __ \\ | |  | |  |  ____|/\\    |_   _|| \\ | ||__   __||  ____||  __ \\ \r\n" + 
		    			" | |     | |__) || |  | |  | |__  /  \\     | |  |  \\| |   | |   | |__   | |  | |\r\n" + 
		    			" | |     |  ___/ | |  | |  |  __|/ /\\ \\    | |  | . ` |   | |   |  __|  | |  | |\r\n" + 
		    			" | |____ | |     | |__| |  | |  / ____ \\  _| |_ | |\\  |   | |   | |____ | |__| |\r\n" + 
		    			"  \\_____||_|      \\____/   |_| /_/    \\_\\|_____||_| \\_|   |_|   |______||_____/ \r\n" + 
		    			"                                                                                \r\n" + 
		    			"                                                                                \r\n" + 
		    			"");
		    	pokemonList.get(0).setCPUActive();
		    	System.out.println("CPU has chosen " + pokemonList.get(0).getName());
		    	activeList.add(pokemonList.get(0));
		    	pokemonList.remove(0);
		    }
		    battle(activeList);
		    mediaPlayer.stop();
		    System.exit(1);
	    }
	
	public static void battle(ArrayList<Pokemon> activeList) {
		while(activeList.size() == 2) {
			int range = 11;
			int specialNumber = (int)(Math.random() * range) + 0;
			if (specialNumber == 10) {
				if (activeList.get(0).speed > activeList.get(1).speed) {
					int damageDone = activeList.get(0).giveSpecialDamage(activeList.get(0).attack, activeList.get(0).def, activeList.get(0).totalStats);
					activeList.get(1).hp = activeList.get(1).takeDamage(damageDone, activeList.get(1).hp);
					System.out.println(activeList.get(0).getName() + " used " + activeList.get(0).useMove(activeList.get(0).getName()) + ", dealing " + damageDone + " special damage.");
					if (activeList.get(1).hp == 0) {
						System.out.println(activeList.get(1).getName() + " fainted!");
						activeList.remove(1);
					}
					else {
						int damageDone2 = activeList.get(1).giveSpecialDamage(activeList.get(1).attack, activeList.get(1).def, activeList.get(1).totalStats);
						activeList.get(0).hp = activeList.get(0).takeDamage(damageDone2, activeList.get(1).hp);
						System.out.println(activeList.get(1).getName() + " used " + activeList.get(1).useMove(activeList.get(1).getName()) + ", dealing " + damageDone2 + " special damage.");
						if (activeList.get(0).hp == 0) {
							System.out.println(activeList.get(0).getName() + " fainted!");
							activeList.remove(0);
						}
					}
				}
				else if (activeList.get(0).speed < activeList.get(1).speed) {
					int damageDone2 = activeList.get(1).giveSpecialDamage(activeList.get(1).attack, activeList.get(1).def, activeList.get(1).totalStats);
					activeList.get(0).hp = activeList.get(0).takeDamage(damageDone2, activeList.get(1).hp);
					System.out.println(activeList.get(1).getName() + " used " + activeList.get(1).useMove(activeList.get(1).getName()) + ", dealing " + damageDone2 + " special damage.");
					if (activeList.get(0).hp == 0) {
						System.out.println(activeList.get(0).getName() + " fainted!");
						activeList.remove(0);
				}
					else {
						int damageDone = activeList.get(0).giveSpecialDamage(activeList.get(0).attack, activeList.get(0).def, activeList.get(0).totalStats);
						activeList.get(1).hp = activeList.get(1).takeDamage(damageDone, activeList.get(1).hp);
						System.out.println(activeList.get(0).getName() + " used " + activeList.get(0).useMove(activeList.get(0).getName()) + ", dealing " + damageDone + " special damage.");
						if (activeList.get(1).hp == 0) {
							System.out.println(activeList.get(1).getName() + " fainted!");
							activeList.remove(1);
						}
					}
				}
				else if (activeList.get(0).speed == activeList.get(1).speed) {
					range = 2;
					int speedTie = (int)(Math.random() * range) + 0;
					if(speedTie == 0) {
						int damageDone = activeList.get(0).giveSpecialDamage(activeList.get(0).attack, activeList.get(0).def, activeList.get(0).totalStats);
						activeList.get(1).hp = activeList.get(1).takeDamage(damageDone, activeList.get(1).hp);
						System.out.println(activeList.get(0).getName() + " used " + activeList.get(0).useMove(activeList.get(0).getName()) + ", dealing " + damageDone + " special damage.");
						if (activeList.get(1).hp == 0) {
							System.out.println(activeList.get(1).getName() + " fainted!");
							activeList.remove(1);
						}
						else {
							int damageDone2 = activeList.get(1).giveSpecialDamage(activeList.get(1).attack, activeList.get(1).def, activeList.get(1).totalStats);
							activeList.get(0).hp = activeList.get(0).takeDamage(damageDone2, activeList.get(1).hp);
							System.out.println(activeList.get(1).getName() + " used " + activeList.get(1).useMove(activeList.get(1).getName()) + ", dealing " + damageDone2 + " special damage.");
							if (activeList.get(0).hp == 0) {
								System.out.println(activeList.get(0).getName() + " fainted!");
								activeList.remove(0);
							}
						}
					}
					else if(speedTie == 1) {
						int damageDone2 = activeList.get(1).giveSpecialDamage(activeList.get(1).attack, activeList.get(1).def, activeList.get(1).totalStats);
						activeList.get(0).hp = activeList.get(0).takeDamage(damageDone2, activeList.get(1).hp);
						System.out.println(activeList.get(1).getName() + " used " + activeList.get(1).useMove(activeList.get(1).getName()) + ", dealing " + damageDone2 + " special damage.");
						if (activeList.get(0).hp == 0) {
							System.out.println(activeList.get(0).getName() + " fainted!");
							activeList.remove(0);
					}
						else {
							int damageDone = activeList.get(0).giveSpecialDamage(activeList.get(0).attack, activeList.get(0).def, activeList.get(0).totalStats);
							activeList.get(1).hp = activeList.get(1).takeDamage(damageDone, activeList.get(1).hp);
							System.out.println(activeList.get(0).getName() + " used " + activeList.get(0).useMove(activeList.get(0).getName()) + ", dealing " + damageDone + " special damage.");
							if (activeList.get(1).hp == 0) {
								System.out.println(activeList.get(1).getName() + " fainted!");
								activeList.remove(1);
							}
						}
					}
				}
			} //special ends here
			else {
				if (activeList.get(0).speed > activeList.get(1).speed) {
					int damageDone = activeList.get(0).giveDamage(activeList.get(0).attack, activeList.get(0).def, activeList.get(0).totalStats);
					activeList.get(1).hp = activeList.get(1).takeDamage(damageDone, activeList.get(1).hp);
					System.out.println(activeList.get(0).getName() + " used " + activeList.get(0).useMove(activeList.get(0).getName()) + ", dealing " + damageDone + " damage.");
					if (activeList.get(1).hp == 0) {
						System.out.println(activeList.get(1).getName() + " fainted!");
						activeList.remove(1);
					}
					else {
						int damageDone2 = activeList.get(1).giveDamage(activeList.get(1).attack, activeList.get(1).def, activeList.get(1).totalStats);
						activeList.get(0).hp = activeList.get(0).takeDamage(damageDone2, activeList.get(1).hp);
						System.out.println(activeList.get(1).getName() + " used " + activeList.get(1).useMove(activeList.get(1).getName()) + ", dealing " + damageDone2 + " damage.");
						if (activeList.get(0).hp == 0) {
							System.out.println(activeList.get(0).getName() + " fainted!");
							activeList.remove(0);
						}
					}
				}
				else if (activeList.get(0).speed < activeList.get(1).speed) {
					int damageDone2 = activeList.get(1).giveDamage(activeList.get(1).attack, activeList.get(1).def, activeList.get(1).totalStats);
					activeList.get(0).hp = activeList.get(0).takeDamage(damageDone2, activeList.get(1).hp);
					System.out.println(activeList.get(1).getName() + " used " + activeList.get(1).useMove(activeList.get(1).getName()) + ", dealing " + damageDone2 + " damage.");
					if (activeList.get(0).hp == 0) {
						System.out.println(activeList.get(0).getName() + " fainted!");
						activeList.remove(0);
				}
					else {
						int damageDone = activeList.get(0).giveDamage(activeList.get(0).attack, activeList.get(0).def, activeList.get(0).totalStats);
						activeList.get(1).hp = activeList.get(1).takeDamage(damageDone, activeList.get(1).hp);
						System.out.println(activeList.get(0).getName() + " used " + activeList.get(0).useMove(activeList.get(0).getName()) + ", dealing " + damageDone + " damage.");
						if (activeList.get(1).hp == 0) {
							System.out.println(activeList.get(1).getName() + " fainted!");
							activeList.remove(1);
						}
					}
				}
				else if (activeList.get(0).speed == activeList.get(1).speed) {
					range = 2;
					int speedTie = (int)(Math.random() * range) + 0;
					if(speedTie == 0) {
						int damageDone = activeList.get(0).giveDamage(activeList.get(0).attack, activeList.get(0).def, activeList.get(0).totalStats);
						activeList.get(1).hp = activeList.get(1).takeDamage(damageDone, activeList.get(1).hp);
						System.out.println(activeList.get(0).getName() + " used " + activeList.get(0).useMove(activeList.get(0).getName()) + ", dealing " + damageDone + " damage.");
						if (activeList.get(1).hp == 0) {
							System.out.println(activeList.get(1).getName() + " fainted!");
							activeList.remove(1);
						}
						else {
							int damageDone2 = activeList.get(1).giveDamage(activeList.get(1).attack, activeList.get(1).def, activeList.get(1).totalStats);
							activeList.get(0).hp = activeList.get(0).takeDamage(damageDone2, activeList.get(1).hp);
							System.out.println(activeList.get(1).getName() + " used " + activeList.get(1).useMove(activeList.get(1).getName()) + ", dealing " + damageDone2 + " damage.");
							if (activeList.get(0).hp == 0) {
								System.out.println(activeList.get(0).getName() + " fainted!");
								activeList.remove(0);
							}
						}
					}
					else if(speedTie == 1) {
						int damageDone2 = activeList.get(1).giveDamage(activeList.get(1).attack, activeList.get(1).def, activeList.get(1).totalStats);
						activeList.get(0).hp = activeList.get(0).takeDamage(damageDone2, activeList.get(1).hp);
						System.out.println(activeList.get(1).getName() + " used " + activeList.get(1).useMove(activeList.get(1).getName()) + ", dealing " + damageDone2 + " damage.");
						if (activeList.get(0).hp == 0) {
							System.out.println(activeList.get(0).getName() + " fainted!");
							activeList.remove(0);
					}
						else {
							int damageDone = activeList.get(0).giveDamage(activeList.get(0).attack, activeList.get(0).def, activeList.get(0).totalStats);
							activeList.get(1).hp = activeList.get(1).takeDamage(damageDone, activeList.get(1).hp);
							System.out.println(activeList.get(0).getName() + " used " + activeList.get(0).useMove(activeList.get(0).getName()) + ", dealing " + damageDone + " damage.");
							if (activeList.get(1).hp == 0) {
								System.out.println(activeList.get(1).getName() + " fainted!");
								activeList.remove(1);
							}
						}
					}
				}
			}
		}
	}
}
