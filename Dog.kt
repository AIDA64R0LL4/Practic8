class Dog(var _nickname: String, var _breed: String, var _height: String, var _color: String, var _weight: String, var _personality: String, ) {
    var nickname: String = _nickname
    var breed: String = _breed
    var height: String = _height
    var color: String = _color
    var weight: String = _weight
    var personality: String = _personality
    fun NickName() {
        println("Кличка собаки: $nickname.")
    }

    fun Breed() {
        println("Порода собаки: $breed.")
    }

    fun Height() {
        println("Рост собаки: $height.")
    }

    fun Color() {
        println("Окрас собаки: $color.")
    }

    fun Weight() {
        println("Вес собаки: $weight.")
    }

    fun Personality() {
        println("Характер собаки: $personality.")
    }
}