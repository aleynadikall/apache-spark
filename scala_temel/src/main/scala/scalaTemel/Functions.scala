package scalaTemel

object Functions {

  def main(args: Array[String]): Unit = {
    /*
    * def fonksiyonAdi(parametre1:Türü, parametre2:Türü): DönecekVeriTürü={
    *
    *   fonksiyon kodları
    *
    *   return sonuç
    * }
    * */
    // Dönüş türü Unit olursa fonksiyon çalışır ancak birşey döndürmez java void gibi

    def topla(sayi1:Int, sayi2:Int):Int={
      return sayi1+sayi2
    }
    println("Toplam: " + topla(2,5))



    def carp(sayi1:Int, sayi2:Int):Int={
      sayi1 * sayi2 // return kullanılmadığına dikkat. Scala dönüş türüne uygun en son değeri döndürür.
    }
    println("Çarpım: " + carp(2,5))



    def kendiniTanit(isim:String, yas:Int): Unit ={
      println("Benim adım: " + isim + ", yaşım: " + yas)
    }

    kendiniTanit("Nebi", 33) // Sonuç: Benim adım: Nebi, yaşım: 33



    def sayilariTopla(args: Int*):Int={
      var toplam = 0
      for(i <- args){
        toplam += i
      }
      toplam
    }
    println("args ile sayilarin toplami: " + sayilariTopla(1,2,3,4,5))



    // Fonksiyon kullanmanın farklı bir yöntemi
    val ikiSayiTopla = (x:Int, y:Int) => x + y

    println("İki sayının fonksiyon ile toplanması: " + ikiSayiTopla(5,3))



    // Biraz daha zor bir fonksiyon
    def ikiSayiCarpimVeToplam(x:Double, y:Double):(Double, Double)={
      var carpim:Double = 0
      var toplam:Double = 0
      carpim = x * y
      toplam = x + y

      (carpim,toplam)
    }

    // Daha da kısaltalım
    def ikiSayiCarpimVeToplam2(x:Double, y:Double):(Double, Double)={

      (x*y,x+y)
    }


    val (carpmaSonuc, toplamaSonuc) = ikiSayiCarpimVeToplam(25.0, 30.0)
    println("Çarpma: " + carpmaSonuc + " Toplama: " + toplamaSonuc)



    val ikiSayiCarpimVeToplamDF = (x:Double, y:Double) =>{

      (x*y, x+y)
    }

    val (carpmaSonucDF, toplamaSonucDF) = ikiSayiCarpimVeToplamDF(3.0,5.0)
    println("carpmaSonucDF: "+ carpmaSonucDF + " toplamaSonucDF: " + toplamaSonucDF)



  }
}
