package me.ddevil.shiroi.animation

enum class ArmorLimb {
    HEAD,
    BODY,
    LEFT_ARM,
    RIGHT_ARM,
    LEFT_LEG,
    RIGHT_LEG;

    val isArm get() = this == LEFT_ARM || this == RIGHT_ARM

    val isLeg get() = this == LEFT_LEG || this == RIGHT_LEG

    val isHead get() = this == HEAD
}