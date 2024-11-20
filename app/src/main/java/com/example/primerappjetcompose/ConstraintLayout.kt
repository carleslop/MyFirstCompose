package com.example.primerappjetcompose

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

@Preview
@Composable
fun ConstraintExample(){
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (boxRed, boxBlue, boxYellow, boxMagenta) = createRefs()
        Box(modifier = Modifier
            .size(125.dp)
            .background(Color.Red)
            .constrainAs(boxRed){
                top.linkTo(parent.top)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                bottom.linkTo(parent.bottom)
        })
        Box(modifier = Modifier
            .size(200.dp)
            .background(Color.Blue)
            .constrainAs(boxBlue){
                end.linkTo(boxRed.end)
                bottom.linkTo(boxRed.top)
            })
        Box(modifier = Modifier
            .size(75.dp)
            .background(Color.Yellow)
            .constrainAs(boxYellow){
                end.linkTo(boxBlue.start)
                top.linkTo(boxBlue.top)
                bottom.linkTo(boxBlue.bottom)
            })
        Box(modifier = Modifier
            .size(125.dp)
            .background(Color.Magenta)
            .constrainAs(boxMagenta){
                start.linkTo(boxBlue.end)
                top.linkTo(boxBlue.top)
            })
    }
}