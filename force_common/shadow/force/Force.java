package shadow.force;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import shadow.force.lib.Ref;
import shadow.force.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Ref.MOD_ID, name = Ref.MOD_NAME, version = Ref.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = true)
public class Force {
	
	//Creative tab
	public static CreativeTabs tabForce = new CreativeTabs("tabForce"){
        public ItemStack getIconItemStack() {
        	return new ItemStack(devilGem, 1, 0);
        }
    };
    
	
	//Axe
	public static Item devilAxe = new AxeReg(5016, toolDevilIngot, "devilAxe", "DevilAxe");
	public static Item obsidianAxe = new AxeReg(5020, toolObsidianIngot, "obsidianAxe", "ObsidianAxe");
	
	//Hoe
	public static Item obsidianHoe = new HoeReg(5021, toolObsidianIngot, "obsidianHoe", "ObsidianHoe");	
	
	//Sword material
	public static EnumToolMaterial swordDevilIngot = EnumHelper.addToolMaterial("devilIngot", 5, 15610, 120F, 12F, 30); 
	public static EnumToolMaterial swordObsidianIngot = EnumHelper.addToolMaterial("obsidianIngot", 4, 4683, 32F, 6F, 25);
	
	//Sword
	public static Item devilBlade = new SwordReg(5015, swordDevilIngot, "devilBlade", "DevilBlade");
	public static Item obsidianSword = new SwordReg(5019, swordObsidianIngot, "obsidianBlade", "ObsidianSword");
	
	//Bow
	public static Item devilBow = new BowReg(5023, 15610);
	
	//Stuff
	public static Item assasinsKnife = new AssasinsKnife(5034);
	
	//Testing stuff
	public static Item debugItem = new DebugItem(4999);
	
	@Instance(value = Ref.MOD_ID)
	public static BVKS instance;
	
