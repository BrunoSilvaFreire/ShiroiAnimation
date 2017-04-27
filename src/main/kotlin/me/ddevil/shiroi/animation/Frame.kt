package me.ddevil.shiroi.animation

import me.ddevil.shiroi.animation.util.getPosition
import me.ddevil.util.Serializable
import me.ddevil.util.immutableStringAnyMapBuilder
import me.ddevil.util.putSerializableIfNotNull
import me.ddevil.util.vector.DoubleVector3
import me.ddevil.util.vector.Vector3

class Frame : Serializable {


    @JvmOverloads
    constructor(position: Vector3<Double> = DoubleVector3(),
                headPosition: Vector3<Double> = DoubleVector3(),
                bodyPosition: Vector3<Double> = DoubleVector3(),
                leftArmPosition: Vector3<Double> = DoubleVector3(),
                rightArmPosition: Vector3<Double> = DoubleVector3(),
                leftLegPosition: Vector3<Double> = DoubleVector3(),
                rightLegPosition: Vector3<Double> = DoubleVector3()) {
        this.position = position
        this.headPosition = headPosition
        this.bodyPosition = bodyPosition
        this.leftArmPosition = leftArmPosition
        this.rightArmPosition = rightArmPosition
        this.leftLegPosition = leftLegPosition
        this.rightLegPosition = rightLegPosition
    }

    constructor(map: Map<String, Any>) {
        position = map.getPosition(ARMOR_POSITION)
        headPosition = map.getPosition(HEAD_POSITION)
        bodyPosition = map.getPosition(BODY_POSITION)
        leftArmPosition = map.getPosition(LEFT_ARM_POSITION)
        rightArmPosition = map.getPosition(RIGHT_ARM_POSITION)
        leftLegPosition = map.getPosition(LEFT_LEG_POSITION)
        rightLegPosition = map.getPosition(RIGHT_LEG_POSITION)
    }

    var position: Vector3<Double>?
    var headPosition: Vector3<Double>?
    var leftArmPosition: Vector3<Double>?
    var bodyPosition: Vector3<Double>?
    var rightArmPosition: Vector3<Double>?
    var leftLegPosition: Vector3<Double>?
    var rightLegPosition: Vector3<Double>?

    override fun serialize(): Map<String, Any> = immutableStringAnyMapBuilder()
            .putSerializableIfNotNull(ARMOR_POSITION, position)
            .putSerializableIfNotNull(HEAD_POSITION, headPosition)
            .putSerializableIfNotNull(BODY_POSITION, bodyPosition)
            .putSerializableIfNotNull(LEFT_ARM_POSITION, leftArmPosition)
            .putSerializableIfNotNull(RIGHT_ARM_POSITION, rightArmPosition)
            .putSerializableIfNotNull(LEFT_LEG_POSITION, leftLegPosition)
            .putSerializableIfNotNull(RIGHT_LEG_POSITION, rightLegPosition)
            .build()
}

