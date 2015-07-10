package com.cobble.swaggg.reference

import com.cobble.swaggg.block.{BlockSwagExtractor, BlockFluidSwag, BlockSwag, SwagggBlock}
import com.cobble.swaggg.tileentity._
import net.minecraft.block.Block
import net.minecraft.client.Minecraft
import net.minecraft.client.renderer.entity.RenderItem
import net.minecraft.client.resources.model.ModelResourceLocation
import net.minecraft.item.Item
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import net.minecraftforge.fml.common.registry.GameRegistry
import net.minecraftforge.fml.relauncher.Side

object SwagggBlocks {

    private
    
    var swagBlock: SwagggBlock = null
    var fluidSwag: SwagggBlock = null
    var swagExtractor: SwagggBlock = null
    var swagExtractorTileEntity: TileEntitySwagExtractor = null

    def preInit(): Unit = {
        swagBlock = new BlockSwag
        fluidSwag = new BlockFluidSwag
        SwagggFluids.fluidSwaggg.setBlock(SwagggBlocks.fluidSwag.asInstanceOf[Block])
        swagExtractor = new BlockSwagExtractor
        swagExtractorTileEntity = new TileEntitySwagExtractor
    }

    def init(event: FMLInitializationEvent): Unit = {
        if (event.getSide == Side.CLIENT) {
            registerItemRenderers()
        }
        registerTileEntities()
    }

    def registerItemRenderers(): Unit = {
        registerBlockItemRender(swagBlock)
        registerBlockItemRender(swagExtractor)
    }

    def registerTileEntities(): Unit = {
        GameRegistry.registerTileEntity(swagExtractorTileEntity.getClass, Reference.RESOURCE_PREFIX + "tileEntity." + swagExtractor.getName)
    }


    def registerBlockItemRender(block: SwagggBlock, meta: Int = 0): Unit = {
        Minecraft.getMinecraft.getRenderItem.getItemModelMesher.register(Item.getItemFromBlock(block.asInstanceOf[Block]), meta, new ModelResourceLocation(Reference.RESOURCE_PREFIX + block.getName, "inventory"))
    }
    
}
