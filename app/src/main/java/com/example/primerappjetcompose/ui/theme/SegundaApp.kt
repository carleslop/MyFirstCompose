package com.example.primerappjetcompose.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Preview(showBackground = true)
@Composable
fun segundaApp() {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (boxCentro, box1, box2, box3, box4, box5, box6, box7, box8) = createRefs()
        Box(modifier = Modifier
            .size(50.dp)
            .background(Color.Black)
            .constrainAs(boxCentro){
                top.linkTo(parent.top)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                bottom.linkTo(parent.bottom)
            })

        Box(modifier = Modifier
            .size(50.dp)
            .background(Color.Cyan)
            .constrainAs(box1){
                end.linkTo(boxCentro.start)
                bottom.linkTo(boxCentro.top)
            })

        Box(modifier = Modifier
            .size(50.dp)
            .background(Color.Cyan)
            .constrainAs(box2){
                start.linkTo(boxCentro.end)
                bottom.linkTo(boxCentro.top)
            })

        Box(modifier = Modifier
            .size(50.dp)
            .background(Color.Magenta)
            .constrainAs(box3){
                start.linkTo(boxCentro.start)
                end.linkTo(boxCentro.end)
                bottom.linkTo(box1.top)
            })

        Box(modifier = Modifier
            .size(50.dp)
            .background(Color.Cyan)
            .constrainAs(box4){
                start.linkTo(boxCentro.end)
                top.linkTo(boxCentro.bottom)
            })

        Box(modifier = Modifier
            .size(50.dp)
            .background(Color.Cyan)
            .constrainAs(box5){
                end.linkTo(boxCentro.start)
                top.linkTo(boxCentro.bottom)
            })

        Box(modifier = Modifier
            .size(50.dp)
            .background(Color.Magenta)
            .constrainAs(box6){
                end.linkTo(box5.start)
                top.linkTo(box5.bottom)
            })

        Box(modifier = Modifier
            .size(50.dp)
            .background(Color.Magenta)
            .constrainAs(box7){
                start.linkTo(box5.end)
                top.linkTo(box5.bottom)
            })

        Box(modifier = Modifier
            .size(50.dp)
            .background(Color.Magenta)
            .constrainAs(box8){
                start.linkTo(box4.end)
                top.linkTo(box5.bottom)
            })

    }
}