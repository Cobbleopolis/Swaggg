package com.cobble.swaggg.block

import com.cobble.swaggg.reference.Reference
import net.minecraft.block.Block
import net.minecraft.block.material.Material
import net.minecraft.creativetab.CreativeTabs
import net.minecraftforge.fml.common.registry.GameRegistry

class BlockSwaggg extends Block(Material.rock) with SwagggBlock{

    val name: String = "swagBlock"

    setUnlocalizedName(Reference.RESOURCE_PREFIX + name)
    setCreativeTab(CreativeTabs.tabBlock)
    GameRegistry.registerBlock(this, name)

}
