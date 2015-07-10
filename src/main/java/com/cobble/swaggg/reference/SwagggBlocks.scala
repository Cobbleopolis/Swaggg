package com.cobble.swaggg.reference

import com.cobble.swaggg.block.{BlockSwagExtracter, BlockFluidSwag, BlockSwag, SwagggBlock}
import net.minecraft.block.Block
import net.minecraft.client.Minecraft
import net.minecraft.client.renderer.entity.RenderItem
import net.minecraft.client.resources.model.ModelResourceLocation
import net.minecraft.item.Item
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import net.minecraftforge.fml.relauncher.Side

object SwagggBlocks {

    private
    
    var swagBlock: SwagggBlock = null
    var fluidSwag: SwagggBlock = null
    var swagExtracter: SwagggBlock = null

    def preInit(): Unit = {
        swagBlock = new BlockSwag
        fluidSwag = new BlockFluidSwag
        swagExtracter = new BlockSwagExtracter
        SwagggFluids.fluidSwaggg.setBlock(SwagggBlocks.fluidSwag.asInstanceOf[Block])
    }

    def init(event: FMLInitializationEvent): Unit = {
        if (event.getSide == Side.CLIENT) {
            registerBlockItemRender(swagBlock)
            registerBlockItemRender(fluidSwag)
            registerBlockItemRender(swagExtracter)
        }
    }


    def registerBlockItemRender(block: SwagggBlock, meta: Int = 0): Unit = {
        Minecraft.getMinecraft.getRenderItem.getItemModelMesher.register(Item.getItemFromBlock(block.asInstanceOf[Block]), meta, new ModelResourceLocation(Reference.RESOURCE_PREFIX + block.getName, "inventory"))
    }
    
}
