package com.example.coffeemasters

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.coffeemasters.ui.theme.Alternative2


@Preview(showBackground = true)
@Composable
fun OffersPage() {
    Column(
       modifier = Modifier.verticalScroll(rememberScrollState())
    ) {
        Offer(title = "Early Coffee", description = "10% off. Offer valid from 6am to 9am.")
        Offer(title = "Welcome gift", description = "25% off on your first order.")
        Offer(title = "Welcome gift", description = "25% off on your first order.")
    }
}

//@Preview(showBackground = true, widthDp = 400)
//@Composable
//private fun Offer_Preview() {
//    Offers(title = "Offers", description = "New Offer")
//}



@Composable
fun Offer(title: String, description: String) {
    Box(modifier = Modifier
        .padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.background_pattern),
            contentDescription = "Background pattern",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp),
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {

            Text(
                text = title,
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.h5,
                modifier = Modifier
                    .background(Alternative2)
                    .padding(16.dp)

            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = description,
                style = MaterialTheme.typography.h6,
                modifier = Modifier
                    .background(Alternative2)
                    .padding(16.dp)


            )
    }

    }
}