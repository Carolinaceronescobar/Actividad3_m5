package com.example.actividad3_m5

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import com.example.actividad3_m5.databinding.ActivityMainBinding
/**
 * La funcion showProfile() imprime detalles del perfil, verificando si la persona tiene un hobby y si tiene un referenciador
 */
fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)
    amanda.showProfile()
    atiqah.showProfile()
}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        // Imprimir nombre y edad
        println("Name: $name")
        println("Age: $age")

        // Verificar si la persona tiene un hobby
        if (hobby != null) {
            print("Likes to $hobby. ")
        } else {
            print("Doesn't have any hobbies. ")
        }

        // Verificar si tiene un referenciador
        if (referrer != null) {
            println("Has a referrer named ${referrer.name}, who likes to ${referrer.hobby}.")
        } else {
            println("Doesn't have a referrer.")
        }
    }
}
