package com.mygdx.game.Model;

public class DexterityDesignation implements Designation {
	public DexterityDesignation(Player player) {
		changeAttributes(player);
	}
	@Override
	public void changeAttributes(Player player) {
		// TODO Auto-generated method stub
		player.setAtributes("Good with bows!");
	}
}
