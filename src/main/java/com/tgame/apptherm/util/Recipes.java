package com.tgame.apptherm.util;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

import com.tgame.apptherm.blocks.Blocks;
import com.tgame.apptherm.items.Items;

import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {

	public static void init() {

		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.jelloBrick),
				new ItemStack(Items.Goo, 1), new ItemStack(Block.brick));
	}

}
