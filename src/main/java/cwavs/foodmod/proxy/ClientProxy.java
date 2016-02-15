package cwavs.foodmod.proxy;

import cwavs.foodmod.food.FoodStuffs;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void registerRenders()
	{
		FoodStuffs.registerRenders();
	}
	
}
