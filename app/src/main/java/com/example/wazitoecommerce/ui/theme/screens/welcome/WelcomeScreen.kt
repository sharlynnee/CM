package com.example.wazitoecommerce.ui.theme.screens.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.LOGIN_URL
import com.example.wazitoecommerce.navigation.SIGNUP_URL

@Composable
fun WelcomeScreen(navController: NavHostController) {
    MaterialTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .background(Color.White),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Welcome on Board!",
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 60.sp,
                modifier = Modifier.padding(top = 320.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))

            Image(painter = painterResource(id = R.drawable.child6),
                contentDescription ="Welcome",
                modifier = Modifier
                    .size(width = 260.dp, height = 360.dp)
                    .size(100.dp)
            )

            Text(text = "Create an account and you're all set to go!", style = MaterialTheme.typography.bodySmall,
                fontFamily = FontFamily.Default)
            Spacer(modifier = Modifier.height(36.dp),)
            Button(onClick = { navController.navigate(SIGNUP_URL) }) {
                Text(text = "SIGN UP")
            }
            TextButton(onClick = { navController.navigate(LOGIN_URL) }) {
                Text(text = "Log in then!")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WelcomeScreenPreview() {
   WelcomeScreen(navController = rememberNavController())
}
