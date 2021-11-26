package com.example.socialnetworkcompose.data

import com.example.socialnetworkcompose.domain.MoApi
import kotlinx.coroutines.delay

class DelayFakeApi(private val time: Long) : MoApi {

    override suspend fun fetch(): String {
        delay(time)
        return "Kotlin"
    }
}