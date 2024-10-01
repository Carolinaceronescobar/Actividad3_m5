package com.example.actividad3_m5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.actividad3_m5.databinding.FragmentSecondBinding

/**
 * La funcion auctionPrice() verifica si hay una oferta válida (bid != null). si es así, devuelve el monto de la oferta; de lo contrario, devuelve el precio mínimo especificado.
 */
fun main() {
    val winningBid = Bid(5000, "Private Collector")
    println("Item A is sold at ${auctionPrice(winningBid, 2000)}.")
    println("Item B is sold at ${auctionPrice(null, 3000)}.")
}

class Bid(val amount: Int, val bidder: String)

fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {
    // Si hay una oferta válida, usar el monto de la oferta, de lo contrario usar el precio mínimo
    return bid?.amount ?: minimumPrice
}
