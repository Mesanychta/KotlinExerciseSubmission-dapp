package id.infinitelearning.KotlinSubmission.exercise2

fun main() {
    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */

    for (list in 1..100 ) {
        if(list %2 == 0)
            println(list)
    }

    println("Latihan 1 <-END->")

    /** Latihan 2 Map
    Buatlah variabel bertipe Map dengan kriteria:
    Daftar nama bulan dalam setahun,
    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
    - key "Jan", value January
    - key "Feb", value February
    - dst...
    Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
    - Jan -> January
    - Feb -> February
    - Dst...

    Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
    - "It's {$monthNow} now, I was born in {$birthMonth}"
     */
    val month = mapOf(
        "Jan" to "January",
        "Feb" to "Febuary",
        "Mar" to "March",
        "Apr" to "April",
        "May" to "May",
        "Jun" to "June",
        "Jul" to "July",
        "Aug" to "August",
        "Sep" to "September",
        "Oct" to "October",
        "Nov" to "November",
        "Dec" to "December"
    )
    month.forEach { a, b ->
        println("$a -> $b")
    }
    val monthNow = month.filterValues { it.startsWith("O") }
    val birthMonth = month.filterValues { it.startsWith("Jun") }
    println("It's ${monthNow.values} now, I was born in ${birthMonth.values}")
    println("Latihan 2<-END->")

}

