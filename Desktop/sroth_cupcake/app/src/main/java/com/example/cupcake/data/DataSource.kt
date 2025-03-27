
package com.example.cupcake.data

import com.example.cupcake.R

object DataSource {
    val flavors = listOf(
        R.string.vanilla,
        R.string.chocolate,
        R.string.red_velvet,
        R.string.salted_caramel,
        R.string.coffee,
        R.string.confetti
    )

    val quantityOptions = listOf(
        Pair(R.string.one_cupcake, 1),
        Pair(R.string.six_cupcakes, 6),
        Pair(R.string.twelve_cupcakes, 12),
        Pair(R.string.twentyFour_cupcakes, 24)
    )

    val cards = listOf(
        R.string.mastercard,
        R.string.american_express,
        R.string.visa
    )
}
