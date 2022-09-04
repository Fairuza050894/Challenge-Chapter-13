class Controller(private val callback: Callback) {

    fun banding(namaPlayer: String, computer: String) {
        when (namaPlayer + computer) {
            "Gunting" + "Kertas",
            "Batu" + "Gunting",
            "kertas" + "Batu" -> {
                callback.tampilkanHasil("Sayang sekali..Kamu KALAH")
            }

            "Batu" + "Kertas",
            "Kertas" + "Gunting",
            "Gunting" + "Batu" -> {
                callback.tampilkanHasil("Selamat..Kamu MENANG")
            }

            "Batu" + "Batu",
            "Kertas" + "Kertas",
            "Gunting" + "Gunting" -> {
                callback.tampilkanHasil("DRAW")
            }

            else -> {}
        }
    }
}
