package com.example.actividad3_m5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.actividad3_m5.databinding.FragmentFirstBinding

/**
 * Se declara y modifica una variable, calculando la suma y el promedio de los tres valores, imprimiendo los resultados antes y despues de modificar la variable
 */
fun main() {
    // Declarar variables
    var num1 = 10
    val num2 = 33
    val num3 = 66

    // Calcular la suma
    var suma = num1 + num2 + num3
    println("Suma inicial: $suma")

    // Modificar la variable num1
    num1 = 55

    // Calcular de nuevo la suma
    suma = num1 + num2 + num3
    println("Suma después de modificar num1: $suma")

    // Calcular el promedio
    val promedio = suma / 3
    println("Promedio: $promedio")
}
