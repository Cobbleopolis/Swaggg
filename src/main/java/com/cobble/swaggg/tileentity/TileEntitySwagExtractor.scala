package com.cobble.swaggg.tileentity

import net.minecraft.server.gui.IUpdatePlayerListBox
import net.minecraft.tileentity.TileEntity

class TileEntitySwagExtractor extends TileEntity with IUpdatePlayerListBox {

    override def update(): Unit = {
//        println("Test")
    }

    def onClick(): Unit = {
        println("Second Test")
    }

    
}
