package sv.edu.utec.etps1.registroincidencias

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import sv.edu.utec.etps1.registroincidencias.ui.theme.RegistroIncidenciasTheme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RegistroIncidenciasTheme {
                RegistroIncidenciasApp()
            }
        }
    }
}
@Composable
fun RegistroIncidenciasApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFFFF9C4)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Balance Finanzas",
                style = MaterialTheme.typography.headlineMedium.copy(
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.SemiBold
                )
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = "Controla tus gastos, analiza tus gráficas, " +
                        "y mejora tu salud financiera."
            )
            Spacer(modifier = Modifier.height(24.dp))
            Card(modifier = Modifier.fillMaxWidth()) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "Registro pendiente",
                        style = MaterialTheme.typography.titleMedium
                    )
                    Text(text = "Gastos del día aún no registrados.")
                }
            }
            Spacer(modifier = Modifier.height(24.dp))
            Button(onClick = { /* Se implementará en una unidad posterior */ }) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "Agregar registros")
                    Text(text = "Prototipo inicial - Unidad 1")
                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun RegistroIncidenciasPreview() {
    RegistroIncidenciasTheme {
        RegistroIncidenciasApp()
    }
}