package br.com.fiap.recipes.screens

import android.graphics.drawable.Icon
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.fiap.recipes.ui.theme.RecipesTheme
import br.com.fiap.recipes.R

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()

    ) {
        Scaffold(
            topBar = { MyTopAppBar()},
            bottomBar = {MyBottomAppBar()},
            floatingActionButton = {}
        ) { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
            ) {

            }
        }
    }
}

@Preview
@Composable
private fun HomeScreenPreview() {
    RecipesTheme {
        HomeScreen()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopAppBar(modifier: Modifier = Modifier) {
    TopAppBar(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp),
        title = {
            Row(
                modifier = Modifier
                    .padding(4.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column() {
                    Text(
                        text = "Hello, João!",
                        style = MaterialTheme.typography.bodyLarge,
                        color = MaterialTheme.colorScheme.primary,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "joão@email.com",
                        style = MaterialTheme.typography.displaySmall
                    )
                }
                Card(
                    modifier = Modifier.size(48.dp),
                    shape = CircleShape,
                    colors = CardDefaults
                        .cardColors(
                            containerColor = Color.Transparent
                        ),
                    border = BorderStroke(
                        width = 1.dp,
                        color = MaterialTheme.colorScheme.primary
                    )
                ) {
                    Image(
                        painter = painterResource(R.drawable.user),
                        contentDescription = "User image"
                    )
                }
            }
        }
    )
}

@Preview
@Composable
private fun MyTopAppBarPreview() {
    RecipesTheme() {
        MyTopAppBar()
    }
}

data class BottomNavigationItem(
    val title: String,
    val icon: ImageVector
)

@Composable
fun MyBottomAppBar(modifier: Modifier = Modifier) {
    val items = listOf(
        BottomNavigationItem("Home", icon = Icons.Default.Home),
        BottomNavigationItem("Home", icon = Icons.Default.Favorite),
        BottomNavigationItem("Home", icon = Icons.Default.Person),
    )
    NavigationBar(
        containerColor = MaterialTheme.colorScheme.tertiary
    ) {
        items.forEach { item ->
            NavigationBarItem(
                selected = false,
                onClick = {},
                icon = {
                    androidx.compose.material3.Icon(
                        imageVector = item.icon,
                        contentDescription = item.title,
                        tint = MaterialTheme.colorScheme.onTertiary,
                        modifier = Modifier.size(24.dp)
                    )
                },
                label = {
                    Text(
                        text = item.title,
                        style = MaterialTheme.typography.displaySmall,
                        color = MaterialTheme.colorScheme.onTertiary
                    )
                }
            )
        }
    }
}

@Preview
@Composable
private fun MyBottomAppBarPreview() {
    RecipesTheme {
        MyTopAppBar()
    }
}