	@SidedProxy(clientSide = Ref.ClIENT_PROXY_CLASS, serverSide = Ref.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
	
		//Harvest level
		MinecraftForge.setBlockHarvestLevel(devilCobblestone ,"pickaxe", 0);
		MinecraftForge.setBlockHarvestLevel(devilOre, "pickaxe", 4);
		MinecraftForge.setBlockHarvestLevel(smoothObsidianBlock ,"pickaxe", 4);
		
		//Language registry
		LanguageRegistry.addName(devilCobblestone, "Devils cobblestone");
		LanguageRegistry.addName(devilOre, "Devil ore");
		LanguageRegistry.addName(smoothObsidianBlock, "Smooth obsidian block");
		LanguageRegistry.addName(bvExplosives, "Bear Valley Explosives");
		LanguageRegistry.addName(devilTnt, "Devil Explosives");
		
		LanguageRegistry.addName(grenade, "Grenade");
		LanguageRegistry.addName(devilGem, "Devil gem");
		LanguageRegistry.addName(devilIngot, "Devils ingot");
		LanguageRegistry.addName(ironRod, "Iron rod");
		LanguageRegistry.addName(obsidianIngot, "Obsidian ingot");
		LanguageRegistry.addName(obsidianRod, "Obsidian rod");
		LanguageRegistry.addName(devilMixture, "Devil mixture");
		LanguageRegistry.addName(devilArrow, "Devil arrow");
		LanguageRegistry.addName(devilRod, "Devil rod");
		LanguageRegistry.addName(bowString, "Bow string");
		
		LanguageRegistry.addName(devilHelmet, "Devil helmet");
		LanguageRegistry.addName(devilChestplate, "Devil chestplate");
		LanguageRegistry.addName(devilLeggings, "Devil leggings");
		LanguageRegistry.addName(devilBoots, "Devil boots");
		
		LanguageRegistry.addName(obsidianHelmet, "Obsidian helmet");
		LanguageRegistry.addName(obsidianChestplate, "Obsidian chestplate");
		LanguageRegistry.addName(obsidianLeggings, "Obsidian leggings");
		LanguageRegistry.addName(obsidianBoots, "Obsidian boots");

		LanguageRegistry.addName(devilPickaxe, "Devil pickaxe");
		LanguageRegistry.addName(devilShovel, "Devil shovel");
		LanguageRegistry.addName(devilAxe, "Devil axe");
		LanguageRegistry.addName(devilBlade, "Devil blade");
		
		LanguageRegistry.addName(obsidianPickaxe, "Obsidian pickaxe");
		LanguageRegistry.addName(obsidianShovel, "Obsidian shovel");
		LanguageRegistry.addName(obsidianAxe, "Obsidian axe");
		LanguageRegistry.addName(obsidianHoe, "Obsidian hoe");
		LanguageRegistry.addName(obsidianSword, "Obsidian sword");
		
		LanguageRegistry.addName(devilBow, "Devil's bow");
		
		LanguageRegistry.addName(woodHammer, "Wood hammer");
		LanguageRegistry.addName(stoneHammer, "Stone hammer");
		LanguageRegistry.addName(ironHammer, "Iron hammer");
		LanguageRegistry.addName(goldHammer, "Gold hammer");
		LanguageRegistry.addName(diamondHammer, "Diamond hammer");
		LanguageRegistry.addName(devilHammer, "Devil's hammer");
		
		LanguageRegistry.addName(assasinsKnife, "assasinsKnife");
		
		LanguageRegistry.addName(debugItem, Ref.debugItemName);
		
		LanguageRegistry.instance().addStringLocalization("itemGroup.tabBVKS", "en_US", "Bear valley's killing set");
		LanguageRegistry.instance().addStringLocalization("itemGroup.tabBVExplosives", "en_US", "Bear valley's explosives");
		
		//Game registry
		GameRegistry.registerBlock(devilCobblestone, "devilCobblestone");
		GameRegistry.registerBlock(devilOre, "devilOre");	
		GameRegistry.registerBlock(smoothObsidianBlock, "smoothObsidianBlock");
		
		GameRegistry.registerBlock(bvExplosives, "bvExplosives");
		GameRegistry.registerBlock(devilTnt, "devilTnt");
		
		GameRegistry.registerItem(grenade, "grenade");
		
		GameRegistry.registerItem(devilGem, "devilGem");
		GameRegistry.registerItem(devilIngot, "devilIngot");
		GameRegistry.registerItem(obsidianIngot, "obsidianIngot");
		GameRegistry.registerItem(obsidianRod, "obsidianRod");
		GameRegistry.registerItem(ironRod, "ironRod");
		GameRegistry.registerItem(devilMixture, "devilMixture");
		GameRegistry.registerItem(devilArrow, "devilArrow");
		GameRegistry.registerItem(devilRod, "devilRod");
		GameRegistry.registerItem(bowString, "bowString");
		
		GameRegistry.registerItem(devilHelmet, "devilHelmet");
		GameRegistry.registerItem(devilChestplate, "devilChestplate");
		GameRegistry.registerItem(devilLeggings, "devilLeggings");
		GameRegistry.registerItem(devilBoots, "devilBoots");
		GameRegistry.registerItem(obsidianHelmet, "obsidianHelmet");
		GameRegistry.registerItem(obsidianChestplate, "obsidianChestplate");
		GameRegistry.registerItem(obsidianLeggings, "obsidianLeggings");
		GameRegistry.registerItem(obsidianBoots, "obsidianBoots");
		
		GameRegistry.registerItem(devilPickaxe, "devilPickaxe");
		GameRegistry.registerItem(devilShovel, "devilShovel");
		GameRegistry.registerItem(devilAxe, "devilAxe");
		GameRegistry.registerItem(devilBlade, "devilBlade");
		
		GameRegistry.registerItem(obsidianPickaxe, "obsidianPickaxe");
		GameRegistry.registerItem(obsidianShovel, "obsidianShovel");
		GameRegistry.registerItem(obsidianAxe, "obsidianAxe");
		GameRegistry.registerItem(obsidianHoe, "obsidianHoe");
		GameRegistry.registerItem(obsidianSword, "obsidianSword");
		
		GameRegistry.registerItem(woodHammer, "woodHammer");
		GameRegistry.registerItem(stoneHammer, "stoneHammer");
		GameRegistry.registerItem(ironHammer, "ironHammer");
		GameRegistry.registerItem(goldHammer, "goldHammer");
		GameRegistry.registerItem(diamondHammer, "diamondHammer");
		GameRegistry.registerItem(devilHammer, "devilHammer");
		
		GameRegistry.registerItem(assasinsKnife, "assasinsKnife");
		
		GameRegistry.registerItem(devilBow, "devilBow");
		
		GameRegistry.registerItem(debugItem, "debugItem");
		
		
		//WorldGen
		GameRegistry.registerWorldGenerator(genDevilOre);
		
		//Recipes:
		//Shapeless:
		GameRegistry.addShapelessRecipe(new ItemStack(devilMixture, 1), new ItemStack(devilGem), new ItemStack(Item.diamond), new ItemStack(Item.diamond), new ItemStack(Item.ingotIron), new ItemStack(Item.redstone));
				
		//Shaped:
		GameRegistry.addRecipe(new ItemStack(ironRod), "x", "x", 'x', new ItemStack(Item.ingotIron));
		GameRegistry.addRecipe(new ItemStack(obsidianRod), "x", "x", 'x', new ItemStack(obsidianIngot));
		GameRegistry.addRecipe(new ItemStack(devilRod), "x", "x", 'x', new ItemStack(devilIngot));
		GameRegistry.addRecipe(new ItemStack(bowString), "x", "x", "x", 'x', new ItemStack(Item.silk));
		GameRegistry.addRecipe(new ItemStack(Item.leather), "xx", "xx", 'x', new ItemStack(Item.rottenFlesh));
		GameRegistry.addRecipe(new ItemStack(devilHelmet), "xxx", "x x", 'x', new ItemStack(devilIngot));
		GameRegistry.addRecipe(new ItemStack(devilChestplate), "x x", "xxx", "xxx", 'x', new ItemStack(devilIngot));
		GameRegistry.addRecipe(new ItemStack(devilLeggings), "xxx", "x x", "x x", 'x', new ItemStack(devilIngot));
		GameRegistry.addRecipe(new ItemStack(devilBoots), "x x", "x x", 'x', new ItemStack(devilIngot));
		GameRegistry.addRecipe(new ItemStack(obsidianHelmet), "xxx", "x x", 'x', new ItemStack(obsidianIngot));
		GameRegistry.addRecipe(new ItemStack(obsidianChestplate), "x x", "xxx", "xxx", 'x', new ItemStack(obsidianIngot));
		GameRegistry.addRecipe(new ItemStack(obsidianLeggings), "xxx", "x x", "x x", 'x', new ItemStack(obsidianIngot));
		GameRegistry.addRecipe(new ItemStack(obsidianBoots), "x x", "x x", 'x', new ItemStack(obsidianIngot));
		GameRegistry.addRecipe(new ItemStack(devilPickaxe), "xxx", " y ", " y ", 'x', new ItemStack(devilIngot), 'y', new ItemStack(obsidianRod));
		GameRegistry.addRecipe(new ItemStack(devilShovel), "x", "y", "y", 'x', new ItemStack(devilIngot), 'y', new ItemStack(obsidianRod));
		GameRegistry.addRecipe(new ItemStack(devilBlade), "x", "x", "y", 'x', new ItemStack(devilIngot), 'y', new ItemStack(obsidianRod));
		GameRegistry.addRecipe(new ItemStack(devilAxe), "xx", "xy", " y", 'x', new ItemStack(devilIngot), 'y', new ItemStack(obsidianRod));
		GameRegistry.addRecipe(new ItemStack(obsidianPickaxe), "xxx", " y ", " y ", 'x', new ItemStack(obsidianIngot), 'y', new ItemStack(ironRod));
		GameRegistry.addRecipe(new ItemStack(obsidianShovel), "x", "y", "y", 'x', new ItemStack(obsidianIngot), 'y', new ItemStack(ironRod));
		GameRegistry.addRecipe(new ItemStack(obsidianSword), "x", "x", "y", 'x', new ItemStack(obsidianIngot), 'y', new ItemStack(ironRod));
		GameRegistry.addRecipe(new ItemStack(obsidianAxe), "xx", "xy", " y", 'x', new ItemStack(obsidianIngot), 'y', new ItemStack(ironRod));
		GameRegistry.addRecipe(new ItemStack(obsidianHoe), "xx", " y", " y", 'x', new ItemStack(obsidianIngot), 'y', new ItemStack(ironRod));
		GameRegistry.addRecipe(new ItemStack(devilBow), " xy", "x y", " xy", 'x', new ItemStack(devilRod), 'y', new ItemStack(bowString));
		
		
		//Smelting recipes
		GameRegistry.addSmelting(Block.obsidian.blockID, new ItemStack(obsidianIngot), 0.2F);
		GameRegistry.addSmelting(devilMixture.itemID, new ItemStack(devilIngot), 1F);
		
		//Ingot-block recipes
		GameRegistry.addRecipe(new ItemStack(smoothObsidianBlock), "xxx", "xxx", "xxx", 'x', new ItemStack(obsidianIngot));	
		
		//Block-ingot recipes
		GameRegistry.addShapelessRecipe(new ItemStack(obsidianIngot, 9), new ItemStack(smoothObsidianBlock));
	};
	
	@EventHandler
	public void load(FMLInitializationEvent event) {
		// proxy.registerRenderInformation();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	};
};


