package net.mcreator.speedyplane2274toolsplus;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

public class MCreatorRubyArmourClass extends speedyplane2274toolsplus.ModElement {

	@GameRegistry.ObjectHolder("speedyplane2274toolsplus:rubyarmourclasshelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("speedyplane2274toolsplus:rubyarmourclassbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("speedyplane2274toolsplus:rubyarmourclasslegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("speedyplane2274toolsplus:rubyarmourclassboots")
	public static final Item boots = null;

	public MCreatorRubyArmourClass(speedyplane2274toolsplus instance) {
		super(instance);
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("RUBYARMOURCLASS", "speedyplane2274toolsplus:ruby_new", 25,
				new int[]{5, 7, 8, 4}, 10, null, 1.8f);
		instance.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("rubyarmourclasshelmet")
				.setRegistryName("rubyarmourclasshelmet").setCreativeTab(MCreatorToolsPlus.tab));
		instance.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("rubyarmourclassbody")
				.setRegistryName("rubyarmourclassbody").setCreativeTab(MCreatorToolsPlus.tab));
		instance.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("rubyarmourclasslegs")
				.setRegistryName("rubyarmourclasslegs").setCreativeTab(MCreatorToolsPlus.tab));
		instance.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("rubyarmourclassboots")
				.setRegistryName("rubyarmourclassboots").setCreativeTab(MCreatorToolsPlus.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0,
				new ModelResourceLocation("speedyplane2274toolsplus:rubyarmourclasshelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("speedyplane2274toolsplus:rubyarmourclassbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("speedyplane2274toolsplus:rubyarmourclasslegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("speedyplane2274toolsplus:rubyarmourclassboots", "inventory"));
	}
}
