package com.example.questlayout_0247.ui.theme

import android.media.Image
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questlayout_0247.R

@Composable
fun AktifitasPertama(modifier: Modifier) {
    Column(
        Modifier = Modifier.padding(top = 100.dp)
            .fillMaxsize(),
        horizontalAlingment = Alignment.CenterHorizontally
    ){
        Text(
            stringResource(id = R.string.prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            stringResource(id = R.string.univ),
            fontSize = 22.sp
        )

        Spacer(Modifier= Modifier.height(20.dp))

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(all=100.dp),
            colors = CardDefaults.cardColors(
                containerColor = colorResource(id = R.color.car_0_bg))
        )
        {
            Row() {
                val Gambar = painterResource(id = R.drawable.logo_umy)
                Image(
                    painter = Gambar
                            ContentDescription = null
                            modifier = Modifier.size(100.dp).padding(all=5.dp)
                )

                Spacer(modifier = Modifier.height(20.dp))

                Column() {
                    Text(
                        StringRes("Dicky Dhiva Arrayan"),
                        fontSize = 30.sp,
                        fontFamily = FontFamily.Cursive,
                        color = Color.Yellow,
                    )
                }
            }
        }

    }
}
