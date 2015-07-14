package com.cobble.swaggg.fluid

import com.cobble.swaggg.reference.{BlockNames, Reference}
import net.minecraft.util.ResourceLocation
import net.minecraftforge.fluids.Fluid
import net.minecraftforge.fml.client.registry.ClientRegistry

class FluidSwag extends Fluid(BlockNames.FLUID_SWAGGG,
    new ResourceLocation(Reference.RESOURCE_PREFIX + "blocks/fluidSwagStill"),
    new ResourceLocation(Reference.RESOURCE_PREFIX + "blocks/fluidSwagFlow")) {

    setLuminosity(14)

    override def getColor: Int = {
        0xFFFFFFFF
    }
}
