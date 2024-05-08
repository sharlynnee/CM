package com.example.wazitoecommerce.ui.theme.screens.share

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyApp() {
    MaterialTheme {
        Surface(
            color = Color.White,
            modifier = Modifier.fillMaxSize()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                var name by remember { mutableStateOf(TextFieldValue()) }
                var email by remember { mutableStateOf(TextFieldValue()) }
                var message by remember { mutableStateOf(TextFieldValue()) }
                var emailError by remember { mutableStateOf(false) }

                OutlinedTextField(
                    value = name,
                    onValueChange = { name = it },
                    label = { Text("Name") }
                )

                OutlinedTextField(
                    value = email,
                    onValueChange = {
                        email = it
                        emailError = !isValidEmail(it.text)
                    },
                    label = { Text("Email") },
                    isError = emailError,
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Email,
                        imeAction = ImeAction.Next
                    ),
                    keyboardActions = KeyboardActions(
                        onNext = {
                            if (!isValidEmail(email.text)) {
                                emailError = true
                            }
                        }
                    )
                )

                if (emailError) {
                    Text(
                        text = "Please enter a valid email address",
                        color = Color.Red,
                        modifier = Modifier.padding(start = 8.dp)
                    )
                }

                OutlinedTextField(
                    value = message,
                    onValueChange = { message = it },
                    label = { Text("Message") },
                    maxLines = 3
                )

                Button()
            }
        }
    }
}

fun Button() {

}

fun isValidEmail(email: String): Boolean {
    return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
}

@Composable
fun shareDetails(context: android.content.Context, name: String, email: String, message: String) {
    // Logic to share details on social media can be implemented here
    // For example, you can use Android's Share Intent to share the details
    // with other apps on the device.
}

@Preview
@Composable
fun PreviewMyApp() {
    MyApp()
}



