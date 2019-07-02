package net.mcreator.speedyplane2274toolsplus;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import java.util.Set;
import java.util.HashMap;

public class MCreatorEmeraldShovel extends speedyplane2274toolsplus.ModElement {

	@GameRegistry.ObjectHolder("speedyplane2274toolsplus:emeraldshovel")
	public static final Item block = null;

	public MCreatorEmeraldShovel(speedyplane2274toolsplus instance) {
		super(instance);
		instance.items.add(() -> new ItemSpade(EnumHelper.addToolMaterial("EMERALDSHOVEL", 1, 369, 6.5f, 5f, 2)) {

			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("spade", 1);
				return ret.keySet();
			}
		}.setUnlocalizedName("emeraldshovel").setRegistryName("emeraldshovel").setCreativeTab(MCreatorToolsPlus.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("speedyplane2274toolsplus:emeraldshovel", "inventory"));
	}
}
