package com.cobble.swaggg.fluid

import com.cobble.swaggg.reference.{BlockNames, Reference}
import net.minecraft.util.ResourceLocation
import net.minecraftforge.fluids.Fluid
import net.minecraftforge.fml.client.registry.ClientRegistry

class FluidSwaggg extends Fluid(BlockNames.FLUID_SWAGGG,
    new ResourceLocation("swaggg:blocks/fluidSwagggStill"),
    new ResourceLocation("swaggg:blocks/fluidSwagggFlow")) {

    setLuminosity(8)

    override def getColor: Int = {
        0xFFFFFFFF
    }
}
