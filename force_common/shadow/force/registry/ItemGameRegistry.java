package shadow.force.registry;

import shadow.force.item.Items;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemGameRegistry {
	public ItemGameRegistry(){
		
		GameRegistry.registerItem(Items.forceCrystal, "forceCrystal");
		
	}
}