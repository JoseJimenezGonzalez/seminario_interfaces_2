package com.example.seminariointerfaces

import android.graphics.drawable.Drawable
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Pais(var nombre: String, var foto: Int, var habitantes: Int): Parcelable
