package com.example.scrollview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.scrollview.ui.theme.ScrollViewTheme
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ScrollViewTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainContent(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun MainContent(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.bird),
                contentDescription = "Верхнее изображение",
                modifier = Modifier.fillMaxSize()
            )
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = """
                    Травка зеленеет,
                    Солнышко блестит;
                    Ласточка с весною
                    В сени к нам летит.

                    С нею солнце краше
                    И весна милей...
                    Прощебечь с дороги
                    Нам привет скорей!

                    Дам тебе я зёрен,
                    А ты песню спой,
                    Что из стран далёких
                    Принесла с собой...
                    
                    Травка зеленеет,
                    Солнышко блестит;
                    Ласточка с весною
                    В сени к нам летит.

                    С нею солнце краше
                    И весна милей...
                    Прощебечь с дороги
                    Нам привет скорей!

                    Дам тебе я зёрен,
                    А ты песню спой,
                    Что из стран далёких
                    Принесла с собой...
                    
                    Травка зеленеет,
                    Солнышко блестит;
                    Ласточка с весною
                    В сени к нам летит.

                    С нею солнце краше
                    И весна милей...
                    Прощебечь с дороги
                    Нам привет скорей!

                    Дам тебе я зёрен,
                    А ты песню спой,
                    Что из стран далёких
                    Принесла с собой...
                    
                    Травка зеленеет,
                    Солнышко блестит;
                    Ласточка с весною
                    В сени к нам летит.

                    С нею солнце краше
                    И весна милей...
                    Прощебечь с дороги
                    Нам привет скорей!

                    Дам тебе я зёрен,
                    А ты песню спой,
                    Что из стран далёких
                    Принесла с собой...
                """.trimIndent(),
                fontSize = 20.sp,
                lineHeight = 28.sp,
                letterSpacing = 1.5.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .verticalScroll(rememberScrollState())
                    .padding(16.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainContentPreview() {
    ScrollViewTheme {
        MainContent()
    }
}
