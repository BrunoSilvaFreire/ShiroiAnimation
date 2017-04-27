package me.ddevil.shiroi.animation

import me.ddevil.shiroi.animation.misc.World
import me.ddevil.util.vector.Vector3

interface ArmorStand {


    var world: World

    var position: Vector3<Double>
    var headPosition: Vector3<Double>
    var bodyPosition: Vector3<Double>
    var leftArmPosition: Vector3<Double>
    var rightArmPosition: Vector3<Double>
    var leftLegPosition: Vector3<Double>
    var rightLegPosition: Vector3<Double>
}

