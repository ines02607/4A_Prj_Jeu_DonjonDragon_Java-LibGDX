package com.mygdx.game;

public class Bow extends Weapon {

	@Override
	public void increaseAtribute(Player player) {
		// TODO Auto-generated method stub
		if(player.getDesignation().getClass().getName() == DexterityDesignation.class.getName()) {
			player.increaseAttackBonus(this.getPower());
		}
	}

	@Override
	public void decreaseAtribute(Player player) {
		// TODO Auto-generated method stub
		if(player.getDesignation().getClass().getName() == DexterityDesignation.class.getName()) {
			player.decreaseAttackBonus(this.getPower());
		}
	}

}
