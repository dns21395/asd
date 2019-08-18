package com.dagger.kotlingeofiremultilocation

interface IOnLoadLocationListener {
    fun onLocationLoadSuccess(latLngs: List<MyLatLng>)
    fun onLocationLoadFailed(message: String)
}