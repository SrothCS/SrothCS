
package com.example.cupcake.data

/**
 * Data class that represents the current UI state in terms of [quantity], [flavor],
 * [dateOptions], selected pickup [date] and [price]
 */
data class OrderUiState(
    /** Selected cupcake quantity (1, 6, 12) */
    val quantity: Int = 0,
    /** Flavor of the cupcakes in the order (such as "Chocolate", "Vanilla", etc..) */
    val flavor: String = "",
    /** Selected date for pickup (such as "Jan 1") */
    val date: String = "",
    /** Total price for the order */
    val card: String = "",

    val address: String = " ",

    val price: String = "",


    /** Available pickup dates for the order*/
    val pickupOptions: List<String> = listOf(),

    val name: String = " ",


    val cardNum: String = " ",

    val expired: String = " ",

    val security: String= " "


)
