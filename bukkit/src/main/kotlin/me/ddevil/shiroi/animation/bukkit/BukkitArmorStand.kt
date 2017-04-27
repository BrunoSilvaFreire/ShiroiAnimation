package me.ddevil.shiroi.animation.bukkit

import me.ddevil.shiroi.animation.ArmorStand
import me.ddevil.shiroi.animation.misc.World
import me.ddevil.shiroi.craft.util.toEulerAngle
import me.ddevil.shiroi.craft.util.toLocation
import me.ddevil.shiroi.craft.util.toVector3
import me.ddevil.util.vector.Vector3

class BukkitArmorStand(val delegate: org.bukkit.entity.ArmorStand) : ArmorStand {

    override var world: World = BukkitWorld(delegate.world)
        set(value) {
            if (value is BukkitWorld) {
                delegate.teleport(position.toLocation(value.delegate))
                field = value
            }
            throw IllegalArgumentException("The provided world must be an instance of 'me.ddevil.shiroi.animation.bukkit.BukkitWorld'!")
        }

    override var position: Vector3<Double>
        get() = delegate.location.toVector3()
        set(value) {
            delegate.teleport(value.toLocation(delegate.world))
        }

    override var bodyPosition: Vector3<Double>
        get() = delegate.bodyPose.toVector3()
        set(value) {
            delegate.bodyPose = value.toEulerAngle()
        }

    override var headPosition: Vector3<Double>
        get() = delegate.headPose.toVector3()
        set(value) {
            delegate.headPose = value.toEulerAngle()
        }

    override var leftArmPosition: Vector3<Double>
        get() = delegate.leftArmPose.toVector3()
        set(value) {
            delegate.leftArmPose = value.toEulerAngle()
        }

    override var rightArmPosition: Vector3<Double>
        get() = delegate.rightArmPose.toVector3()
        set(value) {
            delegate.rightArmPose = value.toEulerAngle()
        }

    override var leftLegPosition: Vector3<Double>
        get() = delegate.leftLegPose.toVector3()
        set(value) {
            delegate.leftLegPose = value.toEulerAngle()
        }
    override var rightLegPosition: Vector3<Double>
        get() = delegate.rightLegPose.toVector3()
        set(value) {
            delegate.rightArmPose = value.toEulerAngle()
        }

}