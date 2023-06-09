package id.infinitelearning.KotlinSubmission.exercise4



    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    fun main() {
        try {
            val result = divide(5, 10)
            println("Hasil pembagian: $result")
        } catch (e: ArithmeticException) {
            println("Terjadi kesalahan: ${e.message}")
        } finally {
            println("Eksekusi blok finally.")
        }
    }

    fun divide(a: Int, b: Int): Int {
        return a / b
    }


