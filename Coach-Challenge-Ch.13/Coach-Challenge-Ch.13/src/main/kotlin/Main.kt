fun main(args: Array<String>) {
    val pilihan = arrayOf("gunting", "batu", "kertas")
    var computer = pilihan.random()

    println("*************************");
    println("|     SELAMAT DATANG    |");
    println("|      DI PERMAINAN     |");
    println("| KERTAS, BATU, GUNTING |");
    println("*************************");

    println("Semoga berhasil.. ");
    println("Silakan isi nama kamu :")
    var namaPlayer = readLine()
    println("Hi, $namaPlayer !! Selamat bermain")
    println("Masukan Antara (Gunting,Batu, Kertas) ")

    print("Input Pemain 1 : ")
    val data1 = readLine()!!
    print("Input Pemain 2 : ")
    val data2 = readLine()!!

    val controller = Controller(object : Callback {
        override fun tampilkanHasil(result: String) {
            println(result)
        }

    })
    controller.banding(data1, data2)

    when (namaPlayer + computer) {
        "Gunting" + "Kertas",
        "Batu" + "Gunting",
        "Kertas" + "Batu" -> {
            "Sayang sekali..Kamu KALAH"
        }

        "Batu" + "Kertas",
        "Kertas" + "Gunting",
        "Gunting" + "Batu" -> {
            "Selamat..Kamu MENANG"
        }

        "Batu" + "Batu",
        "Kertas" + "Kertas",
        "Gunting" + "Gunting" -> {
            "DRAW"
        }

        else -> {}
    }
}
