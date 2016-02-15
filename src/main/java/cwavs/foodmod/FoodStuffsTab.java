package cwavs.foodmod;

import cwavs.foodmod.food.FoodStuffs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class FoodStuffsTab extends CreativeTabs{

	public FoodStuffsTab(String arg0) {
		super(arg0);
		this.setBackgroundImageName("SonicScrewdriver.png");
	}

	@Override
	public Item getTabIconItem() {
		return FoodStuffs.oatie_biscuit;
	}


}
