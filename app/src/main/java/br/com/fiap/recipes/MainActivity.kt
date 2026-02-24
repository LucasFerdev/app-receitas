package br.com.fiap.recipes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import br.com.fiap.recipes.screens.HomeScreen
import br.com.fiap.recipes.screens.InicialScreen
import br.com.fiap.recipes.screens.InicialScreen
import br.com.fiap.recipes.screens.LoginForm
import br.com.fiap.recipes.screens.LoginScreen
import br.com.fiap.recipes.screens.SignupScreen
import br.com.fiap.recipes.ui.theme.RecipesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RecipesTheme {
                //InicialScreen()
                //SignupScreen()
                //LoginScreen()
                HomeScreen()
            }
        }
    }
}
