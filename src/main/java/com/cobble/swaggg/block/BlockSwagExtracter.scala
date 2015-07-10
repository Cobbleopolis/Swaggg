package com.cobble.swaggg.block

import com.cobble.swaggg.reference.{BlockNames, Reference}
import net.minecraft.block.Block
import net.minecraft.block.material.Material
import net.minecraft.creativetab.CreativeTabs
import net.minecraftforge.fml.common.registry.GameRegistry

class BlockSwagExtracter extends Block(Material.rock) with SwagggBlock {

    val name: String = BlockNames.SWAG_EXTRACTER

    setUnlocalizedName(Reference.RESOURCE_PREFIX + name)
    setCreativeTab(CreativeTabs.tabBlock)
    GameRegistry.registerBlock(this, name)
    
}
