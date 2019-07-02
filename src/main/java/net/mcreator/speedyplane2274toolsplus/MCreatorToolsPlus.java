package net.mcreator.speedyplane2274toolsplus;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

public class MCreatorToolsPlus extends speedyplane2274toolsplus.ModElement {

	public MCreatorToolsPlus(speedyplane2274toolsplus instance) {
		super(instance);
	}

	public static CreativeTabs tab = new CreativeTabs("tabtoolsplus") {

		@SideOnly(Side.CLIENT)
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(MCreatorCheckmark.block, (int) (1));
		}

		@SideOnly(Side.CLIENT)
		public boolean hasSearchBar() {
			return false;
		}
	};
}
