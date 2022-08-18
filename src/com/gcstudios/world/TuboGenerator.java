package com.gcstudios.world;

import com.gcstudios.entities.Entity;
import com.gcstudios.entities.Tubo;
import com.gcstudios.main.Game;

public class TuboGenerator {
	
	public int time =0,targetTime = 60;
	
	public void tick() {
		
		time++;
		if(time == 60) {
			
			int altura1 = Entity.rand.nextInt((50 - 30) + 30);
			Tubo tubo1 = new Tubo(Game.WIDTH,0,20,altura1,1,Game.spritesheet.getSprite(36, 162, 18, 18));
			
			Game.entities.add(tubo1);
			
			int altura2 = Entity.rand.nextInt((50 - 30) + 30);
			Tubo tubo2 = new Tubo(Game.WIDTH,Game.HEIGHT - altura2 ,20,altura2,1,Game.spritesheet.getSprite(18, 0, 18, 18));
			
			Game.entities.add(tubo2);
			time = 0;
		}
		
	}
	
}
