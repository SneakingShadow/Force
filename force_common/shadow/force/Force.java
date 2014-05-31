package shadow.force;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import shadow.force.block.ForceOre;
import shadow.force.item.ForceCrystal;
import shadow.force.lib.Ref;
import shadow.force.proxy.CommonProxy;
import shadow.force.registry.language.BlockLanguageRegistry;
import shadow.force.registry.language.ItemLanguageRegistry;
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
	
	//Creative tabs
	public static CreativeTabs tabForce = new CreativeTabs("tabForce"){
        public ItemStack getIconItemStack() {
        	return new ItemStack(Force.forceCrystal, 1, 0);
        }
    };
    
    public static Item forceCrystal = new ForceCrystal(2500);
    
    public static Block forceOre = new ForceOre(800);
    
    @Instance(value = Ref.MOD_ID)
	public static Force instance;
	
	@SidedProxy(clientSide = Ref.ClIENT_PROXY_CLASS, serverSide = Ref.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		LanguageRegistry.instance().addStringLocalization("itemGroup.tabForce", "en_US", "Force");
	
		//LanguageRegistry.addName(forceCrystal, "Materialized Force Crystal");
		//LanguageRegistry.addName(forceOre, "Materialized Force Crystal Ore");
		
		new ItemLanguageRegistry();
		new BlockLanguageRegistry();
		
		GameRegistry.registerItem(forceCrystal, "forceCrystal");
		
		GameRegistry.registerBlock(forceOre, "forceOre");
		
	};
	
	@EventHandler
	public void load(FMLInitializationEvent event) {
		// proxy.registerRenderInformation();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	};
};


