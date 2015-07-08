package com.cobble.swaggg.proxy

import java.io.File

import ibxm.Player
import net.minecraft.entity.Entity
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.network.Packet
import net.minecraft.world.World
import net.minecraftforge.fml.common.network.IGuiHandler

class CommonProxy extends ISwagggProxy{
    def registerRenderers() {
    }

    def registerSound() {
    }

    def isRenderWorld(world: World): Boolean = world.isRemote

    def isSimulating(world: World): Boolean = !world.isRemote

    override def isServerOnly: Boolean = false

    override def isServerThread: Boolean = false

    override def getClientWorld: World = null

    override def getServerWorld(dimension: Int): World = null

    override def getThePlayer: EntityPlayer = null

    override def isClientPlayer(player: Entity): Boolean = false

    override def getTicks(worldObj: World): Long = worldObj.getTotalWorldTime

    override def sendPacketToPlayer(player: EntityPlayer, packet: Packet): Unit =  {
    }

    override def sendPacketToServer(packet: Packet): Unit =  {
    }

    override def getMinecraftDir: File = null

    override def getLogFileName: String = null

    override def wrapHandler(modSpecificHandler: IGuiHandler): IGuiHandler = null

    override def preInit(): Unit =  {
    }

    override def init(): Unit =  {
    }

    override def postInit(): Unit =  {
    }

    override def setNowPlayingTitle(nowPlaying: String): Unit =  {
    }
}
