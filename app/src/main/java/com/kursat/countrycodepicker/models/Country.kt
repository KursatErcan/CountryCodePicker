package com.kursat.countrycodepicker.models

import android.util.Log
import java.util.*

data class Country(var nameCode: String, val phoneCode: String, val name: String,var flagImg: String = "flag_turkey") {

    init {
        nameCode = nameCode.uppercase(Locale.ROOT)
        flagImg ="flag_" + name.lowercase().replace(" ","_")
        //var arr = flagImg.split("(")
        //flagImg = arr[0]
        //flagImg = flagImg.substring(0,flagImg.length-2)

        Log.d("Country : ","$name : $flagImg")
    }
}
