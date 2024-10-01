package id.sample.fooduapp.data

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Food(
    var name: String,
    var description: String,
    var owner: String,
    var location: String,
    var distanceInKM: Double,
    var cost: Long,
    var rating: Float,
    var cover: Int
) : Parcelable {
    override fun describeContents(): Int {
        TODO("Not yet implemented")
    }

    override fun writeToParcel(p0: Parcel?, p1: Int) {
        TODO("Not yet implemented")
    }
}