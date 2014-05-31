package shadow.force.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import shadow.force.Force;
import shadow.force.lib.Ref;

public class ForceOre extends Block{

	public ForceOre(int id) {
		super(id, Material.rock);
		setHardness(3.0F);
		setStepSound(Block.soundStoneFootstep);
		setResistance(5.0F);
		setUnlocalizedName("forceOre");
		setCreativeTab(Force.tabForce);
		setTextureName(Ref.MOD_ID + ":force_ore");
	}

	public int idDropped(int par1, Random random, int par2) {
        return Force.forceCrystal.itemID;
	}
	
    public int quantityDropped(Random random)
    {
    	return 1;
    }
    
    public int quantityDroppedWithBonus(int fortune, Random random)
    {
    	return quantityDropped(random) + random.nextInt((fortune-1));
    }
}
