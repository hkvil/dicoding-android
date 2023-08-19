class CollectionExample {
    /*
    Collection = Menyimpan Object lain,Koleksi,Banyak.
    List,Map,Set = Turunan Collection
    Mutable dan Immutable,Bisa dan Tidak untuk dimanipulasi setelah deklarasi
    1.List
    Dapat menampung data dengan tipe berbeda,berbalik dengan array.
    -listOf(1,2,..) dan mutableListOf(1,2..)
    2.Set
    Tidak Duplikat,Union,intersect,tidak bisa a[i]
    3.Map
    Key,Value
    L,Laki-laki
    P,Perempuan
    gender.keys -> L,P
    gender.values ->Laki-laki,Perempuan

    Collections Operator
    1.filter() dan filterNot()
    filter    = mengembalikan yang sesuai argumen
    filterNot = !mengembalikan yang sesuai argumen
    2.map()   = Memanipulasi,misal 1,2,3 map{it - it} -> 0,0,0
    3.count() = Menghitung jumlah item pada collection
    $.Kalo di atas berlaku untuk semua item pada list
    4.first() = mencari item pertama sesuai filter
    5.last()  = item terakhir
    6.sum()   =total
    7.sorted()=mengurutkan

    BAGAIMANA KALO ITEMNYA 9999999999999? TAPI NYARI
    KELIPATAN 9999999999999,dengan metode di atas
    maka program akan ngecek peritem,GANGARUH.
    Ada yang namanya sequence pake list.asSequence()
    maka dia ga ngecek,ya intinya anu
    bisa dibilang pola,contoh sequence bilang genap,ganjil,palindrome
    caranya?

    val a = generateSequence(firstItem){it+2//POLA}

     */
}