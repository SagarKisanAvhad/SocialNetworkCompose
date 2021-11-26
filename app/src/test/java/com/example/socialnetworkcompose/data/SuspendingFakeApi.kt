package com.example.socialnetworkcompose.data

import com.example.socialnetworkcompose.domain.MoApi
import kotlinx.coroutines.CompletableDeferred

class SuspendingFakeApi : MoApi {
    private val deferred = CompletableDeferred<String>()

    override suspend fun fetch(): String = deferred.await()
}