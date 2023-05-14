fun main() {
    apaBole(100)
}

fun apaBole(angka: Int) {
    //looping sebanyak input
    for (i in 1..angka) {
        //cek kondisi, jika habis dibagi 3 maka print "Apa"
        if (i % 3 == 0) {
            //jika habis dibagi 3 dan 5, maka print "ApaBole"
            if (i % 5 == 0) {
                print("ApaBole")
            } else {
                print("Apa")
            }
        } else if (i % 5 == 0) {        // jika habis dibagi 5, maka print "Bole"
            print("Bole")
        } else {                        // lainnya, print angka
            print("$i")
        }

        // cek kondisi, jika iterasi terakhir maka print empty string
        if (i != angka) {
            print(", ")
        } else {
            print("")
        }
    }
}