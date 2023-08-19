class DataClass {


    /*
    1.Otomatis toString()
    Biasanya kan namaPackage.namaKelas@memoryAddress
    Sedangkan -> NamaClass(param1,...)
    2.equals()
    Untuk membandingkan data class dengan sesamanya
    Data Class = membandingkan isinya
    Class biasa = membandingkan alamat memory
    3.copy()
    Mengcopy isi dari object data class ke yang lain(harus sama data classnya)
    4.componentN(),N=angka,mulai dari 1
    Destructuring Declaration,Mahasiswa(comp1,comp2)
    val nim:String = object.component1()
    val pass:String = object.component2()
    atau
    val (nim,pass) = object
    intinya mengekstrak class variable suatu object

    Hal diatas memang bisa dilakukan di class biasa
    tetapi kita perlu mengoverride metode atau membuatnya.
     */

    fun showThreeMethod(){
        val biasaMhs1 = MahasiswaBiasa("132131231","123")
        val dataMhs1  = MahasiswaData("132131231","123")
        val dataMhs2  = dataMhs1.copy(password = "321")
        println("Class Biasa:$biasaMhs1\nData Class:$dataMhs1\n")

        //Compare equals()
        println(dataMhs1.equals(dataMhs2))
    }

    class MahasiswaBiasa(val NIM:String,val password: String)
    data class MahasiswaData(val NIM:String,val password:String)
}