package com.example.wazitoecommerce.ui.theme.screens.splash

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.HOME_URL
import com.example.wazitoecommerce.navigation.SIGNUP_URL
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : ComponentActivity() {
    @SuppressLint("CoroutineCreationDuringComposition")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SplashScreen(navController = rememberNavController())

        }
    }
}

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavController){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {


        val coroutine = rememberCoroutineScope()
        coroutine.launch {
            delay(2000)
            navController.navigate(SIGNUP_URL)
        }
        Image(painter = painterResource(id = R.drawable.child7),
            contentDescription ="Splash",
            modifier = Modifier
                .size(width = 90.dp, height = 75.dp)
                .size(100.dp)
        )

          Text(text = "Child Monitoring",
              fontSize = 25.sp,
              fontFamily = FontFamily.Cursive,
              fontWeight = FontWeight.Bold,
              textAlign = TextAlign.Center,
              color = Color.Black)





    }

}


@Preview(showBackground = true)
@Composable
fun MySplashPreview(){
    SplashScreen(navController = rememberNavController())
}