package com.cobble.swaggg.reference

import com.cobble.swaggg.block.{BlockFluidSwag, BlockSwaggg, SwagggBlock}
import net.minecraft.block.Block
import net.minecraft.client.Minecraft
import net.minecraft.client.renderer.entity.RenderItem
import net.minecraft.client.resources.model.ModelResourceLocation
import net.minecraft.item.Item
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import net.minecraftforge.fml.relauncher.Side

object SwagggBlocks {

    private
    
    var swaggg: SwagggBlock = null
    var fluidSwaggg: SwagggBlock = null

    def preInit(): Unit = {
        swaggg = new BlockSwaggg
        fluidSwaggg = new BlockFluidSwag
        SwagggFluids.fluidSwaggg.setBlock(SwagggBlocks.fluidSwaggg.asInstanceOf[Block])
    }

    def init(event: FMLInitializationEvent): Unit = {
        if(event.getSide == Side.CLIENT){
            registerBlockItemRender(swaggg)
//            registerBlockItemRender(fluidSwaggg)
        }
    }


    def registerBlockItemRender(block: SwagggBlock, meta: Int = 0): Unit = {
        Minecraft.getMinecraft.getRenderItem.getItemModelMesher.register(Item.getItemFromBlock(block.asInstanceOf[Block]), meta, new ModelResourceLocation(Reference.RESOURCE_PREFIX + block.getName, "inventory"))
    }
    
}
