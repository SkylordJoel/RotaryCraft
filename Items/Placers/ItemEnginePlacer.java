/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2014
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.RotaryCraft.Items.Placers;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

import org.lwjgl.input.Keyboard;

import Reika.DragonAPI.Libraries.ReikaEntityHelper;
import Reika.DragonAPI.Libraries.MathSci.ReikaEngLibrary;
import Reika.DragonAPI.Libraries.MathSci.ReikaMathLibrary;
import Reika.DragonAPI.Libraries.World.ReikaBlockHelper;
import Reika.DragonAPI.Libraries.World.ReikaWorldHelper;
import Reika.RotaryCraft.Auxiliary.RotaryAux;
import Reika.RotaryCraft.Base.ItemBlockPlacer;
import Reika.RotaryCraft.Base.TileEntity.TileEntityEngine;
import Reika.RotaryCraft.Registry.EngineType;
import Reika.RotaryCraft.Registry.MachineRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemEnginePlacer extends ItemBlockPlacer {

	public ItemEnginePlacer(int id) {
		super(id);
	}

	@Override
	public boolean onItemUse(ItemStack is, EntityPlayer ep, World world, int x, int y, int z, int side, float par8, float par9, float par10) {
		if (!ReikaWorldHelper.softBlocks(world, x, y, z) && world.getBlockMaterial(x, y, z) != Material.water && world.getBlockMaterial(x, y, z) != Material.lava) {
			if (side == 0)
				--y;
			if (side == 1)
				++y;
			if (side == 2)
				--z;
			if (side == 3)
				++z;
			if (side == 4)
				--x;
			if (side == 5)
				++x;
			if (!ReikaWorldHelper.softBlocks(world, x, y, z) && world.getBlockMaterial(x, y, z) != Material.water && world.getBlockMaterial(x, y, z) != Material.lava)
				return false;
		}
		this.clearBlocks(world, x, y, z);
		if (!this.checkValidBounds(is, ep, world, x, y, z)) {
			return false;
		}
		AxisAlignedBB box = AxisAlignedBB.getBoundingBox(x, y, z, x+1, y+1, z+1);
		List inblock = world.getEntitiesWithinAABB(EntityLivingBase.class, box);
		if (inblock.size() > 0 && !ReikaEntityHelper.allAreDead(inblock, true)) {
			return false;
		}
		if (!ep.canPlayerEdit(x, y, z, 0, is)) {
			return false;
		}
		else
		{
			if (!ep.capabilities.isCreativeMode)
				--is.stackSize;
			world.setBlock(x, y, z, MachineRegistry.ENGINE.getBlockID(), is.getItemDamage(), 3);
			TileEntityEngine eng = (TileEntityEngine)world.getBlockTileEntity(x, y, z);
			if (eng != null) {
				world.playSoundEffect(x+0.5, y+0.5, z+0.5, "step.stone", 1F, 1.5F);
				//eng.type = EngineType.setType(is.getItemDamage());
				eng.setType(is);
				eng.setBlockMetadata(RotaryAux.get4SidedMetadataFromPlayerLook(ep));
				eng.placer = ep.getEntityName();
				eng.setDataFromPlacer(is);
				if (RotaryAux.shouldSetFlipped(world, x, y, z)) {
					eng.isFlipped = true;
				}
				ReikaWorldHelper.causeAdjacentUpdates(world, x, y, z);
			}
		}
		return true;
	}

	@Override
	protected boolean checkValidBounds(ItemStack is, EntityPlayer ep,	World world, int x, int y, int z) {
		if (is.getItemDamage() == EngineType.HYDRO.ordinal()) {
			for (int i = -1; i <= 1; i++) {
				for (int j = -1; j <= 1; j++) {
					int a = 0; int b = 0;
					int m = RotaryAux.get4SidedMetadataFromPlayerLook(ep);
					if (m < 2)
						b = 1;
					else
						a = 1;
					int id = world.getBlockId(x+a*i, y+j, z+b*i);
					if (!ReikaWorldHelper.softBlocks(world, x+a*i, y+j, z+b*i))
						return false;
					if (id != 0) {
						int meta = world.getBlockMetadata(x+a*i, y+j, z+b*i);
						world.setBlock(x+a*i, y+j, z+b*i, 0);
						Block.blocksList[id].dropBlockAsItem(world, x+a*i, y+j, z+b*i, meta, 0);
					}
				}
			}
		}
		if (is.getItemDamage() == EngineType.WIND.ordinal()) {
			if (world.getBlockId(x, y+1, z) == MachineRegistry.ENGINE.getBlockID()) {
				TileEntityEngine te = (TileEntityEngine)world.getBlockTileEntity(x, y+1, z);
				if (te.getEngineType() == EngineType.WIND)
					return false;
			}
			if (world.getBlockId(x, y-1, z) == MachineRegistry.ENGINE.getBlockID()) {
				TileEntityEngine te = (TileEntityEngine)world.getBlockTileEntity(x, y-1, z);
				if (te.getEngineType() == EngineType.WIND)
					return false;
			}
			if (world.getBlockId(x+1, y, z) == MachineRegistry.ENGINE.getBlockID()) {
				TileEntityEngine te = (TileEntityEngine)world.getBlockTileEntity(x+1, y, z);
				if (te.getEngineType() == EngineType.WIND)
					return false;
			}
			if (world.getBlockId(x-1, y, z) == MachineRegistry.ENGINE.getBlockID()) {
				TileEntityEngine te = (TileEntityEngine)world.getBlockTileEntity(x-1, y, z);
				if (te.getEngineType() == EngineType.WIND)
					return false;
			}
			if (world.getBlockId(x, y, z+1) == MachineRegistry.ENGINE.getBlockID()) {
				TileEntityEngine te = (TileEntityEngine)world.getBlockTileEntity(x, y, z+1);
				if (te.getEngineType() == EngineType.WIND)
					return false;
			}
			if (world.getBlockId(x, y, z-1) == MachineRegistry.ENGINE.getBlockID()) {
				TileEntityEngine te = (TileEntityEngine)world.getBlockTileEntity(x, y, z-1);
				if (te.getEngineType() == EngineType.WIND)
					return false;
			}

			for (int i = -1; i <= 1; i++) {
				for (int j = -1; j <= 1; j++) {
					int a = 0; int b = 0;
					int m = RotaryAux.get4SidedMetadataFromPlayerLook(ep);
					if (m < 2)
						b = 1;
					else
						a = 1;
					int c = 0; int d = 0;
					switch (m) {
					case 0:
						c = 1;
						break;
					case 1:
						c = -1;
						break;
					case 2:
						d = 1;
						break;
					case 3:
						d = -1;
						break;
					}
					int id = world.getBlockId(x+a*i+c, y+j, z+b*i+d);
					if (!ReikaWorldHelper.softBlocks(id))
						return false;
				}
			}
		}
		return super.checkValidBounds(is, ep, world, x, y, z);
	}

	@Override
	protected void checkAndBreakAdjacent(World world, int x, int y, int z) {
		TileEntityEngine eng = (TileEntityEngine)world.getBlockTileEntity(x, y, z);
		if (eng != null) {
			if (eng.getEngineType() == EngineType.HYDRO) {
				int id = world.getBlockId(x, y+1, z);
				if (id != 0 && !ReikaBlockHelper.isLiquid(id)) {
					ReikaWorldHelper.dropBlockAt(world, x, y+1, z);
					world.setBlock(x, y+1, z, 0);
				}
				id = world.getBlockId(x, y-1, z);
				if (id != 0 && !ReikaBlockHelper.isLiquid(id)) {
					ReikaWorldHelper.dropBlockAt(world, x, y-1, z);
					world.setBlock(x, y-1, z, 0);
				}

				if (eng.getBlockMetadata() < 2) {
					id = world.getBlockId(x, y, z+1);
					if (id != 0 && !ReikaBlockHelper.isLiquid(id)) {
						ReikaWorldHelper.dropBlockAt(world, x, y, z+1);
						world.setBlock(x, y, z+1, 0);
					}

					id = world.getBlockId(x, y, z-1);
					if (id != 0 && !ReikaBlockHelper.isLiquid(id)) {
						ReikaWorldHelper.dropBlockAt(world, x, y, z-1);
						world.setBlock(x, y, z-1, 0);
					}

					id = world.getBlockId(x, y-1, z+1);
					if (id != 0 && !ReikaBlockHelper.isLiquid(id)) {
						ReikaWorldHelper.dropBlockAt(world, x, y-1, z+1);
						world.setBlock(x, y-1, z+1, 0);
					}

					id = world.getBlockId(x, y-1, z-1);
					if (id != 0 && !ReikaBlockHelper.isLiquid(id)) {
						ReikaWorldHelper.dropBlockAt(world, x, y-1, z-1);
						world.setBlock(x, y-1, z-1, 0);
					}

					id = world.getBlockId(x, y+1, z+1);
					if (id != 0 && !ReikaBlockHelper.isLiquid(id)) {
						ReikaWorldHelper.dropBlockAt(world, x, y+1, z+1);
						world.setBlock(x, y+1, z+1, 0);
					}

					id = world.getBlockId(x, y+1, z-1);
					if (id != 0 && !ReikaBlockHelper.isLiquid(id)) {
						ReikaWorldHelper.dropBlockAt(world, x, y+1, z-1);
						world.setBlock(x, y+1, z-1, 0);
					}
				}
				else {
					id = world.getBlockId(x-1, y, z);
					if (id != 0 && !ReikaBlockHelper.isLiquid(id)) {
						ReikaWorldHelper.dropBlockAt(world, x-1, y, z);
						world.setBlock(x-1, y, z, 0);
					}

					id = world.getBlockId(x+1, y, z);
					if (id != 0 && !ReikaBlockHelper.isLiquid(id)) {
						ReikaWorldHelper.dropBlockAt(world, x+1, y, z);
						world.setBlock(x+1, y, z, 0);
					}

					id = world.getBlockId(x-1, y-1, z);
					if (id != 0 && !ReikaBlockHelper.isLiquid(id)) {
						ReikaWorldHelper.dropBlockAt(world, x-1, y-1, z);
						world.setBlock(x-1, y-1, z, 0);
					}

					id = world.getBlockId(x+1, y-1, z);
					if (id != 0 && !ReikaBlockHelper.isLiquid(id)) {
						ReikaWorldHelper.dropBlockAt(world, x+1, y-1, z);
						world.setBlock(x+1, y-1, z, 0);
					}

					id = world.getBlockId(x-1, y+1, z);
					if (id != 0 && !ReikaBlockHelper.isLiquid(id)) {
						ReikaWorldHelper.dropBlockAt(world, x-1, y+1, z);
						world.setBlock(x-1, y+1, z, 0);
					}

					id = world.getBlockId(x+1, y+1, z);
					if (id != 0 && !ReikaBlockHelper.isLiquid(id)) {
						ReikaWorldHelper.dropBlockAt(world, x+1, y+1, z);
						world.setBlock(x+1, y+1, z, 0);
					}
				}
			}
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(int id, CreativeTabs tab, List list) {
		if (MachineRegistry.ENGINE.isAvailableInCreativeInventory()) {
			for (int i = 0; i < EngineType.engineList.length; i++) {
				ItemStack item = new ItemStack(id, 1, i);
				list.add(item);
			}
		}
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void addInformation(ItemStack is, EntityPlayer ep, List li, boolean verbose) {
		int i = is.getItemDamage();
		if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT)) {
			EngineType type = EngineType.engineList[i];
			double power = type.getPower();
			double speed = type.getSpeed();
			double torque = type.getTorque();
			li.add(String.format("Power: %.3f %sW", ReikaMathLibrary.getThousandBase(power), ReikaEngLibrary.getSIPrefix(power)));
			li.add(String.format("Torque: %.3f %sNm", ReikaMathLibrary.getThousandBase(torque), ReikaEngLibrary.getSIPrefix(torque)));
			li.add(String.format("Speed: %.3f %srad/s", ReikaMathLibrary.getThousandBase(speed), ReikaEngLibrary.getSIPrefix(speed)));
		}
		else {
			StringBuilder sb = new StringBuilder();
			sb.append("Hold ");
			sb.append(EnumChatFormatting.GREEN.toString());
			sb.append("Shift");
			sb.append(EnumChatFormatting.GRAY.toString());
			sb.append(" for power data");
			li.add(sb.toString());
		}
		if (is.stackTagCompound != null) {
			int dmg = is.stackTagCompound.getInteger("damage");
			li.add(String.format("Damage: %.1f%s", dmg*12.5F, "%"));
		}
	}
}
