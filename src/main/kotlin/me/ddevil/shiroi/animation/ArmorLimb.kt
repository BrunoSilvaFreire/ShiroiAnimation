package me.ddevil.shiroi.animation

import me.ddevil.util.vector.Vector3

interface ArmorStand {

    var headPosition: Vector3<Double>
    var leftArmPosition: Vector3<Double>
    var rightArmPosition: Vector3<Double>
    var leftLegPosition: Vector3<Double>
    var rightLegPosition: Vector3<Double>

}

enum class ArmorLimb {
    HEAD,
    LEFT_ARM,
    RIGHT_ARM,
    LEFT_LEG,
    RIGHT_LEG;

    val isArm get() = this == LEFT_ARM || this == RIGHT_ARM

    val isLeg get() = this == LEFT_LEG || this == RIGHT_LEG

    val isHead get() = this == HEAD
}