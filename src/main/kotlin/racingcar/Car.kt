package racingcar

class Car(val name: String) {
    private var distance: Int = 0

    fun moveForward() {
        distance++
    }

    fun getName() = name
    fun getDistance() = distance
}
