package com.example.socialnetworkcompose.presentation.splash

import com.example.socialnetworkcompose.data.FakeMoApi
import com.example.socialnetworkcompose.data.SuspendingFakeApi
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.TimeoutCancellationException
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

@ExperimentalCoroutinesApi
class SplashViewModelTest {
    private lateinit var viewModel: SplashViewModel

    @Before
    fun setup() {
        viewModel = SplashViewModel()
    }


    @Test
    fun `test load data`() = runBlockingTest {
        val actual = viewModel.loadData(FakeMoApi())
        assertEquals("Kotlin", actual)
    }

    @Test(expected = TimeoutCancellationException::class)
    fun `test load data timeout`() = runBlockingTest {
        viewModel.loadDataTimeout(SuspendingFakeApi())
    }


}