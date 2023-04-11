package com.example.navigation.components.Modals

import android.view.MenuItem
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun MenuItem(icon: ImageVector, title: String, subtitle: String? = null, iconColor: Color? = null, iconBackground:Color? = null) {
    Box(
        modifier = Modifier.background(Color.White)
        .fillMaxWidth().padding(10.dp)
    ){
        Row(
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .clip(CircleShape)
                    .size(30.dp)
                    .background(iconBackground?:Color.White),
                contentAlignment = Alignment.Center
            ){
                    Icon(
                        imageVector = icon,
                        contentDescription = "Icon",
                        tint= iconColor?:Color.Yellow,
                        modifier = Modifier.size(25.dp)
                    )
            }
            Spacer(modifier = Modifier.width(30.dp))
            Column() {
                Text(
                    text = title,
                    fontSize = MaterialTheme.typography.h5.fontSize,
                    fontWeight = FontWeight.Medium,
                    color = Color.Black
                )
                if (subtitle != null) {
                    Text(
                        text = subtitle,
                        fontSize = MaterialTheme.typography.h6.fontSize,
                        fontWeight = FontWeight.Medium,
                        color = Color.Gray
                    )
                }
            }
        }
    }
}