package shadow.force.creativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import shadow.force.item.Items;
import shadow.force.lib.Ref;

public class Tabs {
	
		public static CreativeTabs tabForce = new CreativeTabs(Ref.MOD_ID){
			public ItemStack getIconItemStack() {
				return new ItemStack(Items.forceCrystal, 1, 0);
			}
		};
	
}