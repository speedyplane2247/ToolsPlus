package net.mcreator.speedyplane2274toolsplus;

import net.minecraft.item.ItemStack;

public class MCreatorSlackFuel extends speedyplane2274toolsplus.ModElement {

	public MCreatorSlackFuel(speedyplane2274toolsplus instance) {
		super(instance);
	}

	@Override
	public int addFuel(ItemStack fuel) {
		if (fuel.getItem() == new ItemStack(MCreatorSlackITEM.block, (int) (1)).getItem())
			return 200;
		return 0;
	}
}
