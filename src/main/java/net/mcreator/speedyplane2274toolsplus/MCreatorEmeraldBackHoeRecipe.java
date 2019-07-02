package net.mcreator.speedyplane2274toolsplus;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

public class MCreatorEmeraldBackHoeRecipe extends speedyplane2274toolsplus.ModElement {

	public MCreatorEmeraldBackHoeRecipe(speedyplane2274toolsplus instance) {
		super(instance);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(Blocks.BEDROCK, (int) (1)), new ItemStack(MCreatorEmeraldHeo.block, (int) (1)), 1F);
	}
}
