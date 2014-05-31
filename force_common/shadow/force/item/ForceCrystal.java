package shadow.force.item;

import net.minecraft.item.Item;
import shadow.force.creativeTabs.Tabs;
import shadow.force.lib.Ref;

public class ForceCrystal extends Item {

	public ForceCrystal(int id) {
		super(id);
		setMaxStackSize(64);
		setUnlocalizedName("forceCrystal");
		setCreativeTab(Tabs.tabForce);
		setTextureName(Ref.MOD_ID + ":" + "force_crystal");
	}
}