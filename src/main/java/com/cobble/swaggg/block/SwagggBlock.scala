package com.cobble.swaggg.block

import net.minecraft.block.Block
import net.minecraft.block.material.Material

trait SwagggBlock {

    val name: String

    def getName: String = name
}
