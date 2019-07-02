package net.mcreator.speedyplane2274toolsplus;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.client.model.obj.OBJLoader;

public class ClientProxyspeedyplane2274toolsplus extends CommonProxyspeedyplane2274toolsplus {

	@Override
	public void init(FMLInitializationEvent event) {
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		OBJLoader.INSTANCE.addDomain("speedyplane2274toolsplus");
	}
}
