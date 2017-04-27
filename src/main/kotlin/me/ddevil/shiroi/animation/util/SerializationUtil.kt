package me.ddevil.shiroi.animation.util

import me.ddevil.util.getMapAny
import me.ddevil.util.vector.DoubleVector3
import me.ddevil.util.vector.Vector3

fun Map<String, Any>.getPosition(key: String): Vector3<Double>? {
    return if (key in this) {
        DoubleVector3(this.getMapAny(key))
    } else {
        null
    }
}
