package com.cobble.swaggg.reference

import com.cobble.swaggg.fluid.FluidSwaggg
import net.minecraft.util.ResourceLocation
import net.minecraftforge.fluids.{Fluid, FluidRegistry}

object SwagggFluids {

    val fluidSwaggg: Fluid = new FluidSwaggg


    def registerFluids(): Unit = {
        println("Registering Fluids")
        FluidRegistry.registerFluid(fluidSwaggg)
        println(FluidRegistry.getFluid(fluidSwaggg.getName).getName)
    }

}
