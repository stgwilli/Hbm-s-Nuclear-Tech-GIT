package com.hbm.blocks;

import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.hbm.main.MainRegistry;
import com.hbm.util.I18nUtil;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class BlockBase extends Block {
	
	public BlockBase(Material m, String s){
		super(m);
		this.setUnlocalizedName(s);
		this.setRegistryName(s);
		this.setHarvestLevel("pickaxe", 0);
		this.setCreativeTab(MainRegistry.controlTab);
		ModBlocks.ALL_BLOCKS.add(this);
	}

	public BlockBase(Material m, SoundType sound, String s){
		super(m);
		this.setUnlocalizedName(s);
		this.setRegistryName(s);
		this.setSoundType(sound);
		this.setHarvestLevel("pickaxe", 0);
		this.setCreativeTab(MainRegistry.controlTab);
		ModBlocks.ALL_BLOCKS.add(this);
	}
	
	@Override
	public void addInformation(@Nonnull ItemStack stack, @Nullable World player, @Nonnull List<String> list, @Nonnull ITooltipFlag advanced) {
		if(stack.getItem() == Item.getItemFromBlock(ModBlocks.meteor_battery)){
			list.add(I18nUtil.resolveKey("desc.teslacoils"));
		}
		
		float hardness = this.getExplosionResistance();
		if(hardness > 50){
			list.add(TextFormatting.GOLD + I18nUtil.resolveKey("trait.blastres", hardness));
		}
	}

	public Block setSoundType(@Nonnull SoundType sound){
		return super.setSoundType(sound);
	}

    public float getExplosionResistance()
    {
        return this.blockResistance / 5.0F;
    }
}
