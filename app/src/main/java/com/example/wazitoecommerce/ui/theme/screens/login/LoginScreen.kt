package com.example.wazitoecommerce.ui.theme.screens.login

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.DASHBOARD_URL


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavHostController) {
    val usernameState = remember { mutableStateOf("") }
    val passwordState = remember { mutableStateOf("") }

    // Background image
    val backgroundImage: Painter = painterResource(id = R.drawable.background)

    // Main UI
    Scaffold(
        content = {
            Box(modifier = Modifier.fillMaxSize()) {
                // Background image
                Image(
                    painter = backgroundImage,
                    contentDescription = "Background Image",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier.fillMaxSize()
                )
                // Login Form
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .align(Alignment.Center)
                ) {
                    Text(
                        text = "Login",
                        fontSize = 30.sp,
                        color = Color.White
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    OutlinedTextField(
                        value = usernameState.value,
                        onValueChange = { usernameState.value = it },
                        label = { Text("Username") },
                        modifier = Modifier.fillMaxWidth()
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    OutlinedTextField(
                        value = passwordState.value,
                        onValueChange = { passwordState.value = it },
                        label = { Text("Password") },
                        modifier = Modifier.fillMaxWidth()
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Button(
                        onClick = { navController.navigate(DASHBOARD_URL) },
                        modifier = Modifier.fillMaxWidth()

                    ) {
                        Text(text = "Login")
                    }

                }
            }
        }
    )
}




@Composable
@Preview(showBackground = true)
fun LoginScreenPreview(){
    LoginScreen(navController = rememberNavController())
}