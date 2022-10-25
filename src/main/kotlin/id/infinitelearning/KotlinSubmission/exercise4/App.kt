package id.infinitelearning.KotlinSubmission.exercise4

fun inputPin(pin: String){
    if (pin.isBlank()){
        throw Throwable("is Blank")
    } else {
        println("Pin yang diinput adalah $pin")
    }
}
fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */

    try {
        inputPin("12345")
        inputPin("") // blank
    }catch (error: Throwable ){}
    println("Tidak ada pin yang diinput")
}