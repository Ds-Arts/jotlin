Condicionasles  

 

 

 

  

  

import kotlin.math.PI 

  

  

  

fun main() { 

  

    val hola=1 

  

    while(hola==1){ 

  

        println("digite un numero teniendo en cuenta las siguientes opciones:\n 1. saber si el numero es positivo o negativo\n 2. cual numero es mayor\n 3. cual numero es mayor entre tres numeros\n 4. sumar o restar dependiendo del numero mayor\n 5. cociente entre dos numeros\n 6. sumar o multiplicar\n 7. year biciesto") 

  

        val seleccionar: Int =readLine()!!.toInt() 

  

        if(seleccionar==1){ 

            println("saber si el numero es positivo o negativo") 

            println("escribe un numero") 

            val num1: Int =readLine()!!.toInt() 

            if(num1<0){ 

                println("el numero es negativo") 

            }else { 

                println("el numero es positivo") 

            } 

  

        } 

  

        if(seleccionar==2){ 

  

            println("cual numero es mayor") 

  

            println("ingresa el numero 1 ") 

  

            val num1: Int =readLine()!!.toInt() 

  

            println("ingresa el numero 2 ") 

  

            val num2: Int =readLine()!!.toInt() 

  

            if(num1>num2){ 

                println("el numeor mayor es el numero 1 $num1") 

            }else if(num2>num1){ 

                println("el numeor mayor es el numero 2 $num2") 

            }else{ 

                println("los numeros son iguales") 

            } 

  

        } 

  

        if(seleccionar==3){ 

            println("cual numero es mayor") 

  

            println("ingresa el numero 1 ") 

  

            val num1: Int =readLine()!!.toInt() 

  

            println("ingresa el numero 2 ") 

  

            val num2: Int =readLine()!!.toInt() 

                         

            println("ingresa el numero 3 ") 

  

            val num3: Int =readLine()!!.toInt() 

             

            if(num1>num2 && num1>num3){ 

                println("el numero mayor es el numero 1 con el valor de  $num1") 

            }else if(num2>num1 && num2>num3){ 

                println("el numero mayor es el numero 2 con el valor de $num2") 

            }else if(num3>num2 && num3>num1){ 

                println("el numero mayor es el numero 3 con el valor de $num3") 

            }else{ 

                println("los numeros son iguales") 

            } 

  

        } 

  

        if(seleccionar==4){ 

  

            println("sumar o restar dependiendo del numero mayor") 

            println("ingresa el numero 1 ") 

  

            val A: Int =readLine()!!.toInt() 

  

            println("ingresa el numero 2 ") 

  

            val B: Int =readLine()!!.toInt() 

             

            if(A<B){ 

                println("se sumaron los numeros el resultado es ${A+B}") 

            }else{ 

                println("se restaron los numeros el resultado es ${A-B}") 

            } 

  

  

  

  

        } 

  

        if(seleccionar==5){ 

  

            println("cociente entre dos numeros")             

            println("ingresa el numero 1 como0 el divisor") 

  

            val A: Int =readLine()!!.toInt() 

  

            println("ingresa el numero 2 como el dividendo ") 

  

            val B: Int =readLine()!!.toInt() 

             

            if(A!=0 && B!=0){ 

                println("el cociente entre los dos numeros anteriores es ${A%B}\n") 

            }else{ 

                println("la division entre cero no es posible\n") 

            } 

  

        } 

  

        if(seleccionar==6){ 

  

            println("sumar o multiplicar") 

            println("ingresa el numero 1 ") 

  

            val num1: Int =readLine()!!.toInt() 

  

            println("ingresa el numero 2 ") 

  

            val num2: Int =readLine()!!.toInt() 

            if(num1<0 || num2<0){ 

                println("se sumaron los numeros y el resultado es ${num1+num2}\n") 

            }else{ 

                println("se multiplicarton los numeros y el resultado es ${num1*num2}\n") 

            } 

  

        } 

        if(seleccionar==7){ 

  

            println("year biciesto") 

            println("ingresa el year ") 

  

            val anio: Int =readLine()!!.toInt() 

  

        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))){ 

        println("El año es bisiesto") 

             

        }else{ 

    println("El año no es bisiesto"); 

            } 

        } 

  

    } 

  

} 