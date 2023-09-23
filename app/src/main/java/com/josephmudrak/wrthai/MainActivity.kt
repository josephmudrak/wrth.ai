package com.josephmudrak.wrthai

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.josephmudrak.wrthai.ui.theme.WrthaiTheme

class MainActivity : ComponentActivity()
{
	override fun onCreate(savedInstanceState: Bundle?)
    {
		super.onCreate(savedInstanceState)
		setContent()
        {
			WrthaiTheme()
            {
				// A surface container using the 'background' color from the theme
				Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background)
                {
					Welcome()
				}
			}
		}
	}
}

@Composable
fun Welcome(modifier: Modifier = Modifier)
{
	Row(
		horizontalArrangement = Arrangement.Center,
		modifier = modifier.padding(8.dp)
	)
	{
		Text(
			text = "wrth.ai",
			modifier = modifier,
			fontSize = 100.sp,
			lineHeight = 116.sp,
			textAlign = TextAlign.Center
		)
	}
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview()
{
	WrthaiTheme()
    {
		Welcome()
	}
}