package me.demaisj.rickandmortyapiclient.model

import android.os.Parcelable
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
data class Location(
    val name: String,
    val url: String
) : Parcelable