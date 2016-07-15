package miscutil.core.handler.registration.gregtech;

import miscutil.core.util.Utils;
import miscutil.core.xmod.gregtech.api.enums.GregtechItemList;
import miscutil.core.xmod.gregtech.common.tileentities.machines.multi.GregtechMetaTileEntityIndustrialMacerator;

public class GregtechIndustrialMacerator
{



	public static void run()
	{
		if (miscutil.core.lib.LoadedMods.Gregtech){
			Utils.LOG_INFO("MiscUtils: Gregtech5u Content | Registering Industrial Maceration Stack Multiblock.");
			run1();
		}

	}

	private static void run1()
	{
		//Industrial Electrolyzer Multiblock
		GregtechItemList.Industrial_MacerationStack.set(new GregtechMetaTileEntityIndustrialMacerator(797, "industrialmacerator.controller.tier.single", "Maceration Stack Control Block").getStackForm(1L));
		
	}
}