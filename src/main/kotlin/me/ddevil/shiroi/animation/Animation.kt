package me.ddevil.shiroi.animation

class Animation {
    private val internalFrames: MutableList<Frame>

    val frames: List<Frame>
        get() = ArrayList(internalFrames)

    @JvmOverloads
    constructor(internalFrames: List<Frame> = emptyList()) {
        this.internalFrames = ArrayList(internalFrames)
    }

    operator fun get(index: Int) = internalFrames[index]

    operator fun set(index: Int, frame: Frame) {
        internalFrames[index] = frame
    }
}