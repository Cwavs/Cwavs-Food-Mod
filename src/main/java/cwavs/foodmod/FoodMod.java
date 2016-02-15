package cwavs.foodmod;

import cwavs.foodmod.food.FoodStuffs;
import cwavs.foodmod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class FoodMod {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final FoodStuffsTab tabFoodStuffs = new FoodStuffsTab("tabFoodStuffs");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		FoodStuffs.init();
		FoodStuffs.register();
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		proxy.registerRenders();
		proxy.Crafting();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
