 fun main() {
        println("Celcius-Fahrenheit:"+celciusToFahrenheit(50))
        println("Dikdörtgenin Çevresi:"+DiktörgenÇevresi( 5,7))
        println("Faktöriyel:"+faktöriyel(6))
        println("A sayısı"+kaçA("adama"))
        println("İç açılar toplamı:"+içAçılarToplamı(5))
        println("Maaş:"+maaşHesapla(25))
        println("İnternet Fiyatı:"+fiyatHesapla(55))
    }

    fun celciusToFahrenheit(celcius: Int): Double {
        val fahrenheit = celcius * 1.8 + 32
        return fahrenheit
    }

    fun DiktörgenÇevresi(kenar1: Int, kenar2: Int): Int {
        val çevre = kenar1 * 2 + kenar2 * 2
        return çevre
    }

    fun faktöriyel(sayı: Int): Int {
        var faktöriyel = 1
        if (sayı == 0) {
            faktöriyel = 0
        } else {
            for (i in 1..sayı) {
                faktöriyel *= i
            }
        }
        return faktöriyel
    }
    fun kaçA(kelime:String):Int{
        var a=0
        for(i in kelime){
            if(i.equals('a')){
             a++
            }
        }
        return a;
    }
    fun içAçılarToplamı(kenarSayısı:Int):Int{
        return (kenarSayısı-2)*180
    }
    fun maaşHesapla(günSayısı:Int):Int{
        return if(günSayısı<=20){
            günSayısı*8*10
        } else{
            20*8*10 + (günSayısı-20)*8*20
        }
    }
    fun fiyatHesapla(kota:Int):Int{
        return if(kota<=50){
            100
        } else{
            100 + (kota-50)*4
        }
    }
