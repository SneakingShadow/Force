package shadow.force.registry;

import shadow.force.Force;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemGameRegistry {
	public ItemGameRegistry(){
		
		GameRegistry.registerItem(Force.forceCrystal, "forceCrystal");
		
	}
}
