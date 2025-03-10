package com.hbm.blocks.bomb;

import java.util.Random;

import javax.annotation.Nonnull;

import com.hbm.blocks.ModBlocks;
import com.hbm.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockCloudResidue extends Block {

	@SuppressWarnings("null")
	public BlockCloudResidue(Material materialIn, String s) {
		super(materialIn);
		this.setUnlocalizedName(s);
		this.setRegistryName(s);
		this.setCreativeTab(null);

		ModBlocks.ALL_BLOCKS.add(this);
	}
	
	public static boolean hasPosNeightbour(World world, BlockPos pos) {
		Block b0 = world.getBlockState(pos.add(1, 0, 0)).getBlock();
		Block b1 = world.getBlockState(pos.add(0, 1, 0)).getBlock();
		Block b2 = world.getBlockState(pos.add(0, 0, 1)).getBlock();
		Block b3 = world.getBlockState(pos.add(-1, 0, 0)).getBlock();
		Block b4 = world.getBlockState(pos.add(0, -1, 0)).getBlock();
		Block b5 = world.getBlockState(pos.add(0, 0, -1)).getBlock();
		boolean b = b0.isNormalCube(world.getBlockState(pos.add(1, 0, 0)), world, pos)
				|| b1.isNormalCube(world.getBlockState(pos.add(0, 1, 0)), world, pos)
				|| b2.isNormalCube(world.getBlockState(pos.add(0, 0, 1)), world, pos)
				|| b3.isNormalCube(world.getBlockState(pos.add(-1, 0, 0)), world, pos)
				|| b4.isNormalCube(world.getBlockState(pos.add(0, -1, 0)), world, pos)
				|| b5.isNormalCube(world.getBlockState(pos.add(0, 0, -1)), world, pos);
		return b;
	}

	@Override
	public AxisAlignedBB getSelectedBoundingBox(@Nonnull IBlockState state, @Nonnull World worldIn, @Nonnull BlockPos pos) {
		return new AxisAlignedBB(pos, pos);
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBox(@Nonnull IBlockState blockState, @Nonnull IBlockAccess worldIn, @Nonnull BlockPos pos) {
		return NULL_AABB;
	}

	@Override
	public boolean isCollidable(){
		return true;
	}

	@Override
	public boolean isNormalCube(@Nonnull IBlockState state) {
		return false;
	}
	
	@Override
	public boolean canPlaceBlockAt(@Nonnull World worldIn, @Nonnull BlockPos pos) {
		return hasPosNeightbour(worldIn, pos);
	}

	@Override
	public void neighborChanged(@Nonnull IBlockState state, @Nonnull World world, @Nonnull BlockPos pos, @Nonnull Block blockIn, @Nonnull BlockPos fromPos) {
		if (!BlockCloudResidue.hasPosNeightbour(world, pos) && !world.isRemote) {
			world.setBlockToAir(pos);
		}
	}

	@Override
	public MapColor getMapColor(@Nonnull IBlockState state, @Nonnull IBlockAccess worldIn, @Nonnull BlockPos pos) {
		return MapColor.RED;
	}
	@Override
	public Item getItemDropped(@Nonnull IBlockState state, @Nonnull Random rand, int fortune) {
		if(rand.nextInt(25) == 1){
			return ModItems.powder_cloud;
		}
		return Items.AIR;
	}
}
