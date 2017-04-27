package me.ddevil.shiroi.animation

interface AnimationPlayer {

    val playing: Boolean

    fun play(armorStand: ArmorStand, animation: Animation): Boolean

    fun stop(): Boolean

}