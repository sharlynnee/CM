package com.example.wazitoecommerce.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.ui.theme.screens.children.AddChildrenScreen
import com.example.wazitoecommerce.ui.theme.screens.children.ViewChildrenScreen
import com.example.wazitoecommerce.ui.theme.screens.dashboard.DashboardScreen
import com.example.wazitoecommerce.ui.theme.screens.home.HomeScreen
import com.example.wazitoecommerce.ui.theme.screens.login.LoginScreen
import com.example.wazitoecommerce.ui.theme.screens.parents.AddParentsScreen
import com.example.wazitoecommerce.ui.theme.screens.parents.ViewParentsScreen
import com.example.wazitoecommerce.ui.theme.screens.signup.SignUpScreen
import com.example.wazitoecommerce.ui.theme.screens.splash.SplashScreen



@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController:NavHostController = rememberNavController(),
    startDestination:String = LOGIN_URL
){
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier){
        composable(LOGIN_URL){
            LoginScreen(navController = navController)
        }
        composable(SIGNUP_URL){
           SignUpScreen(navController = navController)
        }
        composable(HOME_URL){
            HomeScreen(navController = navController)
        }
        composable(ADD_CHILDREN_URL){
            AddChildrenScreen(navController = navController)
        }
        composable(VIEW_CHILDREN_URL){
            ViewChildrenScreen(navController = navController)
        }

        composable(SPLASH_URL){
            SplashScreen(navController = navController )
        }
        composable(DASHBOARD_URL){
            DashboardScreen(navController = navController )
        }
        composable(ADD_PARENTS_URL){
            AddParentsScreen(navController = navController)
        }
        composable(VIEW_PARENTS_URL){
            ViewParentsScreen(navController = navController)
        }
    }
}