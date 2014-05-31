package shadow.force.registry;

import shadow.force.Force;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockGameRegistry {
	public BlockGameRegistry(){
		
		GameRegistry.registerBlock(Force.forceOre, "forceOre");
		
	}
}
