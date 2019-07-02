package net.mcreator.speedyplane2274toolsplus;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

public class MCreatorOre2Ruby extends speedyplane2274toolsplus.ModElement {

	public MCreatorOre2Ruby(speedyplane2274toolsplus instance) {
		super(instance);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorRubyOre.block, (int) (1)), new ItemStack(MCreatorRuby.block, (int) (2)), 1F);
	}
}
