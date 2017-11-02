package com.legobmw99.feruchemy.items.bands;

import com.legobmw99.feruchemy.items.AbstractItemBand;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

public class IronBand extends AbstractItemBand {

	public IronBand() {
		super("iron_band", 1000);
	}

	@Override
	protected void stopEffect(EntityLivingBase player) {
		player.setNoGravity(false);
	}

	@Override
	protected void bandDrainEffects(ItemStack stack, EntityLivingBase player, byte power) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void bandFillEffects(ItemStack stack, EntityLivingBase player, byte power) {
		// TODO Auto-generated method stub
		
	}
}
