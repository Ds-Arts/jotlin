  

  

import kotlin.math.PI 

  

  

  

fun main() { 

  

    val hola=1 

  

    while(hola==1){ 

  

        println("digite un numero teniendo en cuenta las siguientes opciones:\n 1. Calcular el area de un triangulo\n 2. sumar dos numeros\n 3. Numero elevado al cuadrado\n 4. euros a dolares\n 5. area y perimetro de un cuadrado\n 6. area y volumen de un cilindro\n 7. Area de un circulo\n 8. promedio de tres numeros") 

  

        val seleccionar: Int =readLine()!!.toInt() 

  

        if(seleccionar==1){ 

  

            println("calcular el area de un triangulo") 

  

            println("ingresa la base del triangulo") 

  

            val base: Int =readLine()!!.toInt() 

  

            println("ingresa la altura del triangulo") 

  

            val altura: Int =readLine()!!.toInt() 

  

            println("el triangulo con la base de $base y la aldura de $altura tiene un area de: ${(base*altura)/2}") 

  

        } 

  

        if(seleccionar==2){ 

  

            println("sumar dos numeros") 

  

            println("ingresa el numero 1") 

  

            val num1: Int =readLine()!!.toInt() 

  

            println("ingresa el numero 2") 

  

            val num2: Int =readLine()!!.toInt() 

  

            println("el total de la suma del numero uno con el valor de $num1 y el numero 2 co el valor de: $num2 es ${num1+num2}") 

  

        } 

  

        if(seleccionar==3){ 

  

            println("numero elevado al cuadrado") 

  

            println("digite el numero que desee") 

  

            val num1: Int =readLine()!!.toInt() 

  

            println("el numero $num1 elevado al cuadrado tiene un valor de ${num1*num1}") 

  

        } 

  

        if(seleccionar==4){ 

  

            println("euro a dolar") 

  

            println("digite el valor en euros") 

  

            val euro: Int =readLine()!!.toInt() 

  

            println("el valor del $euro euro en dolares s ${euro*1.12}") 

  

  

  

        } 

  

        if(seleccionar==5){ 

  

            println("Area y perimetro de un cuadrado") 

  

            println("digite el lado del cuadrado") 

  

            val lado:Int =readLine()!!.toInt() 

  

            println("el cuadrado con el lado de $lado tiene un area de ${lado*2} y un perimetro de ${lado*4}") 

  

        } 

  

        if(seleccionar==6){ 

  

            println("area y volumen de un cilindro") 

  

            println("digite la altura del cilindro") 

  

            val altura:Int =readLine()!!.toInt() 

  

            println("digite el diametro del cilindro") 

  

            val diametro:Int =readLine()!!.toInt() 

  

            val radio=diametro/2 

  

            val area= 2*PI*radio*altura + 2*PI*radio*radio; 

  

            val volumen=PI*radio*radio*altura; 

  

            println(area) 

  

            println(volumen) 

        } 

        if(seleccionar==7){ 

  

            println("area y volumen de un circulo") 

  

            println("digite la longitud del circulo") 

  

            val longitud: Int =readLine()?.toInt() ?:0 

            val radio=longitud/(2*PI) 

            println("el radio es $radio") 

  

            val area=PI*(radio*radio) 

  

            println("el area es $area") 

  

            } 

        if(seleccionar==8){ 

            println("promedio de tres numeros") 

            println("ingresa el numero 1") 

            val num1: Int =readLine()!!.toInt()  

            println("ingresa el numero 2") 

            val num2: Int =readLine()!!.toInt() 

             

            println("ingresa el numero 3") 

            val num3: Int =readLine()!!.toInt() 

             

            val promedio=(num1+num2+num3)/3 

            println("el promedio de los rtres numero es $promedio") 

        } 

         

         

    } 

  

} 