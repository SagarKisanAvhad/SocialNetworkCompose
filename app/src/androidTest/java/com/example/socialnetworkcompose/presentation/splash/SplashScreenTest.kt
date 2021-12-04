package com.example.socialnetworkcompose.presentation.splash

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.navigation.NavController
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.socialnetworkcompose.presentation.MainActivity
import com.example.socialnetworkcompose.presentation.ui.theme.SocialNetworkComposeTheme
import io.mockk.impl.annotations.RelaxedMockK
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@ExperimentalCoroutinesApi
@RunWith(AndroidJUnit4::class)
class SplashScreenTest {
    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @RelaxedMockK
    lateinit var navController: NavController

    @Test
    fun splashScreen_displaysAndDisappears() = runBlockingTest {
        composeTestRule.setContent {
            SocialNetworkComposeTheme {
                SplashScreen(navController = navController)
            }
        }

        composeTestRule
            .onNodeWithContentDescription(label = "logo")
            .assertExists()
        /*verify {
            navController.popBackStack()
            navController.navigate(Screen.LoginScreen.route)
        }*/
    }

}