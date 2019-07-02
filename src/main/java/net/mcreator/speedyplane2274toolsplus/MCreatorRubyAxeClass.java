package net.mcreator.speedyplane2274toolsplus;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemTool;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.init.Blocks;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.Block;

import java.util.Set;

import com.google.common.collect.Sets;

public class MCreatorRubyAxeClass extends speedyplane2274toolsplus.ModElement {

	@GameRegistry.ObjectHolder("speedyplane2274toolsplus:rubyaxeclass")
	public static final Item block = null;

	public MCreatorRubyAxeClass(speedyplane2274toolsplus instance) {
		super(instance);
		instance.items.add(() -> new ItemToolCustom() {
		}.setUnlocalizedName("rubyaxeclass").setRegistryName("rubyaxeclass").setCreativeTab(MCreatorToolsPlus.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("speedyplane2274toolsplus:rubyaxeclass", "inventory"));
	}

	private static class ItemToolCustom extends ItemTool {

		private static final Set<Block> EFFECTIVE_ON = com.google.common.collect.Sets.newHashSet(new Block[]{Blocks.PLANKS, Blocks.BOOKSHELF,
				Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON,
				Blocks.WOODEN_PRESSURE_PLATE});

		protected ItemToolCustom() {
			super(EnumHelper.addToolMaterial("RUBYAXECLASS", 2, 456, 5.5f, 5f, 5), EFFECTIVE_ON);
			this.attackDamage = 5f;
			this.attackSpeed = -3.1F;
		}

		@Override
		public float getDestroySpeed(ItemStack stack, IBlockState state) {
			Material material = state.getMaterial();
			return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE
					? super.getDestroySpeed(stack, state)
					: this.efficiency;
		}
	}
}
