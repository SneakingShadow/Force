package shadow.force.registry;

import shadow.force.lib.Ref;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class TabLanguageRegistry {
	public TabLanguageRegistry(){
	
		LanguageRegistry.instance().addStringLocalization("itemGroup." + Ref.MOD_ID, "en_US", "Force");
	
	}
}