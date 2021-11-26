package com.example.socialnetworkcompose.domain

interface MoApi {
    suspend fun fetch(): String
}