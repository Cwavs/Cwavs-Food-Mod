package cwavs.foodmod.food;

import cwavs.foodmod.FoodMod;
import cwavs.foodmod.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FoodStuffs {
public static Item oatie_biscuit;
	
	public static void init() 
	{
		oatie_biscuit = new ItemFood(20, 20F, true).setUnlocalizedName("oatie_biscuit").setCreativeTab(FoodMod.tabFoodStuffs);
	}
	public static void register()
	{
		GameRegistry.registerItem(oatie_biscuit, oatie_biscuit.getUnlocalizedName().substring(5));
	}
	public static void registerRenders()
	{
		registerRender (oatie_biscuit);
	}
	
	public static void registerRender (Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
