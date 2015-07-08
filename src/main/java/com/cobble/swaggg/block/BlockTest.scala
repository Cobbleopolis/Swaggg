package com.cobble.swaggg.block

import com.cobble.swaggg.reference.Reference
import net.minecraft.block.material.Material
import net.minecraft.creativetab.CreativeTabs
import net.minecraftforge.fml.common.registry.GameRegistry

class BlockTest extends SwagggBlock(Material.rock) {

    name = "tutorialBlock"

    setUnlocalizedName(Reference.MOD_ID + ":" + name)
    setCreativeTab(CreativeTabs.tabBlock)
    GameRegistry.registerBlock(this, name)

}
