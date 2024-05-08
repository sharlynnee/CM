package com.example.wazitoecommerce.ui.theme.screens.signup

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.DASHBOARD_URL

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpScreen(navController: NavHostController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }
    val focusManager = LocalFocusManager.current
    val context = LocalContext.current


    val backgroundImageRes = R.drawable.background

    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            // Background image
            Image(
                painter = painterResource(id = backgroundImageRes),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.FillBounds
            )

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Sign Up",
                    modifier = Modifier.padding(bottom = 24.dp)
                )
                OutlinedTextField(
                    value = email,
                    onValueChange = { email = it },
                    label = { Text("Email") },
                    modifier = Modifier.fillMaxWidth(),
                    singleLine = true
                )
                Spacer(modifier = Modifier.height(16.dp))
                OutlinedTextField(
                    value = password,
                    onValueChange = { password = it },
                    label = { Text("Password") },
                    modifier = Modifier.fillMaxWidth(),
                    singleLine = true,
                    visualTransformation = PasswordVisualTransformation(),
                )
                Spacer(modifier = Modifier.height(16.dp))
                OutlinedTextField(
                    value = confirmPassword,
                    onValueChange = { confirmPassword = it },
                    label = { Text("Confirm Password") },
                    modifier = Modifier.fillMaxWidth(),
                    singleLine = true,
                    visualTransformation = PasswordVisualTransformation(),
                    isError = password != confirmPassword && confirmPassword.isNotBlank(),
                    trailingIcon = {
                        if (password != confirmPassword && confirmPassword.isNotBlank()) {
                            Icon(
                                painter = painterResource(id = R.drawable.child7),
                                contentDescription = "Password Mismatch",
                                modifier = Modifier.padding(end = 8.dp)
                            )
                        }
                    }
                )
                Spacer(modifier = Modifier.height(24.dp))
                Button(
                    onClick = {
                        focusManager.clearFocus()
                        onSignUpClicked()
                    },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("Sign Up")
                }
                Text(text = "Already have an Account?Login",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center)
                Button(
                    onClick = {
                        navController.navigate(DASHBOARD_URL)
                    },
                    modifier = Modifier
                        .padding(start = 30.dp, end = 30.dp)
                )
            }
        }
    }
}

fun onSignUpClicked() {
    TODO("Not yet implemented")
}
fun Button(onClick: @Composable Function<Unit>, modifier: @Composable () -> Unit) {

}

@Composable
@Preview(showBackground = true)
fun SignUpScrenPreview(){
    SignUpScreen(navController = rememberNavController())
}
