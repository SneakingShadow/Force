package shadow.force.item;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.item.ItemExpireEvent;
import shadow.force.Force;
import shadow.force.lib.Ref;

public class ForceCrystal extends Item{

	public ForceCrystal(int id) {
		super(id);
		setMaxStackSize(64);
		setUnlocalizedName("forceCrystal");
		setCreativeTab(Force.tabForce);
		setTextureName(Ref.MOD_ID + ":" + "force_crystal");
	}
}
