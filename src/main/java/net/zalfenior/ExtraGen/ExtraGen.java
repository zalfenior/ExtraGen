package net.zalfenior.ExtraGen;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.zalfenior.ExtraGen.item.ModItems;
import proxy.CommonProxy;

@Mod(modid = ExtraGen.modId, name = ExtraGen.name, version = ExtraGen.version, acceptedMinecraftVersions = "[1.12.2]")
public class ExtraGen {
	public static final String modId = "extraGen";
	public static final String name = "ExtraGen";
	public static final String version = "0.1.0";

	@Mod.Instance(modId)
	public static ExtraGen instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(name + " is loading!");
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
	@SidedProxy(serverSide = "net.zalfenior.ExtraGen.proxy.CommonProxy", clientSide = "net.zalfenior.ExtraGen.proxy.ClientProxy")
	public static CommonProxy proxy;
	
	@Mod.EventBusSubscriber
	public static class RegistrationHandler {
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
			ModItems.register(event.getRegistry());
		}
		@SubscribeEvent
		public static void registerItems(ModelRegistryEvent event) {
			ModItems.registerModels();
		}
	}
}
