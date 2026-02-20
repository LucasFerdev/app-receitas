package br.com.fiap.recipes

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.recipes.ui.theme.RecipesTheme
import br.com.fiap.recipes.ui.theme.poppinsFamily

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RecipesTheme {
                InicialScreew()
            }
        }
    }
}

@Composable
fun InicialScreew(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = MaterialTheme.colorScheme.background
            )
    ){
        Card(
            modifier = Modifier
                .width(160.dp)
                .height(85.dp)
                .align(Alignment.TopEnd),
            shape = RoundedCornerShape(
                bottomStart = 85.dp
            ),
            colors = CardDefaults
                .cardColors(
                    containerColor = MaterialTheme.colorScheme.primary
                )
        ){ }
        Card(
                modifier = Modifier
                    .width(160.dp)
                    .height(85.dp)
                    .align(Alignment.BottomStart),
        shape = RoundedCornerShape(
            topEnd = 85.dp
        ),
        colors = CardDefaults
            .cardColors(
                containerColor = MaterialTheme.colorScheme.primary
            )
        ){ }
        Column (
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
            painter = painterResource(R.drawable.cooking),
            contentDescription = "Imagem de uma mulher cozinhando.",
            modifier = Modifier
                .size(190.dp)

        )
            Spacer(modifier = Modifier.height(100.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    text = "UNLIMITED PREMIUM RECIPES",
                    color = MaterialTheme.colorScheme.secondary,
                    style = MaterialTheme.typography.titleSmall


                )
                Text(
                    text = "Start Cooking",
                    style = MaterialTheme.typography.displayLarge,
                    color = MaterialTheme.colorScheme.primary,
                    modifier = Modifier
                        .padding(top = 8.dp, bottom = 16.dp)
                )
                Row{
                    Button(
                        onClick = {},
                        colors = ButtonDefaults
                            .buttonColors(
                                containerColor = MaterialTheme.colorScheme.primary
                            ),
                        border = BorderStroke(
                            width = 1.dp,
                            color = MaterialTheme.colorScheme.tertiary
                        ),
                        modifier = Modifier
                            .size(width = 128.dp, height = 48.dp)
                    ) {
                        Text(
                            text = "Login",
                            color = MaterialTheme.colorScheme.onPrimary,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Button(
                        onClick = {},
                        colors = ButtonDefaults
                            .buttonColors(
                                containerColor = MaterialTheme.colorScheme.tertiary
                            ),
                        border = BorderStroke(
                            width = 1.dp, color = MaterialTheme.colorScheme.primary
                        ),
                        modifier = Modifier
                            .width(128.dp)
                            .height(48.dp)
                    ) {
                        Text(
                            text = "Sign up",
                            color = MaterialTheme.colorScheme.onTertiary,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }
    }
}


@Composable
@Preview(
    showBackground = true,
    showSystemUi = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO
)
fun InicialScreewPreview(){
    RecipesTheme {
        InicialScreew() // ← agora chama a tela certa
    }
}
