package me.ddevil.shiroi.animation.bukkit

import me.ddevil.shiroi.animation.misc.World

class BukkitWorld(val delegate: org.bukkit.World) : World {
    override val name: String get() = delegate.name
}