package net.mcreator.speedyplane2274toolsplus;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.potion.Potion;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.block.Block;

import java.util.function.Supplier;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

@Mod(modid = speedyplane2274toolsplus.MODID, version = speedyplane2274toolsplus.VERSION)
public class speedyplane2274toolsplus implements IFuelHandler, IWorldGenerator {

	public static final String MODID = "speedyplane2274toolsplus";
	public static final String VERSION = "alpha1.2.0";
	@SidedProxy(clientSide = "net.mcreator.speedyplane2274toolsplus.ClientProxyspeedyplane2274toolsplus", serverSide = "net.mcreator.speedyplane2274toolsplus.CommonProxyspeedyplane2274toolsplus")
	public static CommonProxyspeedyplane2274toolsplus proxy;
	@Instance(MODID)
	public static speedyplane2274toolsplus instance;
	public final List<ModElement> elements = new ArrayList<>();
	public final List<Supplier<Block>> blocks = new ArrayList<>();
	public final List<Supplier<Item>> items = new ArrayList<>();
	public final List<Supplier<Biome>> biomes = new ArrayList<>();
	public final List<Supplier<EntityEntry>> entities = new ArrayList<>();
	public final List<Supplier<Potion>> potions = new ArrayList<>();

	public speedyplane2274toolsplus() {
		FluidRegistry.enableUniversalBucket();
		elements.add(new MCreatorRuby(this));
		elements.add(new MCreatorRubyArmourClass(this));
		elements.add(new MCreatorRubyToolClass(this));
		elements.add(new MCreatorRubyAxeClass(this));
		elements.add(new MCreatorRubyOre(this));
		elements.add(new MCreatorOre2Ruby(this));
		elements.add(new MCreatorRubyHelmet(this));
		elements.add(new MCreatorRubyChest(this));
		elements.add(new MCreatorRubyLeggs(this));
		elements.add(new MCreatorRubyFeet(this));
		elements.add(new MCreatorCheckmark(this));
		elements.add(new MCreatorFindARuby(this));
		elements.add(new MCreatorRubyBlock(this));
		elements.add(new MCreatorRubyBlocIN(this));
		elements.add(new MCreatorRubyBlockOut(this));
		elements.add(new MCreatorDiamondFastSmelt(this));
		elements.add(new MCreatorGoldFastSmelt(this));
		elements.add(new MCreatorRedStoneFastSmelt(this));
		elements.add(new MCreatorEmeraldFastSmelt(this));
		elements.add(new MCreatorIronFastSmelt(this));
		elements.add(new MCreatorSlackITEM(this));
		elements.add(new MCreatorSlackFuel(this));
		elements.add(new MCreatorSlackGrid(this));
		elements.add(new MCreatorFurnacePlus(this));
		elements.add(new MCreatorEmeraldArmour(this));
		elements.add(new MCreatorRubyShovel(this));
		elements.add(new MCreatorRubyHoe(this));
		elements.add(new MCreatorEmeraldPickaxe(this));
		elements.add(new MCreatorEmeraldAxe(this));
		elements.add(new MCreatorEmeraldShovel(this));
		elements.add(new MCreatorEmeraldHeo(this));
		elements.add(new MCreatorEmeraldHelm(this));
		elements.add(new MCreatorEmeraldChest(this));
		elements.add(new MCreatorEmeraldLeggs(this));
		elements.add(new MCreatorEmeraldBoots(this));
		elements.add(new MCreatorReinforcedStick(this));
		elements.add(new MCreatorReinforcedStick2x2(this));
		elements.add(new MCreatorRubyPickaxe(this));
		elements.add(new MCreatorRubyAxe(this));
		elements.add(new MCreatorCheckBox(this));
		elements.add(new MCreatorRubyShovelX(this));
		elements.add(new MCreatorRubyHoeX(this));
		elements.add(new MCreatorEmeraldPickAss(this));
		elements.add(new MCreatorEmeraldAxeX(this));
		elements.add(new MCreatorEmeraldShovelX(this));
		elements.add(new MCreatorEmeraldBackHoeRecipe(this));
	}

	@Override
	public int getBurnTime(ItemStack fuel) {
		for (ModElement element : elements) {
			int ret = element.addFuel(fuel);
			if (ret != 0)
				return ret;
		}
		return 0;
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator cg, IChunkProvider cp) {
		elements.forEach(element -> element.generateWorld(random, chunkX * 16, chunkZ * 16, world, world.provider.getDimension(), cg, cp));
	}

	@SubscribeEvent
	public void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(blocks.stream().map(Supplier::get).toArray(Block[]::new));
	}

	@SubscribeEvent
	public void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(items.stream().map(Supplier::get).toArray(Item[]::new));
	}

	@SubscribeEvent
	public void registerBiomes(RegistryEvent.Register<Biome> event) {
		event.getRegistry().registerAll(biomes.stream().map(Supplier::get).toArray(Biome[]::new));
	}

	@SubscribeEvent
	public void registerEntities(RegistryEvent.Register<EntityEntry> event) {
		event.getRegistry().registerAll(entities.stream().map(Supplier::get).toArray(EntityEntry[]::new));
	}

	@SubscribeEvent
	public void registerPotions(RegistryEvent.Register<Potion> event) {
		event.getRegistry().registerAll(potions.stream().map(Supplier::get).toArray(Potion[]::new));
	}

	@SubscribeEvent
	public void registerSounds(RegistryEvent.Register<net.minecraft.util.SoundEvent> event) {
	}

	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public void registerModels(ModelRegistryEvent event) {
		elements.forEach(element -> element.registerModels(event));
	}

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(this);
		GameRegistry.registerFuelHandler(this);
		GameRegistry.registerWorldGenerator(this, 5);
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
		elements.forEach(element -> element.preInit(event));
		proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		elements.forEach(element -> element.init(event));
		proxy.init(event);
	}

	@EventHandler
	public void serverLoad(FMLServerStartingEvent event) {
		elements.forEach(element -> element.serverLoad(event));
	}

	public static class GuiHandler implements IGuiHandler {

		@Override
		public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
			if (id == MCreatorFurnacePlus.GUIID)
				return new MCreatorFurnacePlus.GuiContainerMod(world, x, y, z, player);
			return null;
		}

		@Override
		public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
			if (id == MCreatorFurnacePlus.GUIID)
				return new MCreatorFurnacePlus.GuiWindow(world, x, y, z, player);
			return null;
		}
	}

	public static class ModElement {

		public static speedyplane2274toolsplus instance;

		public ModElement(speedyplane2274toolsplus instance) {
			this.instance = instance;
		}

		public void init(FMLInitializationEvent event) {
		}

		public void preInit(FMLPreInitializationEvent event) {
		}

		public void generateWorld(Random random, int posX, int posZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
		}

		public void serverLoad(FMLServerStartingEvent event) {
		}

		public void registerModels(ModelRegistryEvent event) {
		}

		public int addFuel(ItemStack fuel) {
			return 0;
		}
	}
}
