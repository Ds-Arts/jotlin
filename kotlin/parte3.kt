fun main() { 
    val hola=1 
    while(hola==1){ 
        println("digite un numero teniendo en cuenta las siguientes opciones:\n 1. multiplos de 3\n 2. numeros impares\n 3. numeros pares\n 4. cuadrado de numeros\n 5. suma de los cuadrados\n 6. numeros entre uno y otro\n 7. suma de numeros de teclado\n") 

        val seleccionar: Int =readLine()!!.toInt() 

        if(seleccionar==1){ 
            
            println("multiplos de 3\n")
            
        for (num in 1..100) {
            if (num % 3 == 0) {
                print("$num \n")
                }   
            }
            
        } 
        if(seleccionar==2){ 
            println("numeros impares\n")
  
        for (num in 1..100) {
            if (num % 2 == 1) {
                print("$num \n")
                }   
            } 
        } 
        if(seleccionar==3){ 
            println("numeros pares\n")
          for (num in 1..100) {
            if (num % 2 == 0) {
                print("$num \n")
                }   
            }

        } 
        if(seleccionar==4){ 

            println("cuadrado de numeros")
              for (num in 1..30) {
                val operacion=num*num
                print("el cuadrado del numero $num es $operacion \n")
                 
            }  
        } 
        if(seleccionar==5){ 
            
            println("suma de los cuadrados")
              for (num in 1..100) {
                val operacion=num*num
                val suma=operacion+operacion
                if(num==100){
                    println("la suma de los cuadrados de los numeros del 1 al 100 $suma\n")
                }
            } 

        } 

        if(seleccionar==6){ 
            println("numeros entre uno y otro")
            println("Digite el numero 1")
            val num1: Int = readLine()!!.toInt()

            println("Digite el numero 2 que sea mayor que el numero 1")
            val num2: Int = readLine()!!.toInt()

            var num = num1 + 1
            println("Los numeros entre el numero 1 y el numero 2 son")
            while (num < num2) {
                println("$num\n")
                num++
            }
            if(num1>num2){
                println("no se pudo hacer la operacion")
            }else if(num1==num2){
                println("no se pudo hacer la operacion")
            }

        } 
        if(seleccionar==7){ 
            println("suma de numeros de teclado")
            var suma=0
            println("digita la cantidad de numeros que deseas sumar")
            val valores: Int = readLine()!!.toInt()
            for(num in 1..valores){
                println("digite numero $num que quiere sumar")
                var num1: Int = readLine()!!.toInt()
                while (num1 == 0) {
                    println("Digite otro número que no sea 0")
                    num1 = readLine()!!.toInt()
                }
                suma=suma+num1

            }
            println("el resultado de la suma es $suma\n")
            }
    } 
}