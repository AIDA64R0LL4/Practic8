class Cinema(var _filmname: String, var _seans: String, var _ticket: String, var _hall: String, var _spectaters: String, ) {
    var filmname: String = _filmname
    var seans: String = _seans
    var ticket: String = _ticket
    var hall: String = _hall
    var spectaters: String = _spectaters

    fun FilmName() {
        println("Название фильма: $filmname.")
    }

    fun Seans() {
        println("Врема сеанса: $seans.")
    }

    fun Ticket() {
        println("Стоимость билета: $ticket.")
    }

    fun Hall() {
        println("Номер зала: $hall.")
    }

    fun Spectaters() {
        println("Зрителей: $spectaters.")
    }


}