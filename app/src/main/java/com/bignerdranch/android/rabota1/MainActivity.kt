package com.bignerdranch.android.rabota1

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawStyle
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bignerdranch.android.rabota1.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Rabota1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = GreenColor
                ) {
                        Row() {
                        TextView("")
                        IconView("")
                    }
                    Row() {
                        RoundedCornerShapeDemo()
                    }
                    Row {
                        Button()
                    }
                }
            }
        }
    }
    @Composable
    fun TextView(name: String) {
        Text("Список дел",
            color = White,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(20.dp)
        )

    }
    @Composable
    fun IconView(name: String){
        Image(
            painter = painterResource(id = R.drawable.avatar),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .offset(x = 150.dp, y = 15.dp)
                .size(60.dp)
        )
    }

    @Composable
    fun RoundedCornerShapeDemo(){
        ExampleBox(shape = RoundedCornerShape(20.dp), style = Stroke(width=30f))
    }

    @Composable
    fun ExampleBox(shape: RoundedCornerShape, style: DrawStyle) {
        Column(
            Modifier
                .fillMaxWidth()
                .wrapContentSize(Alignment.Center)){
            Spacer(modifier = Modifier.size(100.dp))
            Box(modifier = Modifier
                .size(360.dp, 100.dp)
                .clip(
                    RoundedCornerShape(
                        topStart = 30.dp,
                        topEnd = 0.dp,
                        bottomEnd = 30.dp,
                        bottomStart = 0.dp
                    )
                )
                .background(Orange)){
                Text(text = "Вечерний поход в кино", fontSize = 20.sp, color = White, fontWeight = FontWeight.Bold, modifier = Modifier.offset(x = 15.dp, y=15.dp))
                Text(text = "Идем в кино с коллегами!", fontSize = 14.sp, color = Gray, modifier = Modifier.offset(x=15.dp, y=50.dp))
                Text(text = "10.02.2021\n 19:40", fontSize = 14.sp, color = Gray, modifier = Modifier.offset(x=270.dp, y=25.dp))
            }
            Spacer(modifier = Modifier.size(20.dp))
            Box(modifier = Modifier
                .size(360.dp, 100.dp)
                .clip(
                    RoundedCornerShape(
                        topStart = 30.dp,
                        topEnd = 0.dp,
                        bottomEnd = 30.dp,
                        bottomStart = 0.dp
                    )
                )
                .background(Orange)){
                Row(){}
                Text(text = "Забрать заказ Ozon", fontSize = 20.sp, color = White, fontWeight = FontWeight.Bold, modifier = Modifier.padding(15.dp))
                Text(text = "Пункт выдачи на ул. Ленина, 103", fontSize = 14.sp, color = Gray, modifier = Modifier.offset(x=15.dp, y=50.dp))
                Text(text = "10.02.2021\n 19:40", fontSize = 14.sp, color = Gray, modifier = Modifier.offset(x=270.dp, y=25.dp))
            }
            Spacer(modifier = Modifier.size(20.dp))
            Box(modifier = Modifier
                .size(360.dp, 100.dp)
                .clip(
                    RoundedCornerShape(
                        topStart = 30.dp,
                        topEnd = 0.dp,
                        bottomEnd = 30.dp,
                        bottomStart = 0.dp
                    )
                )
                .background(Orange)){
                Text(text = "Запись в автосервис", fontSize = 20.sp, color = White, fontWeight = FontWeight.Bold, modifier = Modifier.padding(15.dp))
                Text(text = "Сдать автомобиль в автосервис на ул.\n" +
                        "Бисертская, д. 14. Замена масла", fontSize = 14.sp, color = Gray, modifier = Modifier.offset(x=15.dp, y=50.dp))
                Text(text = "10.02.2021\n 19:40", fontSize = 14.sp, color = Gray, modifier = Modifier.offset(x=270.dp, y=25.dp))
            }
        }

    }
    @Composable
    fun Button(){

        Text(text = "                         Добавить задачу", color = White, modifier = Modifier.offset(x = 50.dp, y= 500.dp).background(
            LightGreen).size(315.dp, 40.dp)
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        Rabota1Theme {
                TextView("")
                IconView("")
        }
    }
}