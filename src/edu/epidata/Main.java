package edu.epidata;

import edu.epidata.Game.order;

public class Main 
{
	public static void main(String[] args) 
	{
		Game game = new Game();
		
		game.CreateCharacter("Scott", "Ant-Man", true);
		game.CreateCharacter("Arthur Curry", "Aquaman", true);
		game.CreateCharacter("T'Challa", "Black Panther", true);
		game.CreateCharacter("Carol Danvers", "Captain Marvel", true);
		game.CreateCharacter("Steve Rogers", "Captain America", true);
		game.CreateCharacter("Stephen", "Doctor Strange", true);
		game.CreateCharacter("Kohtaro Minami", "Kamen Rider Black", true);
		game.CreateCharacter("Kohtaro Minami", "Kamen Rider Black RX", true);
		game.CreateCharacter("Clark Kent", "Superman", true);
		game.CreateCharacter("Peter Parker", "Spider-Man", true);
		game.CreateCharacter("Shin Hayata", "Ultraman", true);
		game.CreateCharacter("Space Sheriff Gavan", "Gavan", true);
		game.CreateCharacter("Bruce Wayne", "Batman", true);
		game.CreateCharacter("Gojira", "Gojira", true);
		
		game.CreateCharacter("Erik Lensherr", "Magneto", false);
		game.CreateCharacter("Wilson Grant Fisk", "Kingpin", false);
		game.CreateCharacter("Slade Joseph Wilson", "Deathstroke", false);
		game.CreateCharacter("Oroku Saki", "Shredder", false);
		game.CreateCharacter("King Ghidora", "King Ghidorah", false);
		game.CreateCharacter("Ambassador Hell", "Garagaranda", false);
		game.CreateCharacter("Godzilla", "Godzilla", false);
		
		game.Fight("Gojira", "King Ghidorah", "Strength","Resistance","Speed");
		game.WhoBeat("Kamen Rider Black","Speed");
		
		
		
	}
}
