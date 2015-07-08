package com.cobble.swaggg.proxy

import java.io.File

import net.minecraft.entity.Entity
import net.minecraft.entity.player.EntityPlayer
import net.minecraft.network.Packet
import net.minecraft.world.World
import net.minecraftforge.fml.common.network.IGuiHandler

trait ISwagggProxy {
    def isServerOnly: Boolean

    def isServerThread: Boolean

    def getClientWorld: World

    def getServerWorld(dimension: Int): World

    def getThePlayer: EntityPlayer

    def isClientPlayer(player: Entity): Boolean

    def getTicks(worldObj: World): Long

    def sendPacketToPlayer(player: EntityPlayer, packet: Packet): Unit

    def sendPacketToServer(packet: Packet): Unit

    def getMinecraftDir: File

    def getLogFileName: String

    def wrapHandler(modSpecificHandler: IGuiHandler): IGuiHandler

    def preInit(): Unit

    def init(): Unit

    def postInit(): Unit

    def setNowPlayingTitle(nowPlaying: String): Unit
}
