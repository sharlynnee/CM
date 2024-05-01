package com.example.wazitoecommerce.ui.theme.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.ui.theme.screens.signup.SignUpScreen
import androidx.compose.ui.unit.dp as dp1

@Composable
fun DashboardScreen(navController: NavController) {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp1),
            verticalArrangement = Arrangement.Top
        ) {
            Text(
                text = "Dashboard",
                style = MaterialTheme.typography.headlineLarge,
                modifier = Modifier.padding(bottom = 24.dp1)
            )
            ChildOverview()
            Spacer(modifier = Modifier.height(16.dp1))
            SummaryOfActivities()
            Spacer(modifier = Modifier.height(16.dp1))
            QuickActions()
        }
    }
}

@Composable
fun ChildOverview() {
    Card(
        modifier = Modifier.fillMaxWidth(),
    ) {
        Column(
            modifier = Modifier.padding(16.dp1)
        ) {
            Text(
                text = "Child Overview",
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier.padding(bottom = 8.dp1)
            )
            // Display list of children being monitored
            // For simplicity, a placeholder text is used here
            Text("Child 1")
            Text("Child 2")
            Text("Child 3")
        }
    }
}

@Composable
fun SummaryOfActivities() {
    Card(
        modifier = Modifier.fillMaxWidth(),
    ) {
        Column(
            modifier = Modifier.padding(16.dp1)
        ) {
            Text(
                text = "Summary of Activities",
                style = MaterialTheme.typography.displayMedium,
                modifier = Modifier.padding(bottom = 8.dp1)
            )
            // Display summary of recent activities
            // For simplicity, a placeholder text is used here
            Text("Recent Location: Playground")
            Text("Screen Time: 2 hours")
            Text("Online Activity: Moderate")
        }
    }
}

@Composable
fun QuickActions() {
    Card(
        modifier = Modifier.fillMaxWidth(),
    ) {
        Column(
            modifier = Modifier.padding(16.dp1)
        ) {
            Text(
                text = "Quick Actions",
                style = MaterialTheme.typography.displayMedium,
                modifier = Modifier.padding(bottom = 8.dp1)
            )
            // Display quick actions or shortcuts
            // For simplicity, a placeholder text is used here
            Text("View Detailed Report")
            Text("Set Geofence")
            Text("Send Message")
        }
    }
}
@Composable
@Preview(showBackground = true)
fun DashboardScrenPreview(){
    DashboardScreen(navController = rememberNavController())
}
