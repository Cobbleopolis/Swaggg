package com.cobble.swaggg.block

import net.minecraft.block.Block
import net.minecraft.block.material.Material

class SwagggBlock(material: Material) extends Block(material){

    var name: String = ""

    def getName: String = name
}
