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

public class MCreatorEmeraldArmour extends speedyplane2274toolsplus.ModElement {

	@GameRegistry.ObjectHolder("speedyplane2274toolsplus:emeraldarmourhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("speedyplane2274toolsplus:emeraldarmourbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("speedyplane2274toolsplus:emeraldarmourlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("speedyplane2274toolsplus:emeraldarmourboots")
	public static final Item boots = null;

	public MCreatorEmeraldArmour(speedyplane2274toolsplus instance) {
		super(instance);
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("EMERALDARMOUR", "speedyplane2274toolsplus:emerald_texture", 26, new int[]{6, 7,
				8, 4}, 13, null, 0f);
		instance.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("emeraldarmourhelmet")
				.setRegistryName("emeraldarmourhelmet").setCreativeTab(MCreatorToolsPlus.tab));
		instance.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("emeraldarmourbody")
				.setRegistryName("emeraldarmourbody").setCreativeTab(MCreatorToolsPlus.tab));
		instance.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("emeraldarmourlegs")
				.setRegistryName("emeraldarmourlegs").setCreativeTab(MCreatorToolsPlus.tab));
		instance.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("emeraldarmourboots")
				.setRegistryName("emeraldarmourboots").setCreativeTab(MCreatorToolsPlus.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("speedyplane2274toolsplus:emeraldarmourhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("speedyplane2274toolsplus:emeraldarmourbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("speedyplane2274toolsplus:emeraldarmourlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("speedyplane2274toolsplus:emeraldarmourboots", "inventory"));
	}
}
