package com.example.socialnetworkcompose.presentation.splash

import com.example.socialnetworkcompose.domain.MoApi
import kotlinx.coroutines.withTimeout

class SplashViewModel {
    suspend fun loadData(api: MoApi) = api.fetch()
    suspend fun loadDataTimeout(api: MoApi) =
        withTimeout(5_000) {
            api.fetch()
        }
}