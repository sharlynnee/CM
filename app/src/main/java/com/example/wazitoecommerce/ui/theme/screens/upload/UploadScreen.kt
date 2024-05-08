package com.example.wazitoecommerce.ui.theme.screens.upload

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.VIEW_CHILDREN_URL



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UploadScreen(navController: NavController){
    Column(modifier = Modifier
        .fillMaxSize()
        .paint(
            painterResource(id = R.drawable.background),
            contentScale = ContentScale.FillBounds
        )




    ) {
        val mContext = LocalContext.current

        var firstname by remember { mutableStateOf("") }
        var lastname by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var contact by remember { mutableStateOf("") }

        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Image(painter = painterResource(id = R.drawable.report) ,
                contentDescription ="register",
                modifier = Modifier.size(160.dp))
        }
        Text(
            text = "Enter the kids details",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(10.dp))
        TextField(
            value =firstname ,
            onValueChange ={firstname = it},
            placeholder = { Text(text = "Fullname")},
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription ="person" )},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        Spacer(modifier = Modifier.height(10.dp))
        TextField(
            value =email ,
            onValueChange ={email= it},
            placeholder = { Text(text = "Last place seen")},
            leadingIcon = { Icon(imageVector = Icons.Default.Place, contentDescription ="location" )},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        Spacer(modifier = Modifier.height(10.dp))
        TextField(
            value =lastname ,
            onValueChange ={lastname = it},
            placeholder = { Text(text = "Description")},
            leadingIcon = { Icon(imageVector = Icons.Default.Info, contentDescription ="DESCRIPTION" )},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        Spacer(modifier = Modifier.height(10.dp))
        Spacer(modifier = Modifier.height(10.dp))
        TextField(
            value =contact ,
            onValueChange ={contact = it},
            placeholder = { Text(text = " Parents Phone Number")},
            leadingIcon = { Icon(imageVector = Icons.Default.Call, contentDescription ="Call" )},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)
        )
        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = {},
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(Color.DarkGray),
            shape = CircleShape
        ) {
            Text(text = "REPORT")
        }







    }
}

@Preview(showBackground = true)
@Composable
fun UploadScreenPreview(){
    UploadScreen(navController = rememberNavController())

}