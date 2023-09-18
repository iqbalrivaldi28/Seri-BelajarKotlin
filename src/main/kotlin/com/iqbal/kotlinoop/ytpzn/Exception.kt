package com.iqbal.kotlinoop.ytpzn

/**
 * Error di Kotlin bisa direpresentasikan dengna Exception, dimana semua tipe data errpr pasti akan selalu class turunan dari Throwable
 *
 * Try Cath adalah mencoba melakukan sesuatu jika terjadi error, maka akan di tangkap lalu kita beri aksi sesuai dengan yang kita mau
 *
 * Try = Blok kod programe yang kemungkinan bisa terjadi sebuah error
 * Catch = Adalah tangkap jenis errornya
 * Finally = Blok ini akan selalu di ekseukusi setalah kode program Ty Catch, tidak perduli baik itu sukse atau gagal
 *
 * Multiple Catch adalah menangkap jenis exception yang berbeda
 */

fun main() {

    try {
        validateAndSayHello("Naisa")
        validateAndSayHello("")
    } catch (error: ValidationException){
        println("Terjadi error ${error.message}")
    } finally {
        println("Ini akan selalu di eksekusi, Program Selesai!")
    }


    // Multiple Try Catch
    try {
        validateAndSayHello("Naisa")
        validateAndSayHello("")
    } catch (error: ValidationException){
        println("Terjadi error ${error.message}")
    } catch (error: Throwable){
        println("Terjadi error ${error.message}")
    }
}


// Membuat Exceotion Sendiri. Dia muncul di Log Run dengan pesan yang kita buat
class ValidationException(message: String) : Throwable(message) {
}


fun validateAndSayHello(name: String){
    if (name.isBlank()){
        throw ValidationException("Name is Blank!")
    } else {
        println("Hello $name")
    }
}