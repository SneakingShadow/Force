package shadow.force.creativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.StatCollector;
import shadow.force.lib.Ref;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTab {
	
	public static CreativeTabs tabForce = new CreativeTabs(Ref.MOD_ID){
        //public ItemStack getIconItemStack() {
        //	return new ItemStack(Item.appleGold, 1, 0);
        //}
        
        @Override
        public Item getTabIconItem(){
            return Item.appleGold;
        }

        @Override
        @SideOnly(Side.CLIENT)
        public String getTranslatedTabLabel(){
            return StatCollector.translateToLocal("key.categories.ee3");
        }
    };
}
