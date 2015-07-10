package com.cobble.swaggg.block

import com.cobble.swaggg.reference.{BlockNames, Reference, SwagggFluids}
import net.minecraft.block.material.Material
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.util.BlockPos
import net.minecraft.world.IBlockAccess
import net.minecraftforge.fluids.BlockFluidClassic
import net.minecraftforge.fml.common.registry.GameRegistry

class BlockFluidSwag extends BlockFluidClassic(SwagggFluids.fluidSwaggg, Material.water) with SwagggBlock {

    val name: String = BlockNames.FLUID_SWAGGG

    setUnlocalizedName(Reference.RESOURCE_PREFIX + name)
    setCreativeTab(CreativeTabs.tabBlock)
    lightValue = 14
    GameRegistry.registerBlock(this, name)

}
