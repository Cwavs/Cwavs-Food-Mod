package cwavs.foodmod.proxy;

import cwavs.foodmod.crafting.Crafting;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

public class CommonProxy {
	
	public void registerRenders()
	{
		
	}
	public void Crafting() {
		Crafting.initCrafting();
	}

}
