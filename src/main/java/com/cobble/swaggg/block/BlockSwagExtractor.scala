package com.cobble.swaggg.block

import com.cobble.swaggg.reference.{BlockNames, Reference}
import com.cobble.swaggg.tileentity.TileEntitySwagExtractor
import net.minecraft.block.{ITileEntityProvider, Block}
import net.minecraft.block.material.Material
import net.minecraft.block.state.IBlockState
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.tileentity.TileEntity
import net.minecraft.util.{EnumChatFormatting, ChatComponentTranslation, BlockPos, EnumFacing}
import net.minecraft.world.World
import net.minecraftforge.fml.common.registry.GameRegistry

class BlockSwagExtractor extends Block(Material.rock) with SwagggBlock with ITileEntityProvider {

    val name: String = BlockNames.SWAG_EXTRACTOR

    setUnlocalizedName(Reference.RESOURCE_PREFIX + name)
    setCreativeTab(CreativeTabs.tabBlock)
    GameRegistry.registerBlock(this, name)

    override def onBlockActivated(world: World,
                                  pos: BlockPos,
                                  state: IBlockState,
                                  player: EntityPlayer,
                                  side: EnumFacing,
                                  hitX: Float,
                                  hitY: Float,
                                  hitZ: Float): Boolean = {
        if (world.isRemote) player.addChatComponentMessage(new ChatComponentTranslation("You clicked the block at " + EnumChatFormatting.RED + "[" + pos.getX + "] " + EnumChatFormatting.GREEN + "[" + pos.getY + "] " + EnumChatFormatting.BLUE + "[" + pos.getZ + "]"))
        false
    }

    override def createNewTileEntity(worldIn: World, meta: Int): TileEntity = new TileEntitySwagExtractor
}
