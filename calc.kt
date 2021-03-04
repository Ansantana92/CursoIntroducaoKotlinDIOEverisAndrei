
fun main(){
    println("Digite um numero")
    val a= readLine()!!.toFloat()
    println("Escolha a operação: 1-Soma 2-Subtração 3-Divisão 4-Multiplicação")
    var operador= readLine()!!.toInt()
    println("Digite outro numero")
    val b= readLine()!!.toFloat()
    var z:Float? = null
      when (operador){
           1 -> z=(a+b)
           2 -> z=(a-b)
           3 -> z=(a/b)
           4 -> z=(a*b)
       else -> null    
        } 
     println("O resultado é: " + z )
     
     
}
