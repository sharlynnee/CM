package com.example.wazitoecommerce.ui.theme.screens.search

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.remember
import androidx.compose.ui.res.painterResource
import coil.compose.rememberImagePainter

data class Child(
    val id: Int,
    val name: String,
    val age: Int,
    val imageUrl: String // Assuming you have an image for each child
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchScreen(children: List<Child>, onSearch: (String) -> Unit) {
    var searchText by remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(16.dp)) {
        // Search Bar
        OutlinedTextField(
            value = searchText,
            onValueChange = {
                val it = ""
                searchText = it
            },
            label = { Text("Search") },
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),

        )

        Spacer(modifier = Modifier.height(16.dp))

        // Search Results
        LazyColumn {
            items(children.filter {
                it.name.contains(searchText, ignoreCase = true)
            }) { child ->
                ChildItem(child = child)
            }
        }
    }
}

fun OutlinedTextField(value: String, onValueChange: () -> Unit, label: @Composable () -> Unit, modifier: Modifier, keyboardOptions: KeyboardOptions, onImeActionPerformed: Any) {

}

@Composable
fun ChildItem(child: Child) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    ) {
        Image(
            painter = rememberImagePainter(child.imageUrl),
            contentDescription = null,
            modifier = Modifier.size(72.dp),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(text = child.name)
            Text(text = "Age: ${child.age}")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    val children = listOf(
        Child(1, "Alice", 5, "https://example.com/alice.jpg"),
        Child(2, "Bob", 7, "https://example.com/bob.jpg"),
        Child(3, "Charlie", 4, "https://example.com/charlie.jpg")
    )
    SearchScreen(children = children) { }
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val children = listOf(
                Child(1, "Alice", 5, "https://example.com/alice.jpg"),
                Child(2, "Bob", 7, "https://example.com/bob.jpg"),
                Child(3, "Charlie", 4, "https://example.com/charlie.jpg")
            )
            SearchScreen(children = children) { }
        }
    }
}

