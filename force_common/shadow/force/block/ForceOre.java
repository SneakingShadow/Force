package shadow.force.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import shadow.force.creativeTabs.Tabs;
import shadow.force.item.Items;
import shadow.force.lib.Ref;

public class ForceOre extends Block {

	public ForceOre(int id){
		super(id, Material.rock);
		setHardness(3.0F);
		setStepSound(Block.soundStoneFootstep);
		setResistance(5.0F);
		setUnlocalizedName("forceOre");
		setCreativeTab(Tabs.tabForce);
		setTextureName(Ref.MOD_ID + ":" + "force_ore");
	}

	public int idDropped(int par1, Random random, int par2){
        return Items.forceCrystal.itemID;
	}
	
	public int quantityDropped(int fortune, Random random){
    	return 3 + random.nextInt(2);
    }
	
    public int quantityDroppedWithBonus(int fortune, Random random){
    	return 3 + random.nextInt(fortune+2);
    }
}