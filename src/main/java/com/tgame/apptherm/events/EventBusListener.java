package com.tgame.apptherm.events;

import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ForgeSubscribe;

import com.tgame.apptherm.blocks.Blocks;
import com.tgame.apptherm.fluids.Fluids;
import com.tgame.apptherm.tileentities.TileEntityLiquidCooler;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EventBusListener {

	public static void init() {
		MinecraftForge.EVENT_BUS.register(new EventBusListener());
	}

	@ForgeSubscribe
	@SideOnly(Side.CLIENT)
	public void postStitch(TextureStitchEvent.Post event) {
		Fluids.fluidME.setIcons(Blocks.fluidME.getBlockTextureFromSide(0),
				Blocks.fluidME.getBlockTextureFromSide(1));

		Fluids.meCoolant.setIcons(Blocks.meCoolant.getBlockTextureFromSide(0),
				Blocks.meCoolant.getBlockTextureFromSide(1));

	}

}
