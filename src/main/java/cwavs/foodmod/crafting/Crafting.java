package cwavs.foodmod.crafting;

import cwavs.foodmod.food.FoodStuffs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Crafting {

	public static void initCrafting() {

		GameRegistry.addRecipe(new ItemStack(FoodStuffs.oatie_biscuit),"www", "w w", "www", 'w', Items.wheat);
		
	}
	
	
	
}
