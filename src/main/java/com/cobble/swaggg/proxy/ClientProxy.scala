package com.cobble.swaggg.proxy


import java.io.File

import net.minecraft.entity.Entity
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.network.Packet
import net.minecraft.world.World
import net.minecraftforge.fml.common.network.IGuiHandler



class ClientProxy extends CommonProxy with ISwagggProxy {

    override def registerRenderers() {

    }

    override def registerSound(): Unit = {
    }

    override def getTicks(worldObj: World): Long = {
        if (worldObj != null) {
            return worldObj.getTotalWorldTime
        }
        val cWorld = getClientWorld
        if (cWorld != null) return cWorld.getTotalWorldTime
        0
    }

    override def isServerOnly: Boolean = false

    override def isServerThread: Boolean = false

    override def getClientWorld: World = null

    override def getServerWorld(dimension: Int): World = null

    override def getThePlayer: EntityPlayer = null

    override def isClientPlayer(player: Entity): Boolean = false

    override def sendPacketToPlayer(player: EntityPlayer, packet: Packet) {
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

    override def setNowPlayingTitle(nowPlaying: String) {
    }
}
