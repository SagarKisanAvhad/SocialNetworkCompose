package com.example.socialnetworkcompose.data

import com.example.socialnetworkcompose.domain.MoApi

class FakeMoApi : MoApi {
    override suspend fun fetch() = "Kotlin"
}