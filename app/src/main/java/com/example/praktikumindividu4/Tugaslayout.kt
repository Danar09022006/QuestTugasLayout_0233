package com.example.praktikumindividu4

import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.praktikumindividu4.ui.theme.PraktikumIndividu4Theme

fun UserCardItem(
    @StringRes nameRes: Int,
    @StringRes addressRes: Int,
    @ColorRes containerColorRes: Int,
    modifier: Modifier = Modifier,
    @StringRes phoneRes: Int? = null,
    isCursiveName: Boolean = false,
    @DrawableRes logoRes: Int = R.drawable.logo_umy,
    logoSize: Dp = 100.dp
) {
    // Variabel gambar untuk menyimpan resource logo
    val gambar = painterResource(id = logoRes)

    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp, vertical = 7.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(id = containerColorRes)
        )
    )
    {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 9.dp),
            verticalAlignment = Alignment.CenterVertically
        )
        {
            Image(
                painter = gambar,
                contentDescription = stringResource(id = R.string.logo_desc),
                modifier = Modifier.size(logoSize)
            )

            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 15.dp)
            )
            {Text(
                text = stringResource(id = nameRes),
                color = colorResource(id = R.color.white),
                fontSize = if (isCursiveName) 17.sp else 19.sp,
                fontWeight = if (isCursiveName) FontWeight.Black else FontWeight.Bold,
                fontFamily = if (isCursiveName) FontFamily.SansSerif else FontFamily.SansSerif
            )
                if (phoneRes != null) {
                    Text(
                        text = stringResource(id = phoneRes),
                        color = colorResource(id = R.color.black),
                        fontSize = 14.sp,
                        modifier = Modifier.padding(top = 5.dp)
                    )


        }
                Text(
                    text = stringResource(id = addressRes),
                    color = colorResource(id = R.color.white),
                    fontSize = 14.sp,
                    modifier = Modifier.padding(top = 2.dp)
                )

    }
            Image(
                painter = gambar,
                contentDescription = stringResource(id = R.string.logo_desc),
                modifier = Modifier.size(logoSize)
            )
        }
    }
}

@Composable
fun TugasLayout(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize()
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){

                Text(
                    text = stringResource(id = R.string.header_title),
                    fontSize = 24.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = colorResource(id = R.color.black)
                )
            Text(
                text = stringResource(id = R.string.header_subtitle),
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
                color = colorResource(id = R.color.black),
                modifier = Modifier.padding(top = 4.dp)
            )
        }
}


