package mchehab.com.fragmentorientation

import org.parceler.Parcel
import org.parceler.ParcelConstructor
import org.parceler.ParcelProperty

/**
 * Created by muhammadchehab on 12/1/17.
 */

@Parcel
data class Person @ParcelConstructor
constructor(@ParcelProperty("firstName") val firstName: String,
            @ParcelProperty("lastName") val lastName: String,
            @ParcelProperty("age") val age: Int)