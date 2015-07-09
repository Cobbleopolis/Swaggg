package com.cobble.swaggg.reference

import net.minecraft.block.BlockLiquid
import net.minecraft.util.ResourceLocation
import net.minecraftforge.fluids.{FluidRegistry, Fluid}

object SwagggFluids {

    val fluidSwaggg: Fluid = new Fluid(Reference.RESOURCE_PREFIX + "swag", new ResourceLocation(Reference.RESOURCE_PREFIX + "sawgBlock"), new ResourceLocation(Reference.MOD_ID + ":" + "sawgBlock"))

    def registerFluids(): Unit = {
        FluidRegistry.registerFluid(fluidSwaggg)
    }

}
