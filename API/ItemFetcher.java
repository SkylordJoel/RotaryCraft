/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2014
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.RotaryCraft.API;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/** For fetching ItemRegistry items, not direct-coded ones
 * See source code to know which are which */
public class ItemFetcher {

	private static Class core;
	private static Item[] itemList;

	static {
		try {
			core = Class.forName("Reika.RotaryCraft.RotaryCraft", false, ItemFetcher.class.getClassLoader());
			itemList = (Item[])core.getField("basicItems").get(null);
		}
		catch (ClassNotFoundException e) {
			System.out.println("RotaryCraft class not found!");
			e.printStackTrace();
		}
		catch (IllegalArgumentException e) {
			System.out.println("RotaryCraft class not read!");
			e.printStackTrace();
		}
		catch (IllegalAccessException e) {
			System.out.println("RotaryCraft class not read!");
			e.printStackTrace();
		}
		catch (NoSuchFieldException e) {
			System.out.println("RotaryCraft class not read!");
			e.printStackTrace();
		}
		catch (SecurityException e) {
			System.out.println("RotaryCraft class not read!");
			e.printStackTrace();
		}
	}


	/** For fetching items by enum ordinal */
	public static Item getItemByOrdinal(int ordinal) {
		return itemList[ordinal];
	}

	public static Item getItemByUnlocalizedName(String name) {
		for (int i = 0; i < itemList.length; i++) {
			Item it = itemList[i];
			String sg = it.getUnlocalizedName();
			if (name.equals(sg))
				return it;
		}
		return null;
	}

	public static boolean isPlayerHoldingAngularTransducer(EntityPlayer ep) {
		ItemStack is = ep.getCurrentEquippedItem();
		if (is != null) {
			return is.itemID == getItemByOrdinal(1).itemID;
		}
		return false;
	}


	public static boolean isPlayerHoldingBedrockPick(EntityPlayer ep) {
		ItemStack is = ep.getCurrentEquippedItem();
		if (is != null) {
			return is.itemID == getItemByOrdinal(15).itemID;
		}
		return false;
	}

}
